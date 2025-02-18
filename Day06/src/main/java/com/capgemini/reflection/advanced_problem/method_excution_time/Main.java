package com.capgemini.reflection.advanced_problem.method_excution_time;

public class Main {
    public static void main(String[] args) {
        DemoClass demo = new DemoClass();

        // Measure execution time for both methods
        MethodTimer.measureExecutionTime(demo, "fastMethod");
        MethodTimer.measureExecutionTime(demo, "slowMethod");
    }
}
