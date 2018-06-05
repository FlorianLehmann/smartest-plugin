package fr.smartest.plugin;

import fr.smartest.exceptions.TestFrameworkException;

import java.util.List;
import java.util.Set;

public interface TestFramework extends Plugin {

    Set<TestReport> run(Set<Test> tests, List<Module> modules) throws TestFrameworkException;

}
