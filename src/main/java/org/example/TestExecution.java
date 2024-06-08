package org.example;// TestExecution.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExecution {
    public static void main(String[] args) {
        testCountArrangements();
    }

    public static void testCountArrangements() {
        int[] testCases = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResults = {1, 1, 2, 3, 5, 8, 13, 21, 34};

        boolean allTestsPassed = true;

        for (int i = 0; i < testCases.length; i++) {
            int result = Stories.countArrangements(testCases[i]);
            if (result != expectedResults[i]) {
                System.out.println("Test failed for " + testCases[i] + " stories. Expected " + expectedResults[i] + " but got " + result);
                allTestsPassed = false;
            }
        }

        if (allTestsPassed) {
            System.out.println("All tests passed.");
        }
    }
}


