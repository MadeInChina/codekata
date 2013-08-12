
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.IcyHot;

import static org.junit.Assert.*;

/**
 * Given two temperatures, return true if one is less than 0 and the other is
 * greater than 100. icyHot(120, -1) → true icyHot(-1, 120) → true icyHot(2,120)
 * → false
 */
public class IcyHotTest {

    @Test
    public void should_return_ture_one_less_than_0_another_greater_than_100_1() {
        assertEquals(true, IcyHot.icyHot(120, -1));
    }

    @Test
    public void should_return_ture_one_less_than_0_another_greater_than_100_2() {
        assertEquals(true, IcyHot.icyHot(-1, 120));
    }

    @Test
    public void should_return_false_not_match_above_2() {
        assertEquals(false, IcyHot.icyHot(2, 120));
    }

}
