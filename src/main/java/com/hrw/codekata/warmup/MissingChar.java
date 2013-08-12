
package com.hrw.codekata.warmup;

public class MissingChar {

    public String missingCharSolution(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n + 1, str.length());

        return front + back;
    }

    public static String missingChar(String origin, int index) {
        return origin.replaceFirst(String.valueOf(origin.toCharArray()[index]), "");
    }

}
