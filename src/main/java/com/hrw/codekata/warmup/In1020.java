
package com.hrw.codekata.warmup;

public class In1020 {
    private static final int MAX_NUMBER = 20;
    private static final int MIN_NUMBER = 10;

    public static boolean input(int first, int second) {
        return isWithin(first) || isWithin(second);
    }

    private static boolean isWithin(int number) {
        return number >= MIN_NUMBER && number <= MAX_NUMBER;
    }

}
