package fr.smartest.exceptions;

public class TestFrameworkException extends PluginException {
    public TestFrameworkException() {
    }

    public TestFrameworkException(String message) {
        super(message);
    }

    public TestFrameworkException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestFrameworkException(Throwable cause) {
        super(cause);
    }

    public TestFrameworkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
