
package com.hrw.codekata.string;

public class StringUtils {
    /*
     * Given a string, return a new string where the last 3 chars are now in
     * upper case. If the string has less than 3 chars, uppercase whatever is
     * there. Note that str.toUpperCase() returns the uppercase version of a
     * string. endUp("Hello") → "HeLLO" endUp("hi there") → "hi thERE"
     * endUp("hi") → "HI"
     */
    public static String endUp(String string) {
        int length = string.length();
        if (length > 3) {
            final int frontEndIndex = length - 3;
            String front = string.substring(0, frontEndIndex);
            String end = string.substring(frontEndIndex, length);
            return front + end.toUpperCase();
        } else {
            return string.toUpperCase();
        }

    }

    public static String helloName(String name) {

        return "Hello " + name + "!";
    }

    public static String makeOutWord(String string, String word) {
        String prefix = string.substring(0, 2);
        String suffix = string.substring(2, 4);
        return prefix + word + suffix;
    }

    public static String firstHalf(String string) {
        return string.substring(0, string.length() / 2);
    }

}
