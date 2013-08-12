package com.hrw.codekata.test.warmup;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.warmup.DelDel;

/*
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged. 
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 */
public class DelDelTest {
    @Test
    public void should_return_abc_when_input_adelbc(){
        assertEquals("abc", DelDel.input("adelbc"));
    }
    
    @Test
    public void should_return_aHello_when_input_adelHello(){
        assertEquals("aHello", DelDel.input("adelHello"));
    }

    @Test
    public void should_return_adedbc_when_input_adedbc(){
        assertEquals("adedbc", DelDel.input("adedbc"));
    }

    
}
