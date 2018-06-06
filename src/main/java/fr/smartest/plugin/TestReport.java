package fr.smartest.plugin;

import java.util.Optional;

/**
 * Interface representing a test report, in order to display result of a test to the user
 */
public interface TestReport {

    /**
     * Enum representing the status of the associated test
     */
    enum Status {
        SUCESSFUL,
        FAILURE,
        ABORTED
    }

    /**
     * Getter for the associated test
     * @return the associated test
     */
    Test getTest();

    /**
     * Getter for the result status of the test
     * @return the associated result status
     */
    Status getResult();

    /**
     * Getter for the cause of the failure for the associated test. Only available when a test failed
     * @return the cause of the failure
     */
    Optional<Throwable> getCause();

}
