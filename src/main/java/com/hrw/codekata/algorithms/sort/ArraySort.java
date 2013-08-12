
package com.hrw.codekata.algorithms.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraySort {

    public static int getLargestByArraySort(ArrayList<Integer> arrayList) {
        Integer[] array = arrayList.toArray(new Integer[] {});
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int getLargestByBubbleSort(ArrayList<Integer> arrayList) {
        Integer[] array = arrayList.toArray(new Integer[] {});
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[array.length - 1];
    }

    public static int getLargestByIterateSort(ArrayList<Integer> arrayList) {
        int max = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

}
