
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.LastDigitSame;

import static org.junit.Assert.*;
/**
 *Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 
 *lastDigit(7, 17) → true
 *lastDigit(6, 17) → false
 *lastDigit(3, 113) → true 
 */
public class LastDigitSameTest {

    @Test
    public void should_return_true_input_7_and_17() {
        assertEquals(true, LastDigitSame.lastDigit(7, 17));
    }

    @Test
    public void should_return_false_input_6_and_17() {
        assertEquals(false, LastDigitSame.lastDigit(6, 17));
    }

    @Test
    public void should_return_true_input_3_and_113() {
        assertEquals(true, LastDigitSame.lastDigit(3, 113));
    }

}
