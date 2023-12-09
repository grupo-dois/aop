package br.com.pedramoura.error;

import lombok.Data;

@Data
public class UserAlreadyExists {

    private UserAlreadyExists(){}

    private String message;
}
