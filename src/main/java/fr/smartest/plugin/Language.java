package fr.smartest.plugin;

import java.util.List;
import java.util.Set;

public interface Language extends Plugin {

    void setUp();
    Set<Test> getTestsRelatedToChanges();
    void update(List<String> diff);
    void save();

}
