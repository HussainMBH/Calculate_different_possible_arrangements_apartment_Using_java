package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestExecution.class);
        int testsRun = result.getRunCount();
        int testsFailed = result.getFailureCount();

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Total tests run: " + testsRun);
        System.out.println("Total tests failed: " + testsFailed);
        System.out.println("All tests passed: " + result.wasSuccessful());
    }
}
