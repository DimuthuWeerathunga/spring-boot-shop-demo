package com.dimuthu.shop.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException( String message) {
        super(message );
    }
}
