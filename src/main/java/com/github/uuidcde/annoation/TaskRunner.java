package com.github.uuidcde.annoation;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskRunner {
    protected static Logger logger = LoggerFactory.getLogger(TaskRunner.class);
    public static TaskRunner of() {
        return new TaskRunner();
    }

    public TaskRunner run(Object object) {
        Task task = object.getClass().getDeclaredAnnotation(Task.class);

        if (task == null) {
            return this;
        }

        if (object instanceof Executable) {
            Executable executable = (Executable) object;
            executable.execute();
        }

        if (task.pushable()) {
            if (logger.isDebugEnabled()) {
                logger.debug(">>> push");
            }
        }

        return this;
    }
}
