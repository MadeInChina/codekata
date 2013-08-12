
package com.hrw.codekata.warmup;

public class NearHundred {

    public static boolean validate(int input) {
        return Math.abs(100 - input) <= 10 || Math.abs(200 - input) <= 10;
    }
}
