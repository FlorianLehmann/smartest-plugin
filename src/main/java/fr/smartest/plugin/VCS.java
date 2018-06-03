package fr.smartest.plugin;

import fr.smartest.exceptions.CommitFailureException;

import java.util.List;

public interface VCS extends Plugin {

    void commit(String message) throws CommitFailureException;
    List<String> diff() throws CommitFailureException;
    void checkout(String version);
    void update();

}
