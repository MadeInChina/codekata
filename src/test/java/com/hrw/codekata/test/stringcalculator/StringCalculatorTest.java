package com.hrw.codekata.test.stringcalculator;

import org.junit.Before;
import org.junit.Test;

import com.hrw.codekata.stringcalculator.StringCalculator;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testInputEmptyReturn0() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void testInputOneNumberReturnIntValue() {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void testInputTwoNumberReturnSum() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void testInputWithNewLineReturnSum() {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void testInputWithDifferentDelimiters() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
}
