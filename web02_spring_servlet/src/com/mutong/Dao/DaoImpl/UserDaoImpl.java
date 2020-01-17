package com.mutong.Dao.DaoImpl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mutong.Dao.UserDao;
import com.mutong.bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/16 13:02
 */
public class UserDaoImpl implements UserDao {
    private ComboPooledDataSource dataSource;

    public void setDataSource(ComboPooledDataSource dataSource) {
        this.dataSource = dataSource;
    }
    //    public void setDataSource(ComboPooledDataSource dataSource) {
//        UserDaoImpl.dataSource = dataSource;
//    }


//    static {
//    try {
//        dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssm_spring");
//        dataSource.setUser("root");
//        dataSource.setPassword("");
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
//    }
    @Override
    public User getUserByInfo(User user) {
        //通过数据库获取用户
        //连接数据库c3p0
        //使用dbutils操作数据库,查询并返回用户对象
        try {
                //使用dbutils操作数据库 查询并返回用户对象
                QueryRunner qr = new QueryRunner(dataSource);
                String sql = "select * from user where username = ? and password = ?";
                return qr.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;

    }



}
