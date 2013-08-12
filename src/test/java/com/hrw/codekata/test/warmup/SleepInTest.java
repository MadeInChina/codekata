
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.SleepIn;

import static org.junit.Assert.*;

/*
 * from:http://codingbat.com/prob/p187868
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
 sleepIn(false, false) → true
 sleepIn(true, false) → false
 sleepIn(false, true) → true
 */
public class SleepInTest {

    @Test
    public void should_return_true_not_weekday_and_not_on_vacation() {
        assertEquals(true, SleepIn.isSleepIn(false, false));
    }

    @Test
    public void should_return_false_is_weekday_and_not_on_vacation() {
        assertEquals(false, SleepIn.isSleepIn(true, false));
    }

    @Test
    public void should_return_true_not_weekday_and_on_vacation() {
        assertEquals(true, SleepIn.isSleepIn(false, true));
    }

}
