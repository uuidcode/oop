package com.github.uuidcde.annoation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Task(message = "Hello, World", pushable = true)
public class SimpleTask implements Executable {
    protected static Logger logger = LoggerFactory.getLogger(SimpleTask.class);

    public static SimpleTask of() {
        return new SimpleTask();
    }

    public void execute() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> execute");
        }
    }
}
