
package com.hrw.codekata.test.other;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.hrw.codekata.other.BiggerNumber;

public class BiggerNumberTest {
    @Test
    public void should_return_2_when_input_1_2() {
        assertEquals(2, BiggerNumber.getMaxNumber(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
            }
        }));
    }

    @Test
    public void should_return_3_when_input_2_3() {
        assertEquals(3, BiggerNumber.getMaxNumber(new ArrayList<Integer>() {
            {
                add(2);
                add(3);
            }
        }));
    }

}
