
package com.hrw.codekata.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.test.number.NumberUtils;

public class IntMaxTest {
    @Test
    public void should_return_3_when_input_1_2_3() {
        assertEquals(3, NumberUtils.intMax(1, 2, 3));
    }

    @Test
    public void should_return_3_when_input_1_3_2() {
        assertEquals(3, NumberUtils.intMax(1, 3, 2));
    }

    @Test
    public void should_return_3_when_input_3_2_1() {
        assertEquals(3, NumberUtils.intMax(3, 2, 1));
    }

    @Test
    public void should_return_3_when_input_4_2_1() {
        assertEquals(4, NumberUtils.intMax(4, 2, 1));
    }
}
