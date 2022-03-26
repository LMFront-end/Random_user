package com.example.userwebflux.application.useCase;

import com.example.userwebflux.application.interfaces.FindAllUserNames;
import com.example.userwebflux.application.mappers.UserNameMapper;
import com.example.userwebflux.domain.dto.UserNameDto;
import com.example.userwebflux.domain.repository.UserNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class FindAllUserNamesUseCase implements FindAllUserNames {

    private final UserNameRepository userNameRepository;
    private final UserNameMapper userNameMapper;

    @Override
    public Flux<UserNameDto> findAllUserNames() {
        return userNameRepository.findAll().map(userNameMapper.mapToDto());
    }
}
