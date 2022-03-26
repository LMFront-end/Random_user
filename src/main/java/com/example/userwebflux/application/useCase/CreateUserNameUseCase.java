package com.example.userwebflux.application.useCase;

import com.example.userwebflux.application.interfaces.CreateUserName;
import com.example.userwebflux.application.mappers.UserNameMapper;
import com.example.userwebflux.application.utils.RandomStringGenerator;
import com.example.userwebflux.domain.dto.UserNameDto;
import com.example.userwebflux.domain.repository.UserNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateUserNameUseCase implements CreateUserName {

    private final UserNameRepository userNameRepository;
    private final UserNameMapper userNameMapper;
    private final RandomStringGenerator randomStringGenerator;

    @Override
    public Mono<UserNameDto> createUserName(Integer length, UserNameDto userNameDto) {
        return userNameRepository
                .save(userNameMapper.mapToNewCollection()
                        .apply(randomStringGenerator.generateString(length), userNameDto))
                .map(userNameMapper.mapToDto());
    }
}
