package com.example.userwebflux.application.interfaces;

import com.example.userwebflux.domain.dto.UserNameDto;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface FindAllUserNames {
    Flux<UserNameDto> findAllUserNames();
}
