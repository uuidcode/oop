package com.github.uuidcde.composition;

public class Vehicle {
    private Engine engine;
    private Body body;

    public Body getBody() {
        return this.body;
    }

    public Vehicle setBody(Body body) {
        this.body = body;
        return this;
    }
    public Engine getEngine() {
        return this.engine;
    }

    public Vehicle setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public void run() {
        this.engine.refill();
        this.body.load();
    }
}
