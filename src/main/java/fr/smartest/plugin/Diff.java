package fr.smartest.plugin;

import java.nio.file.Path;

public interface Diff {

     enum Status{
        ADDED,
        REMOVED,
        MODIFIED;
     }

     Status getStatus();
     Path getPath();
}
