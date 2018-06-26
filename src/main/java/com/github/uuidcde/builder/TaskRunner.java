package com.github.uuidcde.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskRunner {
    protected static Logger logger = LoggerFactory.getLogger(TaskRunner.class);

    public static TaskRunner of() {
        return new TaskRunner();
    }

    public TaskRunner run(Executable executable) {
        if (executable.getPushable()) {
            if (logger.isDebugEnabled()) {
                logger.debug(">>> push");
            }
        }

        executable.execute();

        return this;
    }
}
