package org.example;// TestExecution.java
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestExecution {

//    @Test
//    public void testZeroStories() {
//        assertEquals(1, Stories.countArrangements(0));
//    }
//
//    @Test
//    public void testOneStory() {
//        assertEquals(1, Stories.countArrangements(1));
//    }
//
//    @Test
//    public void testTwoStories() {
//        assertEquals(2, Stories.countArrangements(2));
//    }
//
//    @Test
//    public void testThreeStories() {
//        assertEquals(3, Stories.countArrangements(3));
//    }
//
    @Test
    public void testFourStories() {
        assertEquals(5, Stories.countArrangements(4));
    }

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
