package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.Dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User findById(Integer id) {
          
        return userDao.findById(id);
    }

}
  
