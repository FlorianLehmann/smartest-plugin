package fr.smartest.plugin;

import java.nio.file.Path;

public interface Module {

    /**
     * @return the source path of a module
     */
    Path getSrcPath();

    /**
     * @return the test path of a module
     */
    Path getTestPath();

    /**
     * @return the compiled source path of a module
     */
    Path getCompiledSrcPath();

    /**
     * @return the compiled tests path of a module
     */
    Path getCompiledTestPath();

}
