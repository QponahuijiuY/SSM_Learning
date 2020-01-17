package com.mutong.dao.daoImpl;

import com.mutong.bean.User;
import com.mutong.dao.UserDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/17 13:55
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Override
    //查询方法只能用query,返回值肯定是一个对象
    public User selectUserByid( int id) {
        String sql = "select * from user where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return this.getJdbcTemplate().queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        List list = getJdbcTemplate().query(sql,rowMapper);
        return list;
    }

    @Override
    public User addUser(User user) {
        String sql = "insert into user(id,username,password) values(?,?,?)";
        Object[] obj = new Object[]{
                user.getId(),user.getUsername(),user.getPassword()
        };
        getJdbcTemplate().update(sql,obj);
        return user;
    }


    @Override
    public User deleteUser(int id) {
        String sql = "delete from user where id = ?";
        getJdbcTemplate().update(sql,id);
        return null;
    }

    @Override
    public User updateUser(User user) {
        String sql = "update user set username = ? where id = ?";
        Object[] obj = new Object[]{
            user.getUsername(),
            user.getId(),
        };
        getJdbcTemplate().update(sql,obj);
        return user;
    }
}
