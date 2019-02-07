package com.mitrais.rms.dao;

import com.mitrais.rms.model.User;

import java.util.Optional;

/**
 * Provides interface specific to {@link User} data
 */
public interface UserDao extends Dao<User, Long>{
    
    /**
     * Find {@link User} by its username
     * @param userName username
     * @param password password
     * @return user
     */
    Optional<User> findByUserData(String userName, String password);
}
