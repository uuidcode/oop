package com.github.uuidcde.interfaces;

public interface Recordable extends Task {
    void record(String message);
    String getMessage();
}
