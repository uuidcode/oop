package com.github.uuidcde.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarBody implements Body {
    protected static Logger logger = LoggerFactory.getLogger(CarBody.class);

    public void load() {
        logger.debug(">>> CarBody load");
    }
}
