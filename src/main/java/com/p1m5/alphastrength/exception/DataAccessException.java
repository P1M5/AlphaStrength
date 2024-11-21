package com.p1m5.alphastrength.exception;

public class DataAccessException extends org.springframework.dao.DataAccessException {
    public DataAccessException(String msg) {
        super(msg);
    }
    public DataAccessException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
