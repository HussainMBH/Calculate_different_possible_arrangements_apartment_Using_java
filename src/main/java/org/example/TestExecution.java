package org.example;// TestExecution.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestExecution {

    @Test
    public void testCountArrangements() {
        assertEquals(1, Stories.countArrangements(0));
        assertEquals(1, Stories.countArrangements(1));
        assertEquals(2, Stories.countArrangements(2));
        assertEquals(3, Stories.countArrangements(3));
        assertEquals(5, Stories.countArrangements(4));
        assertEquals(8, Stories.countArrangements(5));
    }
}

