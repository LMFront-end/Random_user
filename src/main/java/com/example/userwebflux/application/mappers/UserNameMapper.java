package com.example.userwebflux.application.mappers;

import com.example.userwebflux.application.utils.RandomStringGenerator;
import com.example.userwebflux.domain.collection.UserName;
import com.example.userwebflux.domain.dto.UserNameDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.function.Function;

@Component
public class UserNameMapper {

    private final RandomStringGenerator randomStringGenerator = new RandomStringGenerator();

    public Function<UserName, UserNameDto> mapToDto(){
        return userName -> new UserNameDto(
                userName.getId(),
                userName.getUserName(),
                userName.getUserEmail(),
                userName.getUserWasBorn(),
                userName.getUserPhone(),
                userName.getUserPassword(),
                userName.getTimeStamp());
    }

    public Function<UserNameDto, UserName> mapToNewCollection(){
        return userName -> new UserName(
                userName.getId(),
                userName.getUserName(),
                userName.getUserEmail(),
                userName.getUserWasBorn(),
                userName.getUserPhone(),
                userName.getUserPassword(),
                LocalDate.now());
    }
}
