package fr.smartest.plugin;

public interface Plugin {

    /**
     * @param identifier
     * @return true if the language is supported by the plugin and false otherwise.
     */
    boolean accept(String identifier);

}
