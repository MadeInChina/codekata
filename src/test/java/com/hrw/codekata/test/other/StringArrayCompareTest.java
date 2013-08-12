
package com.hrw.codekata.test.other;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.hrw.codekata.other.StringArrayCompare;

/**
 * 如果快速比较两个string[] 无序相等0 比如 new String[]{"aaa","bbb","ccc"} 和 new
 * String[]{"bbb","ccc","aaa"}无序相等,
 */
public class StringArrayCompareTest {

    @Test
    public void should_return_false_when_not_all_item_equal() {
        String[] array1 = new String[] {
                "1", "2", "3"
        };
        String[] array2 = new String[] {
                "2", "2", "2"
        };
        assertEquals(false, StringArrayCompare.compare(array1, array2));

    }

    @Test
    public void should_return_true_when_all_item_equal() {
        String[] array1 = new String[] {
                "1", "2", "3"
        };
        String[] array2 = new String[] {
                "3", "2", "1"
        };
        assertEquals(true, StringArrayCompare.compare(array1, array2));
    }

}
