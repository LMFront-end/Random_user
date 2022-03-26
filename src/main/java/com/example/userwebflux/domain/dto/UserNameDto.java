package com.example.userwebflux.domain.dto;

import com.example.userwebflux.domain.valueObject.ConnectionStatus;
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
    private String value;
    private LocalDate timeStamp;

}
