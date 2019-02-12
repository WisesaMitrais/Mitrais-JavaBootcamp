package com.mitrais.rms.service.impl;

import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.dao.impl.UserDaoImpl;
import com.mitrais.rms.model.User;
import com.mitrais.rms.service.LoginService;

import java.util.Optional;

public class LoginServiceImpl implements LoginService {

    private UserDao userDao = UserDaoImpl.getInstance();

    @Override
    public boolean findUserData(String username, String userpass) {
        Optional<User> user = userDao.findByUserData(username, userpass);
        return user.isPresent();
    }

    public static LoginService getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final LoginServiceImpl INSTANCE = new LoginServiceImpl();
    }
}
