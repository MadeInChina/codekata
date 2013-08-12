
package com.hrw.codekata.test.string;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.string.StringUtils;

public class StringUtilsTest {
    @Test
    public void should_return_HeLLO_when_input_Hello() {
        assertEquals("HeLLO", StringUtils.endUp("Hello"));
    }

    @Test
    public void should_return_hi_thERE_when_input_hi_there() {
        assertEquals("hi thERE", StringUtils.endUp("hi there"));
    }

    @Test
    public void should_return_HI_when_input_hi() {
        assertEquals("HI", StringUtils.endUp("hi"));
    }

}
