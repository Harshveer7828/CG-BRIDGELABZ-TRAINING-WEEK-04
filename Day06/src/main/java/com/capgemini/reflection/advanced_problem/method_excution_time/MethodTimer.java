package com.capgemini.reflection.advanced_problem.method_excution_time;

import java.lang.reflect.Method;

public class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            long startTime = System.nanoTime(); // Start time
            method.invoke(obj); // Invoke method dynamically
            long endTime = System.nanoTime(); // End time

            long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Execution time of " + methodName + ": " + executionTime + " ms");
        } catch (Exception e) {
            System.out.println("Error executing method: " + e.getMessage());
        }
    }
}
