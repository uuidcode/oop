package com.github.uuidcde.inheritance;

public class PetrolCar extends Car {
    @Override
    public void refill() {
        if (logger.isDebugEnabled()) {
            logger.debug(">>> PetrolCar refill true");
        }

        super.refill();
    }
}
