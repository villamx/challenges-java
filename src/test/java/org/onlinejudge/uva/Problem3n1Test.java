/*
 * Coding challenges in Java | Unit Testing
 */
package org.onlinejudge.uva;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for Problem3n1
 *
 * @author moises.villa
 */
public class Problem3n1Test {

    private final Problem3n1 instance = new Problem3n1();

    /**
     * Test of cycleLength method, of class Problem3n1.
     */
    @Test
    public void testCycleLength() {
        System.out.println("cycleLength");

        int number = 22;
        int expResult = 16;
        int result = instance.cycleLength(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxCycleLength method, of class Problem3n1.
     */
    @Test
    public void testMaxCycleLength() {
        System.out.println("maxCycleLength");

        int[][] pairs = {{1, 10}, {100, 200}, {201, 210}, {900, 1000}};
        int[] maxCycles = instance.maxCycleLength(pairs);

        assertEquals(20, maxCycles[0]);

        assertEquals(125, maxCycles[1]);

        assertEquals(89, maxCycles[2]);

        assertEquals(174, maxCycles[3]);

        /* TODO: add more cases to cover */
    }
}
