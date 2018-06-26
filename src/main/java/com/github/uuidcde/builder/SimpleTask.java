package com.github.uuidcde.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.uuidcde.CoreUtil;

public class SimpleTask implements Executable {
    protected static Logger logger = LoggerFactory.getLogger(SimpleTask.class);

    private String message;
    private boolean pushable;
    private boolean executable;

    public boolean getExecutable() {
        return this.executable;
    }

    public SimpleTask setExecutable(boolean executable) {
        this.executable = executable;
        return this;
    }

    public boolean getPushable() {
        return this.pushable;
    }

    public SimpleTask setPushable(boolean pushable) {
        this.pushable = pushable;
        return this;
    }

    public static SimpleTask of() {
        return new SimpleTask();
    }

    public String getMessage() {
        return this.message;
    }

    public SimpleTask setMessage(String message) {
        this.message = message;
        return this;
    }

    public void execute() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> execute message: {}", CoreUtil.toJson(message));
        }
    }
}
