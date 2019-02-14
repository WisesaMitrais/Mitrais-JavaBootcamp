package com.mitrais.rms.service.impl;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;
import com.mitrais.rms.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = UserDaoImpl.getInstance();
    private User user;
    
    private UserServiceImpl() {
        //nothing.
    }

    @Override
    public User find(Long id) {
        Optional<User> user = userDao.find(id);
        return user.orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean save(String username, String userpass) {
        if(username.equals("") || username == null || 
                userpass.equals("") || userpass == null){
            return false;
        }else{
            user = new User(username, userpass);
            return userDao.save(user);
        }
    }

    @Override
    public boolean update(Long id, String username, String userpass) {
        if(username.equals("") || username == null || 
                userpass.equals("") || userpass == null){
            return false;
        }else{
            user = new User(id, username, userpass);
            return userDao.update(user);
        }
    }

    @Override
    public boolean delete(Long id) {
        return userDao.delete(id);
    }

    public static UserService getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final UserServiceImpl INSTANCE = new UserServiceImpl();
    }
}
