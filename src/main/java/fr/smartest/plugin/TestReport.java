package fr.smartest.plugin;

import java.util.Optional;

public interface TestReport {

    enum Status {
        SUCESSFUL,
        FAILURE,
        ABORTED
    }

    Status getResult();
    Optional<Exception> getException();

}
