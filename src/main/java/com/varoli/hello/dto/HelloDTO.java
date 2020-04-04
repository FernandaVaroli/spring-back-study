package com.varoli.hello.dto;

public class HelloDTO {
    private String message;

    public HelloDTO(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
