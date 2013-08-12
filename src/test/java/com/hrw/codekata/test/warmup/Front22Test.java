
package com.hrw.codekata.test.warmup;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. 
 * 
 * front22("kitten") → "kikittenki"
 * front22("Ha") → "HaHaHa"
 * front22("abc") → "ababcab"
 *
 *Solution:
 *public String front22(String str) {
 * First figure the number of chars to take
 * int take = 2;
 *if (take > str.length()) {
 *   take = str.length();
 * }
 * 
 * String front = str.substring(0, take);
 * return front + str + front;
 *}
 */
public class Front22Test {

    @Test
    public void should_return_kikittenki_when_put_kitten() {
        assertEquals("kikittenki", front22("kitten"));

    }

    @Test
    public void should_return_HaHaHa_when_put_Ha() {
        assertEquals("HaHaHa", front22("Ha"));

    }

    @Test
    public void should_return_abc_when_put_ababcab() {
        assertEquals("ababcab", front22("abc"));

    }

    private String front22(String string) {
        return buildString(string);
    }

    private String buildString(String string) {
        String subString = string.substring(0, 2);
        return subString + string + subString;
    }

}
