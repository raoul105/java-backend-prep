package exception;

public class AccountNotFoundException extends RunTimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}