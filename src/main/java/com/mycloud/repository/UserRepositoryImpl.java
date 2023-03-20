package com.mycloud.repository;

import com.mycloud.domain.User;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    DataSource dataSource;

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Optional<User> findUserById(String userId) {
        return Optional.empty();
    }
}
