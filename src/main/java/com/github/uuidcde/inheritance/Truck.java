package com.github.uuidcde.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck extends Vehicle {
    protected static Logger logger = LoggerFactory.getLogger(Truck.class);

    @Override
    public void load() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> truck load");
        }

        super.load();
    }
}
