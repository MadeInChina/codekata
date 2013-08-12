
package com.hrw.codekata.test.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 第1个人10，第2个比第1个人大2岁，依次递推，请用递归方式计算出第8个人多大？
 */
public class RecursionTest {
    @Test
    public void should_return_10_when_get_persion_1() {
        assertEquals(10, computeAge(1));
    }

    @Test
    public void should_return_12_when_get_persion_2() {
        assertEquals(12, computeAge(2));
    }

    @Test
    public void should_return_14_when_get_persion_3() {
        assertEquals(14, computeAge(3));
    }

    private int computeAge(int i) {
        if (i == 1) {
            return 10;
        }
        return computeAge(i - 1) + 2;
    }

}
