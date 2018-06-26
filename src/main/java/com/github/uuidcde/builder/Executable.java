package com.github.uuidcde.builder;

public interface Executable {
    default void execute() {
    }

    boolean getPushable();
    boolean getExecutable();
}
