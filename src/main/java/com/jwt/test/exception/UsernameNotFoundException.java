package com.jwt.test.exception;

public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(String msg, Throwable t){
        super(msg, t);
    }
    public UsernameNotFoundException(String msg){
        super(msg);
    }
    public UsernameNotFoundException(){
        super();
    }
}