
package com.hrw.codekata.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.warmup.In1020;

/**
 * Given 2 int values, return true if either of them is in the range 10..20
 * inclusive. in1020(12, 99) → true in1020(21, 12) → true in1020(8, 99) → false
 */
public class In1020Test {

    @Test
    public void should_return_true_within_10_to_20_1() {
        assertTrue(In1020.input(12, 99));
    }

    @Test
    public void should_return_true_within_10_to_20_2() {
        assertTrue(In1020.input(21, 12));
    }

    @Test
    public void should_return_false_within_10_to_20() {
        assertFalse(In1020.input(8, 99));
    }
}
