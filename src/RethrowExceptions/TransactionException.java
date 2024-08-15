package RethrowExceptions;

public class TransactionException extends Exception{
    TransactionException(String message,Throwable cause){
        super(message,cause);
    }
}
