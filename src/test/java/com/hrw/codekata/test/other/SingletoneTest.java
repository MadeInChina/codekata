
package com.hrw.codekata.test.other;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hrw.codekata.other.Singleton;

public class SingletoneTest {
    private Singleton singleTon;

    public Singleton getSingle1() {
        return singleTon;
    }

    public void setSingle1(Singleton singleTon) {
        this.singleTon = singleTon;
    }

    public void should_return_not_null() {
        assertNotNull(Singleton.getInstance());
    }

}
