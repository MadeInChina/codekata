
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.BackAround;

import static org.junit.Assert.*;

/*
 * Given a string, take the last char and 
 * return a new string with the last char added at the front and back, 
 * so "cat" yields "tcatt". 
 * The original string will be length 1 or more. 
 *backAround("cat") → "tcatt"
 *backAround("Hello") → "oHelloo"
 *backAround("a") → "aaa"
 */
public class BackAroundTest {

    @Test
    public void should_return_tcatt_when_input_cat() {
        assertEquals("tcatt", BackAround.backAround("cat"));
    }

    @Test
    public void should_return_oHelloo_when_input_Hello() {
        assertEquals("oHelloo", BackAround.backAround("Hello"));
    }

    @Test
    public void should_return_aaa_when_input_a() {
        assertEquals("aaa", BackAround.backAround("a"));
    }

}
