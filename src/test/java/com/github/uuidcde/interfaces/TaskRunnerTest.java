package com.github.uuidcde.interfaces;

import org.junit.Test;

public class TaskRunnerTest {
    @Test
    public void test() {
        TaskRunner.of().run(new SimpleTask());
    }
}