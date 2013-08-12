
package com.hrw.codekata.warmup;

public class BackAround {
    // Solution:
    // public String backAround(String str) {
    // Get the last char
    // String back = str.substring(str.length()-1, str.length());
    // return back + str + back;
    // }

    public static String backAround(String original) {
        char back = getLastChar(original);
        return back + original + back;
    }

    private static char getLastChar(String original) {
        return original.charAt(original.length() - 1);
    }

}
