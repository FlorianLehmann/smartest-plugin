package fr.smartest.plugin;

import java.util.List;

public interface ProductionTool extends Plugin{

    List<Module> getModules();
    void compile();

}
