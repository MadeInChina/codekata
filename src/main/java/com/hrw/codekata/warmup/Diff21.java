
package com.hrw.codekata.warmup;

public class Diff21 {

    private static final int DOUBLE = 2;
    private static final int DEFAULT_VALUE = 21;

    public static int diff(int i) {
        if (i > DEFAULT_VALUE) {
            return (i - DEFAULT_VALUE) * DOUBLE;
        }
        return DEFAULT_VALUE - i;
    }

}
