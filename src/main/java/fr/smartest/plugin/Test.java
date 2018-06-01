package fr.smartest.plugin;

public interface Test {

    enum Priority {
        HIGH,
        MEDIUM,
        LOW
    }

    Priority getPriority();
    String getIdentifier();
}
