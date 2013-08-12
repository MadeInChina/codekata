
package com.hrw.codekata.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class BiggerNumber {

    public static int getMaxNumber(ArrayList<Integer> arrayList) {
        // 1.using sort
        // Iterator<Integer> iter = arrayList.iterator();
        // sort(arrayList);
        // int result = 0;
        // while (iter.hasNext()) {
        // result = iter.next();
        // }

        return getLargestNubmer(arrayList);
    }

    private static void sort(ArrayList<Integer> list) {
        Object[] a = list.toArray();
        Arrays.sort(a);
        ListIterator i = list.listIterator();
        for (int j = 0; j < a.length; j++) {
            i.next();
            i.set(a[j]);
        }
    }

    private static int getLargestNubmer(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int max = 0;
        while (it.hasNext()) {
            int temp = it.next();
            if (temp > max)
                max = temp;
        }
        return max;
    }

}
