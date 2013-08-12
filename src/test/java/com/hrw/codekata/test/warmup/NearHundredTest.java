
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.NearHundred;

import static org.junit.Assert.*;

/*
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */
public class NearHundredTest {
    @Test
    public void should_return_true_when_near_one_hundred() {
        assertEquals(true, NearHundred.validate(93));
    }

    @Test
    public void should_return_false_when__not_near_one_hundred() {
        assertEquals(false, NearHundred.validate(89));
    }

    @Test
    public void should_return_true_when_near_two_hundred() {
        assertEquals(true, NearHundred.validate(193));
    }

    @Test
    public void should_return_false_when__not_near_two_hundred() {
        assertEquals(false, NearHundred.validate(189));
    }

}
