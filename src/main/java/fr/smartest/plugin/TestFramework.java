package fr.smartest.plugin;

import fr.smartest.exceptions.TestFrameworkException;

import java.util.List;
import java.util.Set;

public interface TestFramework extends Plugin {

    void setUp(List<Module> modules);
    Set<TestReport> run(Set<Test> tests) throws TestFrameworkException;

}
