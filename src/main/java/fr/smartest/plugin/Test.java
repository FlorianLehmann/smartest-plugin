package fr.smartest.plugin;

/**
 * Interface representing a test, in order to identify and run it in the test framework
 */
public interface Test {

    /**
     * Enum representing the priority of a test
     */
    enum Priority implements Comparable<Priority> {
        HIGH(10),
        MEDIUM(5),
        LOW(2);

        private final int value;

        Priority(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * Get the associated test priority
     * @return the priority of the test
     */
    Priority getPriority();

    /**
     * Getter for the test name relative to the project.
     * Ex : com.foo.bar.Test
     * @return the test name
     */
    String getIdentifier();
}
