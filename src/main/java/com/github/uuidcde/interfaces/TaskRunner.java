package com.github.uuidcde.interfaces;

public class TaskRunner {
    public static TaskRunner of() {
        return new TaskRunner();
    }

    public void run(Task task) {
        if (task instanceof Executable) {
            Executable executable = (Executable) task;
            executable.execute();
        } else if (task instanceof Pushable) {
            Pushable pushable = (Pushable) task;
            pushable.push();
        } else if (task instanceof Recordable) {
            Recordable recordable = (Recordable) task;
            recordable.record(recordable.getMessage());
        }
    }
}
