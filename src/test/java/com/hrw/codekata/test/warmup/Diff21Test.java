
package com.hrw.codekata.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.warmup.Diff21;

/*
 * form:http://codingbat.com/prob/p116624
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 

 diff21(19) → 2
 diff21(10) → 11
 diff21(21) → 0
 */
public class Diff21Test {
    @Test
    public void should_return_2_when_input_19() {
        assertResult(2, 19);
    }

    @Test
    public void should_return_11_when_input_10() {
        assertResult(11, 10);
    }

    @Test
    public void should_return_21_when_input_0() {
        assertResult(0, 21);
    }

    private void assertResult(int expected, int input) {
        assertEquals(expected, Diff21.diff(input));
    }

    @Test
    public void should_return_double_diff_value_when_input_over_21() {
        assertResult(2, 22);
    }

}
