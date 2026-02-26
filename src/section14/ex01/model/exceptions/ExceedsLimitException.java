package section14.ex01.model.exceptions;

public class ExceedsLimitException extends RuntimeException {
    public ExceedsLimitException(String message) {
        super(message);
    }
}
