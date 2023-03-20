package com.mycloud.repository;

import com.mycloud.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Mapper
public class MyBatisUserRepository implements UserRepository {

    private final SqlSessionTemplate sqlSessionTemplate;

    public MyBatisUserRepository(SqlSessionTemplate sessionTemplate){
        this.sqlSessionTemplate = sessionTemplate;
    }

    @Override
    public User saveUser(User user) {
        sqlSessionTemplate.insert("User.saveUser", user);
        return user;
    }

    @Override
    public Optional<User> findUserById(String userId) {
        return Optional.empty();
    }
}
