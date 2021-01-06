package com.chenzt.shoppingbackend.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author chenzt
 */
public class UnitError {

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String field;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String message;

    public UnitError(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
