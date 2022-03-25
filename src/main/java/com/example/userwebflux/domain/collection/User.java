package com.example.userwebflux.domain.collection;

import com.example.userwebflux.domain.valueObject.ConnectionStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(value = "users")
public class User {

    @Id
    private final String id;

    private final String userName;
    private final LocalDate timeStamp;
    private final ConnectionStatus connectionStatus;

}
