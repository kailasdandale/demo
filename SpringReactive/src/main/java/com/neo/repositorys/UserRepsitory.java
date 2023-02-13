package com.neo.repositorys;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.neo.eitity.User;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepsitory  extends ReactiveCrudRepository<User, Integer>{

    Mono<Void> deleteByFirstName(String firstName);
}
