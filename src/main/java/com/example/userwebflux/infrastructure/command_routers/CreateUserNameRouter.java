package com.example.userwebflux.infrastructure.command_routers;

import com.example.userwebflux.application.useCase.CreateUserNameUseCase;
import com.example.userwebflux.domain.dto.UserNameDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreateUserNameRouter {

    @Bean
    public RouterFunction<ServerResponse> createUserRouterFunction(CreateUserNameUseCase createUserNameUseCase){
        return route(POST("api/createUserName/{length}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(createUserNameUseCase
                                .createUserName(Integer.valueOf(request.pathVariable("length"))), UserNameDto.class)));
    }
}
