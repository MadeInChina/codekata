
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

    /*
     * from http://codingbat.com/prob/p171896 Given a string name, e.g. "Bob",
     * return a greeting of the form "Hello Bob!". helloName("Bob") →
     * "Hello Bob!" helloName("Alice") → "Hello Alice!" helloName("X") →
     * "Hello X!"
     */
    @Test
    public void should_return_hello_bob_when_input_bob() {
        assertEquals("Hello Bob!", StringUtils.helloName("Bob"));
    }

    @Test
    public void should_return_hello_alice_when_input_alice() {
        assertEquals("Hello Alice!", StringUtils.helloName("Alice"));
    }

    @Test
    public void should_return_hello_x_when_input_x() {
        assertEquals("Hello X!", StringUtils.helloName("X"));
    }

    /*
     * from http://codingbat.com/prob/p184030 
     * Given an "out" string length 4,
     * such as "<<>>", and a word, return a new string where the word is in the
     * middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j)
     * to extract the String starting at index i and going up to but not
     * including index j. makeOutWord("<<>>", "Yay") → "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>" makeOutWord("[[]]", "word")
     * → "[[word]]"
     */
    @Test
    public void should_return_yay_in_middle_of_string() {
        assertEquals("<<Yay>>", StringUtils.makeOutWord("<<>>", "Yay"));
    }

    @Test
    public void should_return_wooHoo_in_middle_of_string() {
        assertEquals("<<WooHoo>>", StringUtils.makeOutWord("<<>>", "WooHoo"));
    }
    
    @Test
    public void should_return_word_in_middle_of_string() {
        assertEquals("[[WooHoo]]", StringUtils.makeOutWord("[[]]", "WooHoo"));
    }

}
