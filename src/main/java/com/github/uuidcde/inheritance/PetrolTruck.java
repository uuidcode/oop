package com.github.uuidcde.inheritance;

public class PetrolTruck extends Truck {
    @Override
    public void refill() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> PetrolTruck refill true");
        }

        super.refill();
    }
}
