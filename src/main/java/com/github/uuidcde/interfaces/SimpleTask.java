package com.github.uuidcde.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.uuidcde.CoreUtil;

public class SimpleTask implements Recordable {
    protected static Logger logger = LoggerFactory.getLogger(SimpleTask.class);

    public void record(String message) {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> record message: {}", CoreUtil.toJson(message));
        }
    }

    public String getMessage() {
        return "Hello, World";
    }
}
