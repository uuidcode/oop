package com.github.uuidcde.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetrolEngine implements Engine {
    protected static Logger logger = LoggerFactory.getLogger(PetrolEngine.class);

    public void refill() {
        logger.debug(">>> PetrolEngine refill");
    }
}
