package fr.smartest.plugin;

import fr.smartest.exceptions.ProductionToolException;

import java.util.List;

public interface ProductionTool extends Plugin{

    void setUp(String path);
    List<Module> getModules();
    void compile() throws ProductionToolException;

}
