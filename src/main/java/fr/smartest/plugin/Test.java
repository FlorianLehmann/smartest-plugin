package fr.smartest.plugin;

import java.util.Comparator;

public interface Test {

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

    Priority getPriority();
    String getIdentifier();
}
