package com.microsservice_db.Exceptions;

public class ItemNotFoundException extends RuntimeException {
    /*example of an unchecked exception
    used for logical or programming errors e.g:
    - ArithmeticException
    - ArrayIndexOutOfBoundsException
    - ArrayStoreException
    - ClassCastException
    - IllegalArgumentException
    - Includes NumberFormatException
    - IllegalStateException
    - NullPointerException
    - NegativeArraySizeException
    - SecurityException
    - UnsupportedOperationException
    - ConcurrentModificationException
    - IllegalMonitorStateException
    - StringIndexOutOfBoundsException
    - TypeNotPresentException
    should extends RuntimeException*/
    
    
    public ItemNotFoundException(String message){
        super(message);
    }

}
