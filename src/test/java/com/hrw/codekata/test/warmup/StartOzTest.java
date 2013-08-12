
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.StartOz;

import static org.junit.Assert.*;
/**
 * http://codingbat.com/prob/p199720
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if
 * it is 'z', so "ozymandias" yields "oz". 
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z" 
 * startOz("oxx") → "o"
 */
public class StartOzTest {
    @Test
    public void should_return_oz_input_ozymandias() {
        myAssertEquals("oz", "ozymandias");
    }

    @Test
    public void should_return_z_input_bzoo() {
        myAssertEquals("z", "bzoo");
    }

    @Test
    public void should_return_o_input_oxx() {
        myAssertEquals("o", "oxx");
    }

    private void myAssertEquals(String expected, String actual) {
        assertEquals(expected, StartOz.startOz(actual));
    }

}
