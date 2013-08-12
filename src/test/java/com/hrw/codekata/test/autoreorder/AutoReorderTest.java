
package com.hrw.codekata.test.autoreorder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class AutoReorderTest {
    ArrayList<String> itemList;

    @Before
    public void setUp() {
        itemList = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
                add("e");
                add("f");
                add("g");
                add("h");
                add("i");
                add("j");
                add("k");
                add("l");
            }
        };
    }

    @Test
    public void should_return_item_size() {
        assertEquals(12, itemList.size());
    }

    @Test
    public void should_return_right_index_when_insert_a_after_b() {
        int aIndex = itemList.indexOf("a");
        assertEquals(0, aIndex);
        int bIndex = itemList.indexOf("b");
        assertEquals(1, bIndex);
        itemList.add(bIndex, itemList.remove(aIndex));
        assertEquals(12, itemList.size());
        aIndex = itemList.indexOf("a");
        bIndex = itemList.indexOf("b");

        assertEquals(0, bIndex);
        assertEquals(1, aIndex);

    }

    @Test
    public void should_return_right_index_when_insert_a_after_c() {
        int aIndex = itemList.indexOf("a");
        assertEquals(0, aIndex);
        int bIndex = itemList.indexOf("b");
        assertEquals(1, bIndex);
        int cIndex = itemList.indexOf("c");
        assertEquals(2, cIndex);
        itemList.add(cIndex, itemList.remove(aIndex));
        assertEquals(12, itemList.size());

        aIndex = itemList.indexOf("a");
        bIndex = itemList.indexOf("b");
        cIndex = itemList.indexOf("c");

        assertEquals(2, aIndex);
        assertEquals(0, bIndex);
        assertEquals(1, cIndex);

    }

    @Test
    public void should_return_arraylist_to_string_without_square_brackets() {
        String result = itemList.toString();
        assertEquals("a,b,c,d,e,f,g,h,i,j,k,l", result.substring(1, result.length() - 1).replace(" ", ""));
    }

}
