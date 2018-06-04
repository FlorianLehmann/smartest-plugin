package fr.smartest.plugin;

public interface Diff {

     enum Status{
        ADDED,
        REMOVED,
        MODIFIED;
     }

     Status getStatus();
     String getPath();
}
