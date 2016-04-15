/*
 * I remember this from School, do you? https://en.wikipedia.org/wiki/Fibonacci_word
 */
package sequence.binarydigits;

/**
 * This is how I resolved the Fibonacci Series. Please refer to another solution
 * www.programmingsimplified.com/c-program-generate-fibonacci-series
 *
 * @author moises.villa
 */
public class Fibonacci {

    public int series(int n) {

        int count = 0;
        int prev, current = 0, next = 0;

        /* Would be a valid recursion? **/
        while (n > 0 && count < n) {
            prev = current;

            System.out.println(current);

            current = next;
            count++;

            if (count <= 1) {
                next = current = 1;
            } else {
                next = prev + current;
            }
        }

        return count;
    }

}
