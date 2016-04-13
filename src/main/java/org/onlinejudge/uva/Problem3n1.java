/*
 * Coding challenges in Java
 * https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=29&page=show_problem&problem=36
 */
package org.onlinejudge.uva;

/**
 * The 3n + 1 problem
 *
 * @author moises.villa
 */
public class Problem3n1 {

    /**
     * Cycle-length of N. Given the input 22, the following sequence of numbers
     * will be printed 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
     *
     * @param n
     * @return
     */
    public int cycleLength(int n) {
        /* 1. input n */

        // 2. print n
        /* 3. if n = 1 then STOP */
        if (n == 1) {
            return 0;
        }

        int cycles = 1;

        while (n != 1) {
            /* 4. if n is odd then n <-- 3n + 1 */
            if (n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                /* 5. else n <-- n/2 */
                n /= 2;
            }
            cycles++;
        }
        /* 6. GOTO 2 */

        return cycles;
    }

    /**
     * For any two numbers i and j you are to determine the maximum cycle length
     * over all numbers between i and j.
     *
     * @param i
     * @param j
     * @return
     */
    public int maxCycleLength(int i, int j) {
        int tempi = i, tempj = j;

        if (i > j) {
            j = tempi;
            i = tempj;
        }

        int maxCycles = 0, cycleLength;

        while (i <= j) {
            int n = i;
            cycleLength = this.cycleLength(n);

            if (cycleLength > maxCycles) {
                maxCycles = cycleLength;
            }
            i++;
        }
        /* output i, j, and the maximum cycle length for integers between and including i and j 
        followed by the maximum cycle length (on the same line)*/
        System.out.println(tempi + " " + tempj + " " + maxCycles);

        return maxCycles;
    }

    /**
     * The input will consist of a series of pairs of integers i and j. One pair
     * of integers per line. All integers will be less than 1,000,000 and
     * greater than 0.
     *
     * @param pair
     * @return
     */
    public int[] maxCycleLength(int[]... pair) {
        int[] maxCycles = new int[pair.length];
        for (int i = 0; i < pair.length; i++) {
            int[] inputs = pair[i];
            int ni = inputs[0], nj = inputs[1];
            maxCycles[i] = this.maxCycleLength(ni, nj);
        }
        return maxCycles;
    }

}
