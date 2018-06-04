package fr.smartest.exceptions;

public class VCSException extends PluginException{

    public VCSException() {
    }

    public VCSException(String message) {
        super(message);
    }

    public VCSException(String message, Throwable cause) {
        super(message, cause);
    }

    public VCSException(Throwable cause) {
        super(cause);
    }

    public VCSException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
