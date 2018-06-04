package fr.smartest.exceptions;

public class SmartestException extends Exception {
    public SmartestException() {
    }

    public SmartestException(String message) {
        super(message);
    }

    public SmartestException(String message, Throwable cause) {
        super(message, cause);
    }

    public SmartestException(Throwable cause) {
        super(cause);
    }

    public SmartestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
