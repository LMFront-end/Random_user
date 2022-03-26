package com.example.userwebflux.application.useCase;

import com.example.userwebflux.application.interfaces.FindUserNameById;
import com.example.userwebflux.application.mappers.UserNameMapper;
import com.example.userwebflux.domain.dto.UserNameDto;
import com.example.userwebflux.domain.repository.UserNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FindUserNameByIdUseCase implements FindUserNameById {

    private final UserNameRepository userNameRepository;
    private final UserNameMapper userNameMapper;

    @Override
    public Mono<UserNameDto> findById(String id) {
        return userNameRepository.findById(id).map(userNameMapper.mapToDto());
    }
}
