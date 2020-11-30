package edu.epam.listtask.exeption;

public class DaoException extends Exception{

    public DaoException(String message){
        super(message);
    }

    public String getErrorMessage(){
        return super.getMessage();
    }
}
