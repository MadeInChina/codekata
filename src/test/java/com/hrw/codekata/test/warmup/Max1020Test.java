
package com.hrw.codekata.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.test.number.NumberUtils;

public class Max1020Test {

    @Test
    public void should_return_19_when_input_11_19() {
        assertEquals(19, NumberUtils.max1020(11, 19));
    }

    @Test
    public void should_return_11_when_input_11_9() {
        assertEquals(11, NumberUtils.max1020(11, 9));
    }

    @Test
    public void should_return_0_when_input_not_in_10_to_20() {
        assertEquals(0, NumberUtils.max1020(9, 21));
    }

}
