
package com.hrw.codekata.other;

public class Child extends Parent {

    public Child(String string) {
        super();
    }

    public Child() {
    }

    public String getName() {
        return getClass().getSimpleName();
    }

}
