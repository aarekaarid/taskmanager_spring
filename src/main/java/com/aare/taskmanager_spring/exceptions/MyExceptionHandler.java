package com.aare.taskmanager_spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<Object> handleApplicationException(ApplicationException e) {
        System.out.println("Status code: 400");  //kliendi viga ei ole mõtet logisse panna; 400 on piisav
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()),
                HttpStatus.BAD_REQUEST);    //see rida määrab, et kliendile tagastatakse 400
    }
}
