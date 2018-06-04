package fr.smartest.plugin;

import fr.smartest.exceptions.VCSException;

import java.util.Set;

public interface VCS extends Plugin {

    void setUp(String VCSpath);
    void commit(String message) throws VCSException;
    Set<Diff> diff() throws VCSException;
    void checkout(String version);
    void update();

}
