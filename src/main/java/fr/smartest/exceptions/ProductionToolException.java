package fr.smartest.exceptions;

public class ProductionToolException extends PluginException {

    public ProductionToolException() {
    }

    public ProductionToolException(String message) {
        super(message);
    }

    public ProductionToolException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductionToolException(Throwable cause) {
        super(cause);
    }

    public ProductionToolException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
