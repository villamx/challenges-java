/*
 * Challenges at Interview | Pretest
 */
package interview.elppa.pretest;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. Any
 * integer K, such that <code>0 <= K < N-1</code>, splits array A into two
 * non-empty parts.
 *
 * @author moises.villa
 */
public class MaxAbs {

    private int max(int[] numbers, int against) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > against) {
                against = numbers[i];
            }
        }
        return against;
    }

    public int maxAbs(int[] A, int K) {
        int N = A.length;
        int maxabs = 0;

        int[] p1 = new int[K + 1];
        int[] p2 = new int[N - p1.length];

        int maxP1 = A[K], maxP2 = A[K + 1];

        for (int i = 0; i <= K; i++) {
            p1[i] = A[i];
        }

        for (int i = K + 1; i <= N - 1; i++) {
            p2[i - p1.length] = A[i];
        }

        maxP1 = this.max(p1, maxP1);
        maxP2 = this.max(p2, maxP2);

        System.out.println("A1=" + maxP1 + "  A2=" + maxP2);

        int maxK = maxP1 - maxP2;
        if (maxK > maxabs) {
            maxabs = maxK;
        }

        return maxabs;
    }

    public int maxAbs(int[] A, int... K) {
        int count = K.length;
        int[] maxs = new int[count];
        int maxabs = 0;

        for (int i = 0; i < count; i++) {
            int max = maxs[i] = this.maxAbs(A, K[i]);
            if (max > maxabs) {
                maxabs = max;
            }
        }

        return maxabs;
    }

}
