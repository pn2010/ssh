package com.itheima.Dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.Dao.UserDao;
import com.itheima.domain.User;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public User findById(Integer id) {
          
        return getHibernateTemplate().get(User.class, id);
    }

}
  
