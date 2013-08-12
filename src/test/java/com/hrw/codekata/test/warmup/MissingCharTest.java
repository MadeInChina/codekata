
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.MissingChar;

import static org.junit.Assert.*;

/*
 * Given a non-empty string and an int n, 
 * return a new string where the char at index n has been removed. 
 * The value of n will be a valid index of a char in the original string 
 * (i.e. n will be in the range 0..str.length()-1 inclusive). 
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 */
public class MissingCharTest {
    @Test
    public void should_return_ktten_input_1() {
        assertEquals("ktten", MissingChar.missingChar("kitten", 1));
    }

    @Test
    public void should_return_ktten_input_0() {
        assertEquals("itten", MissingChar.missingChar("kitten", 0));
    }

    @Test
    public void should_return_ktten_input_4() {
        assertEquals("kittn", MissingChar.missingChar("kitten", 4));
    }

}
