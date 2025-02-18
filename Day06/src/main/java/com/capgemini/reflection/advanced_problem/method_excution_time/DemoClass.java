package com.capgemini.reflection.advanced_problem.method_excution_time;

public class DemoClass {
    public void fastMethod() {
        System.out.println("Fast method executed.");
    }

    public void slowMethod() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Slow method executed.");
    }
}