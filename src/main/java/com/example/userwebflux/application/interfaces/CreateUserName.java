package com.example.userwebflux.application.interfaces;

import com.example.userwebflux.domain.dto.UserNameDto;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface CreateUserName {
    Mono<UserNameDto> createUserName(Integer length);
}
