/*
 * Coding challenges in Java | Unit Testing
 */
package sequence.binarydigits;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for Fibonacci.java
 * <br>Refer to this for more data
 * www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
 *
 * @author m.villa.martinez
 */
public class FibonacciTest {

    /**
     * Test of series method, of class Fibonacci.
     */
    @Test
    public void testSeries() {
        System.out.println("series");

        int n = 3;
        Fibonacci instance = new Fibonacci();
        int expResult = 3;
        int result = instance.series(n);

        assertEquals(expResult, result);
    }

}
