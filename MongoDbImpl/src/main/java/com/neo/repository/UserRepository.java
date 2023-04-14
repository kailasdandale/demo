package com.neo.repository;

import com.neo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{'username':?0}")
    User findByUsername(String username);

    void deleteByUsername(String username);

    @Query("{'email':?0,'username':?1}")
    List<User> findByEmailAndUsername(String email, String username);
}
