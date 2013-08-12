
package com.hrw.codekata.warmup;

public class LastDigitSame {
    public static boolean lastDigit(int first, int second) {
        if (first == (second % 10)) {
            return true;
        } else {
            return false;
        }
    }
}
