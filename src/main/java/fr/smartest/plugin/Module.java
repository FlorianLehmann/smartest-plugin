package fr.smartest.plugin;

import java.nio.file.Path;

public interface Module {

    Path getSrcPath();
    Path getTestPath();
    Path getCompiledSrcPath();
    Path getCompiledTestPath();

}
