/*
 * Coding challenges in Java | Unit Testing
 */
package interview.elppa.pretest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for MaxAbs.java
 *
 * @author m.villa.martinez
 */
public class MaxAbsTest {

    private final MaxAbs instance = new MaxAbs();

    /**
     * Test of maxAbs method, of class MaxAbs.
     */
    @Test
    public void testMaxAbsSingleK() {
        System.out.println("maxAbs single K");

        int[] A = {4, 3, 2, 5, 1, 1};
        int expResult = 4;
        int result = instance.maxAbs(A, 3);
        assertEquals(expResult, result);
    }

    /**
     * Test of maxAbs method, of class MaxAbs.
     */
    @Test
    public void testMaxAbsMultitpleK() {
        System.out.println("maxAbs multitple K");

        int[] A = {1, 3, -3};
        int expResult = 6;
        int result = instance.maxAbs(A, 0, 1);
        assertEquals(expResult, result);
    }

}
