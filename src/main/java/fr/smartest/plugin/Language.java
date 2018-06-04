package fr.smartest.plugin;

import java.util.List;
import java.util.Set;

public interface Language extends Plugin {

    void setUp(List<Module> modules);
    Set<Test> getTestsRelatedToChanges(String scope);
    void update(List<String> diff);
    void save();

}
