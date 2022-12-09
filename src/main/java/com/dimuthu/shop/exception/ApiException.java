package com.dimuthu.shop.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public record ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
}
//look up oracle docs for record specifications


//@Data //this annotation will produce required arg constructor setters getters toString hashcode and equals
//public class ApiException {
//    private final String message;
//    private final Throwable throwable;
//    private final HttpStatus httpStatus;
//    private final ZonedDateTime zonedDateTime;
//}