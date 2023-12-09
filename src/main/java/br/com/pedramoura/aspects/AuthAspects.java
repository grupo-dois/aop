package br.com.pedramoura.aspects;

import br.com.pedramoura.auth.RegisterRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


public class AuthAspects {


    public void logAddUser(RegisterRequest user) {
        System.out.println(user.getEmail());
    }
}
