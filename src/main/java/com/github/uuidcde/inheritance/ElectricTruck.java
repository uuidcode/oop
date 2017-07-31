package com.github.uuidcde.inheritance;

public class ElectricTruck extends Truck {
    @Override
    public void refill() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> ElectricTruck refill true");
        }

        super.refill();
    }
}
