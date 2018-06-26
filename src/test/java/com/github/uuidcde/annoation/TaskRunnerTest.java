package com.github.uuidcde.annoation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskRunnerTest {
    @Test
    public void test() {
        TaskRunner.of()
            .run(SimpleTask.of());
    }
}