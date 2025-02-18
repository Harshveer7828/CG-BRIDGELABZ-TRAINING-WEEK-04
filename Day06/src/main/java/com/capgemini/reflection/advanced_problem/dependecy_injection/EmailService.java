package com.capgemini.reflection.advanced_problem.dependecy_injection;


public class EmailService implements Service {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Sent: " + message);
    }
}