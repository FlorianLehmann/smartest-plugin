package fr.smartest.plugin;

import fr.smartest.exceptions.ProductionToolException;

import java.nio.file.Path;
import java.util.List;

public interface ProductionTool extends Plugin{

    void setUp(Path path);
    List<Module> getModules();
    void compile() throws ProductionToolException;

}
