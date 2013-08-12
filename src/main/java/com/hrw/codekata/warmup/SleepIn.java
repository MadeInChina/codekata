
package com.hrw.codekata.warmup;

public class SleepIn {

    public static boolean isSleepIn(boolean isWeekday, boolean isOnVacation) {
        if (!isWeekday || isOnVacation) {
            return true;

        } else {
            return false;
        }
    }
}
