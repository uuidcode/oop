package com.github.uuidcde.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricEngine implements Engine {
    protected static Logger logger = LoggerFactory.getLogger(ElectricEngine.class);

    public void refill() {
        logger.debug(">>> ElectricEngine refill");
    }
}
