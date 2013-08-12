
package com.hrw.codekata.test.algorithms.sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.hrw.codekata.algorithms.sort.ArraySort;

/**
 * This test case is intend for 5 kinds of sort algorithms
 */

public class ArraySortTest {
    // Type 1 by using Arrays.sort(array)
    @Test
    public void should_return_2_when_add_1_2_by_array_sort() {
        assertEquals(2, ArraySort.getLargestByArraySort(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
            }
        }));
    }

    @Test
    public void should_return_3_when_add_1_3_by_array_sort() {
        assertEquals(3, ArraySort.getLargestByArraySort(new ArrayList<Integer>() {
            {
                add(1);
                add(3);
            }
        }));
    }

    // Type 2 by using bubbleSort
    @Test
    public void should_return_2_when_add_1_2_by_bubble_sort() {
        assertEquals(2, ArraySort.getLargestByBubbleSort(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
            }
        }));
    }

    @Test
    public void should_return_3_when_add_1_3_by_bubble_sort() {
        assertEquals(3, ArraySort.getLargestByBubbleSort(new ArrayList<Integer>() {
            {
                add(1);
                add(3);
            }
        }));
    }
 // Type 2 by using iterate
    @Test
    public void should_return_2_when_add_1_2_by_iterate_sort() {
        assertEquals(2, ArraySort.getLargestByIterateSort(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
            }
        }));
    }

    @Test
    public void should_return_3_when_add_1_3_by_iterate_sort() {
        assertEquals(3, ArraySort.getLargestByIterateSort(new ArrayList<Integer>() {
            {
                add(1);
                add(3);
            }
        }));
    }

}
