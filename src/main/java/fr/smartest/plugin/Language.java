package fr.smartest.plugin;

import java.util.List;
import java.util.Set;

public interface Language extends Plugin {

    /**
     * This method is called to set up the plugin Language
     * @param modules
     */
    void setUp(List<Module> modules);

    /**
     * Get the tests related to change according to a scope (Class, method) and a diff
     * which contains the changes
     * @param scope
     * @param diff provided by VCS plugin
     * @return
     */
    Set<Test> getTestsRelatedToChanges(String scope, Set<Diff> diff);

    /**
     * This method is called before smartest exist in order to save what it need to be save.
     */
    void save();

}
