package com.mycloud.repository;

import com.mycloud.domain.User;

import java.util.Optional;

public interface UserRepository {

    User saveUser(User user);
    Optional<User> findUserById(String userId);

}
