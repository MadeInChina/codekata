
package com.hrw.codekata.guessnumber;

public class GenerateNumber {

    private static final String FAILURE = "failure";
    private static final String ONLY_VALUE_MATCH_SYMBOL = "B";
    private static final String MATCH_SYMBOL = "A";
    private static final String GENERATED_NUMBER = "1234";
    private static int falilureCount = 0;

    private static int matchedCount = 0;
    private static int matchedValueCount = 0;

    private static char[] charArrayGenerateNumber;

    public static void reset() {
        resetMatchedCount();
        resetFalureCount();
    }

    public static void resetMatchedCount() {
        matchedCount = 0;
        matchedValueCount = 0;
    }

    public static void resetFalureCount() {
        falilureCount = 0;
    }

    public static String generate() {
        return GENERATED_NUMBER;
    }

    public static String validate(String guessNumber) {
        calculateMatchedCount(guessNumber.toCharArray());
        return convertToResult(matchedCount, matchedValueCount);
    }

    private static void calculateMatchedCount(char[] userGuessNumber) {
        charArrayGenerateNumber = GENERATED_NUMBER.toCharArray();
        for (int i = 0; i < 4; i++) {
            if (userGuessNumber[i] == charArrayGenerateNumber[i]) {
                matchedCount++;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (j != i && userGuessNumber[i] == charArrayGenerateNumber[j]) {
                        matchedValueCount++;
                    }
                }
            }

        }
    }

    private static String convertToResult(int matchedCount, int matchedValueCount) {
        if (matchedCount != 4) {
            if (falilureCount == 10) {
                falilureCount = 0;
                return FAILURE;
            }
            falilureCount++;
        }
        resetMatchedCount();
        return matchedCount + MATCH_SYMBOL + matchedValueCount + ONLY_VALUE_MATCH_SYMBOL;
    }
}
