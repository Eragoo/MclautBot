package com.Eragoo.MclautBot.error;

public class UnexpectedCommandException extends RuntimeException {
    public UnexpectedCommandException(String message) {
        super(message);
    }
}

