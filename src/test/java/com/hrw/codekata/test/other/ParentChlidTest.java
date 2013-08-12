
package com.hrw.codekata.test.other;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.other.Child;
import com.hrw.codekata.other.Parent;

public class ParentChlidTest {
    @Test
    public void should_return_parent() {
        assertEquals("Parent", new Parent().getName());
    }

    @Test
    public void should_return_child() {
        assertEquals("Child", new Child().getName());
    }

    @Test
    public void should_return_parent_when_call_from_child() {
        Parent p = new Child("Parent");
        assertEquals("Child", p.getName());
    }

}
