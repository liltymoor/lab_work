package Exceptions;

public class UnluckException extends RuntimeException{
    public UnluckException(String unluckMove) {
        super(unluckMove);
    }
}
