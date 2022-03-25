package com.example.userwebflux.domain.repository;

import com.example.userwebflux.domain.collection.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRespository extends ReactiveMongoRepository<User, String> {
}
