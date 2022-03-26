package com.example.userwebflux.domain.repository;

import com.example.userwebflux.domain.collection.UserName;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserNameRepository extends ReactiveMongoRepository<UserName, String> {
}
