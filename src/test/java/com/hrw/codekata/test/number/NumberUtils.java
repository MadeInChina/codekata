
package com.hrw.codekata.test.number;

public class NumberUtils {
    /*
     * Given three int values, a b c, return the largest. intMax(1, 2, 3) → 3
     * intMax(1, 3, 2) → 3 intMax(3, 2, 1) → 3
     */
    public static int intMax(int i, int j, int k) {
        return Math.max(Math.max(i, j), Math.max(j, k));
    }

    /*
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range. max1020(11,
     * 19) → 19 max1020(19, 11) → 19 max1020(11, 9) → 11
     */
    public static int max1020(int i, int j) {
        if ((i < 10 || i > 20) && (j < 10 || j > 20)) {
            return 0;
        }
        return Math.max(i, j);
    }

}
