package com.chenzt.shoppingbackend.exception;

/**
 *
 * @author chenzt
 *
 */
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 767965080280569449L;

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }
}
