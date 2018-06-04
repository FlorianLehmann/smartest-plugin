package fr.smartest.plugin;

import java.util.Optional;

public interface TestReport {

    enum Status {
        SUCESSFUL,
        FAILURE,
        ABORTED
    }

    Test getTest();
    Status getResult();
    Optional<Throwable> getCause();

}
