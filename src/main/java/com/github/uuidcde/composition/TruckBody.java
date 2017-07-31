package com.github.uuidcde.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TruckBody implements Body {
    protected static Logger logger = LoggerFactory.getLogger(TruckBody.class);

    public void load() {
        logger.debug(">>> TruckBody load");
    }
}
