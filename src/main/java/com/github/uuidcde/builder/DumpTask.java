package com.github.uuidcde.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DumpTask implements Executable {
    protected static Logger logger = LoggerFactory.getLogger(DumpTask.class);

    public static DumpTask of() {
        return new DumpTask();
    }

    @Override
    public boolean getPushable() {
        return false;
    }

    @Override
    public void execute() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> execute");
        }
    }
}
