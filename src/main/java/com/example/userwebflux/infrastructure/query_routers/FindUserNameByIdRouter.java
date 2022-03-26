package com.example.userwebflux.infrastructure.query_routers;

import com.example.userwebflux.application.useCase.FindUserNameByIdUseCase;
import com.example.userwebflux.domain.dto.UserNameDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class FindUserNameByIdRouter {

    @Bean
    public RouterFunction<ServerResponse> findUserNameByIdRouterFunction(FindUserNameByIdUseCase findUserNameByIdUseCase){
        return route(GET("api/userName/{id}"),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findUserNameByIdUseCase.findById(request.pathVariable("id")), UserNameDto.class))
        );
    }
}
