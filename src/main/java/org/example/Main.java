package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(TestExecution.class);
//        int testsRun = result.getRunCount();
//        int testsFailed = result.getFailureCount();
//
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//
//        System.out.println("Total tests run: " + testsRun);
//        System.out.println("Total tests failed: " + testsFailed);
//        System.out.println("All tests passed: " + result.wasSuccessful());
//        int stories = 8; // You can change this value to test different story counts
//        System.out.println("Number of arrangements for " + stories + " stories: " + Stories.countArrangements(stories));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of stories in the building:");
        int stories = scanner.nextInt();

        int arrangements = Stories.countArrangements(stories);
        System.out.println("Number of arrangements for " + stories + " stories: " + arrangements);

        scanner.close();
    }
}
