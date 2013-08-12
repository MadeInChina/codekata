
package com.hrw.codekata.test.warmup;

import org.junit.Test;

import com.hrw.codekata.warmup.MonkeyTrouble;

import static org.junit.Assert.*;

/*
 * We have two monkeys, a and b, and the parameters 
 * aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling.
 * Return true if we are in trouble. 
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
 */
public class MonkeyTroubleTest {
    @Test
    public void should_return_true_when_both_smling() {
        assertEquals(true, MonkeyTrouble.monkeyTrouble(true, true));
    }

    @Test
    public void should_return_true_when_both_not_smling() {
        assertEquals(true, MonkeyTrouble.monkeyTrouble(false, false));
    }
    
    @Test
    public void should_return_false_when_one_smling_one_not_smling() {
        assertEquals(false, MonkeyTrouble.monkeyTrouble(true, false));
    }
}
