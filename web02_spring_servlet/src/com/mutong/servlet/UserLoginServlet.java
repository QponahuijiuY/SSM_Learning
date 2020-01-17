package com.mutong.servlet;

import com.mutong.Service.UserService;
import com.mutong.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/15 22:13
 */
@WebServlet("/userLogin")
public class UserLoginServlet extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //1.接收表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
       //2.封装成User对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //3.通过容器获取userService
        UserService userService ;
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userService = (UserService) applicationContext.getBean("userService");
        //3.调用service方法验证用户
        User loginuser = userService.getUserByInfo(user);
        //4.根据用户验证结果进行操作
        if (loginuser == null){
            request.setAttribute("errorMsg","用户名或密码错误");
            request.getRequestDispatcher("/login_page.jsp").forward(request,response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("user",loginuser);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
        //5.验证成功登陆,重定向到index.jsp
        //6.验证失败,转发到login_page.jsp
    }
}
