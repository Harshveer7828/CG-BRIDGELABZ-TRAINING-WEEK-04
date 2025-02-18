package com.capgemini.reflection.advanced_problem.method_execution_time;

import com.capgemini.reflection.advanced_problem.method_excution_time.DemoClass;
import com.capgemini.reflection.advanced_problem.method_excution_time.MethodTimer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodTimerTest {

    @Test
    public void testFastMethodExecutionTime() {
        DemoClass demo = new DemoClass();
        long startTime = System.nanoTime(); // Record start time

        MethodTimer.measureExecutionTime(demo, "fastMethod");

        long endTime = System.nanoTime(); // Record end time
        long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds

        // Ensure the execution time is within a reasonable range
        assertTrue(executionTime < 100, "Fast method should take less than 100 ms");
    }

    @Test
    public void testSlowMethodExecutionTime() {
        DemoClass demo = new DemoClass();
        long startTime = System.nanoTime(); // Record start time

        MethodTimer.measureExecutionTime(demo, "slowMethod");

        long endTime = System.nanoTime(); // Record end time
        long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds

        // Ensure the execution time is within a reasonable range
        assertTrue(executionTime >= 1000, "Slow method should take at least 1000 ms");
    }


}
