package com.example.userwebflux.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNameDto {

    private String id;

    @NotBlank
    private String userName;
    private String userEmail;
    private String userWasBorn;
    private String userPhone;
    private String userPassword;
    private LocalDate timeStamp;

}
