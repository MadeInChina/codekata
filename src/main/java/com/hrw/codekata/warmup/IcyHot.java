
package com.hrw.codekata.warmup;

public class IcyHot {

    //
    // Solution:
    // public boolean icyHot(int temp1, int temp2) {
    // if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
    // return true;
    // } else {
    // return false;
    // }
    // // Could be written as: return ((temp1 < 0 && ...));
    // }
    public static boolean icyHot(int icy, int hot) {
        return isIcyOrHotLessThanZero(icy, hot) && isIcyOrHotGreaterThanOneHundred(icy, hot);
    }

    private static boolean isIcyOrHotGreaterThanOneHundred(int icy, int hot) {
        return (icy > 100 || hot > 100);
    }

    private static boolean isIcyOrHotLessThanZero(int icy, int hot) {
        return (icy < 0 || hot < 0);
    }

}
