package com.github.uuidcde.builder;

import static com.github.uuidcde.CoreUtil.createUUID;

import org.junit.Test;

public class TaskRunnerTest {
    @Test
    public void test() {
        SimpleTask simpleTask = SimpleTask.of()
            .setMessage(createUUID())
            .setExecutable(true)
            .setPushable(true);

        TaskRunner.of()
            .run(simpleTask)
            .run(DumpTask.of());
    }
}