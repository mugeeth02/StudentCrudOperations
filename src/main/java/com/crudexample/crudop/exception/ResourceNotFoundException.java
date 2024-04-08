package com.crudexample.crudop.exception;


public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String Error){
        super(Error);
    }
}