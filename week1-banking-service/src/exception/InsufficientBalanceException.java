package exception;

public class InsufficientBalanceException extends RunTimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}