package fr.smartest.plugin;

import fr.smartest.exceptions.VCSException;

import java.nio.file.Path;
import java.util.Set;

public interface VCS extends Plugin {

    void setUp(Path VCSpath, Path projectPath);
    void commit(String message) throws VCSException;
    Set<Diff> diff() throws VCSException;
    void checkout(String version);
    void update();

}
