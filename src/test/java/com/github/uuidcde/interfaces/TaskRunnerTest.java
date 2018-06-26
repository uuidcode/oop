package com.github.uuidcde.interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskRunnerTest {
    @Test
    public void test() {
        TaskRunner.of().run(new SimpleTask());
    }
}