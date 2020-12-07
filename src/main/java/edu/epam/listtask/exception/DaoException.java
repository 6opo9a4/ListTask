package edu.epam.listtask.exception;

public class DaoException extends Exception{

    public DaoException(String message){
        super(message);
    }

    public DaoException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public DaoException(Throwable throwable) {
        super(throwable);
    }

    public String getErrorMessage(){
        return super.getMessage();
    }

}
