
package com.hrw.codekata.other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringArrayCompare {

    public static boolean compare(String[] array1, String[] array2) {
        Set<String> aTarget = new HashSet<String>();
        Set<String> bTarget = new HashSet<String>();
        aTarget.addAll(Arrays.asList(array1));
        bTarget.addAll(Arrays.asList(array2));
        if (aTarget.size() != bTarget.size()) {
            return false;
        } else {
            int temSize = aTarget.size();
            aTarget.addAll(Arrays.asList(array2));
            return temSize == aTarget.size();
        }
    }

}
