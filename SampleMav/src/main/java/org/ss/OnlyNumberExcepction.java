package org.ss;



public class OnlyNumberExcepction extends Throwable {
    @Override
    public String getMessage() {
    String message="only number exception";
    return message;
    }
	

}
