
package com.hrw.codekata.katabankocr;

public class NumberOCR {

    private static final String ONE = "1";

    private static final String ZERO = "0";

    private static final int ONE_HASH_CODE = 1511113376;

    private static int ZERO_HASH_CODE = -2021980254;

    private static int DIGIT_WIDTH = 3;

    public static String parse(String line1, String line2, String line3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            String digit = parseDigitByIndex(i + 1, line1, line2, line3);
            if (digit != null) {
                sb.append(digit);
            }
        }

        return sb.toString();
    }

    /**
     * prase the single number by index
     * 
     * @param index
     * @return
     */
    public static String parseDigitByIndex(int index, String line1, String line2, String line3) {
        String digitCharLine1 = line1.substring((index - 1) * DIGIT_WIDTH, index * DIGIT_WIDTH);
        String digitCharLine2 = line2.substring((index - 1) * DIGIT_WIDTH, index * DIGIT_WIDTH);

        String digitCharLine3 = line3.substring((index - 1) * DIGIT_WIDTH, index * DIGIT_WIDTH);
        String digit = digitCharLine1 + digitCharLine2 + digitCharLine3;

        return parseToDigit(digit);

    }

    private static String parseToDigit(String digit) {
        if (digit.hashCode() == ZERO_HASH_CODE) {
            return ZERO;
        } else if (digit.hashCode() == ONE_HASH_CODE) {
            return ONE;
        } else {
            return null;
        }

    }
}
