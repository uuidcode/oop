package com.github.uuidcde.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Vehicle {
    protected static Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void load() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> car load");
        }

        super.load();
    }
}
