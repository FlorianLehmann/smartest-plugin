package fr.smartest.plugin;

import fr.smartest.exceptions.VCSException;

import java.nio.file.Path;
import java.util.Set;

/**
 * Interface for the VCS part of the smartest core. Will be called to perform actions on the VCS used in the current project
 */
public interface VCS extends Plugin {

    /**
     * Method called to setup the VCS plugin for the current project
     * @param VCSpath the path to the folder containing the VCS project root
     * @param projectPath the path to the root folder of the project
     */
    void setUp(Path VCSpath, Path projectPath);

    /**
     * Method called by the smartest core to perform a commit after tests were performed
     * @param message the message wanted for the commit
     * @throws VCSException when the commit failed, or any malfunctioning occurs related to the VCS plugin
     */
    void commit(String message) throws VCSException;

    /**
     * Method called to get all the differences between the current state and the last commit on the project
     * @return return a list of diff representing the added, modified or deleted file between now and the last commit
     * @throws VCSException when the diff failed, or any malfunctioning occurs related to the VCS plugin
     */
    Set<Diff> diff() throws VCSException;

    void checkout(String version);
    void update();

}
