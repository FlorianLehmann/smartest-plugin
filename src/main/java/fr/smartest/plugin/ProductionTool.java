package fr.smartest.plugin;

import fr.smartest.exceptions.ProductionToolException;

import java.nio.file.Path;
import java.util.List;

public interface ProductionTool extends Plugin{

    /**
     * This method is called to set up the plugin Language
     */
    void setUp(Path path);

    /**
     * Look for modules in project
     * @return all modules found in the project
     */
    List<Module> getModules();

    /**
     * Compile sources and tests of modules
     * @throws ProductionToolException
     */
    void compile() throws ProductionToolException;

}
