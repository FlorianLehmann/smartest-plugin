package fr.smartest.plugin;

import java.util.List;
import java.util.Set;

public interface TestFramework extends Plugin {

    List<TestReport> Run(Set<Test> tests);


}
