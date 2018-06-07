package fr.smartest.plugin;

import java.nio.file.Path;

public interface Diff {

     enum Status{
        ADDED,
        REMOVED,
        MODIFIED;
     }

    /**
     * return the Status of the change (i.e Added, removed or modified)
     * @return Status
     */
     Status getStatus();

    /**
     *
     * @return a Path of the file change
     */
    Path getPath();

    /**
     *
     * @return the content of the file before the current state
     */
    String getOldContent();

    /**
     *
     * @return the content of the file now
     */
    String getNewContent();
}
