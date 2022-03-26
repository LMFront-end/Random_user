package com.example.userwebflux.domain.collection;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(value = "usernames")
public class UserName {

    @Id
    private final String id;

    private final String userName;
    private final String userEmail;
    private final String userWasBorn;
    private final String userPhone;
    private final String userPassword;
    private final LocalDate timeStamp;
}
