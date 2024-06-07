/*
*
* Building Stories

An industrial building is being divided up and converted into apartments. A large apartment takes up two stories of the building, and a small apartment takes up one story.

Write a function that, given the number of stories in the building, calculates the number of different possible arrangements of apartments.

For example, if the building is three stories high it can accommodate three different possible arrangements of apartments: small-small-small, small-large, and large-small.
* */
package org.example;

// Stories.java
public class Stories {

    public static int countArrangements(int stories) {
        if (stories < 0) {
            return 0;
        } else if (stories == 0) {
            return 1;
        } else if (stories == 1) {
            return 1;
        } else {
            return countArrangements(stories - 1) + countArrangements(stories - 2);
        }
    }
}

