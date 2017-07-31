package com.github.uuidcde.inheritance;

public class ElectgriclCar extends Car {
    @Override
    public void refill() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> ElectgriclCar refill true");
        }

        super.refill();
    }
}
