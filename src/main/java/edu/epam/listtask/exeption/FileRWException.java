package edu.epam.listtask.exeption;

public class FileRWException extends Exception{

    public FileRWException(String message){
        super(message);
    }

    public String getErrorMessage(){
        return super.getMessage();
    }
}
