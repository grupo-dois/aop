package br.com.pedramoura.aspects;

import br.com.pedramoura.user.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log
@Slf4j
public class AuthAspects {


    @Before("execution(* br.com.pedramoura.user.UserController.createUser(..)) && args(user)")
    public void logAddUser(User user) {
        log.info("Adicionando um usuário: " + user.getName());
    }

    @Around("execution(* br.com.pedramoura.user.UserController.getUserById(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        log.info(joinPoint.getSignature() + " executado em " + (endTime - startTime) + " ms");
        return result;
    }

    @After("execution(* br.com.pedramoura.user.UserController.getAllUsers(..))")
    public void logListUser() {
        log.info("Listando todos os usuários");
    }
}
