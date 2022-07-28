package _23_Exceptions;

public class LimitExceededException extends Exception{
    public LimitExceededException(String message) {
        super(message);
    }
}
