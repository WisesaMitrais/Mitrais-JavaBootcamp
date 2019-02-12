package com.mitrais.rms.service;

import com.mitrais.rms.model.User;

import java.util.List;

public interface UserService {

    User find(Long id);

    List<User> findAll();

    boolean save(String username, String userpass);

    boolean update(Long id, String username, String userpass);

    boolean delete(Long id);
}
