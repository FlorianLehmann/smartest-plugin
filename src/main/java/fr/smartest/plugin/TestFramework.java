package fr.smartest.plugin;

import fr.smartest.exceptions.TestFrameworkException;

import java.util.List;
import java.util.Set;

/**
 * Interface for the test framework part of the smartest core. Will be called to run the tests used in the current project
 */
public interface TestFramework extends Plugin {

    /**
     * Method called by the core to run all the selected tests in the different modules of the project
     * @param tests the set of tests the TestFramework needs to run
     * @param modules the list of modules in order to get information about the tests (compiled test sources...)
     * @return a set of test report for all the entry set.
     * @throws TestFrameworkException when an error related to the test framework occurs
     */
    Set<TestReport> run(Set<Test> tests, List<Module> modules) throws TestFrameworkException;

}
