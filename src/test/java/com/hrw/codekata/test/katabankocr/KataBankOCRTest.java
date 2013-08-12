package com.hrw.codekata.test.katabankocr;

import org.junit.Test;

import com.hrw.codekata.katabankocr.NumberOCR;

import static org.junit.Assert.*;
/**
 * http://codingdojo.org/
 * KataBankOCR
 *
 *
 *Problem Description
 *User Story 1
 *
 *You work for a bank, which has recently purchased an ingenious machine to assist in reading letters and faxes sent in by branch offices. The machine scans the paper documents, and produces a file with a number of entries which each look like this:
 *
 *    _  _     _  _  _  _  _
 *  | _| _||_||_ |_   ||_||_|
 *  ||_  _|  | _||_|  ||_| _|
 *                         
Each entry is 4 lines long, and each line has 27 characters. The first 3 lines of each entry contain an account number written using pipes and underscores, and the fourth line is blank. Each account number should have 9 digits, all of which should be in the range 0-9. A normal file contains around 500 entries.

Your first task is to write a program that can take this file and parse it into actual account numbers.
 */
public class KataBankOCRTest {
    
    @Test
    public void should_return_0(){
        String line1 =" _ ";
        String line2 ="| |";
        String line3 ="|_|";
        assertEquals("0", NumberOCR.parseDigitByIndex(1, line1, line2, line3));
    };

    @Test
    public void should_return_000000000() {
        String zero =" _ "+
                     "| |"+
                     "|_|";
        
        assertEquals(-2021980254, zero.hashCode());
//         _  _  _  _  _  _  _  _  _ 
//        | || || || || || || || || |
//        |_||_||_||_||_||_||_||_||_|
        String line1 = " _  _  _  _  _  _  _  _  _ ";
        String line2 = "| || || || || || || || || |";
        String line3 = "|_||_||_||_||_||_||_||_||_|";
        
        assertEquals("000000000", NumberOCR.parse(line1,line2,line3));

    }
    
    
    @Test
    public void should_return_111111111() {
        String one ="   "+
                    "  |"+
                    "  |";
        assertEquals(1511113376, one.hashCode());
//                                 
//        |  |  |  |  |  |  |  |  |
//        |  |  |  |  |  |  |  |  |
        String line1 = "                           ";
        String line2 = "  |  |  |  |  |  |  |  |  |";
        String line3 = "  |  |  |  |  |  |  |  |  |";
        assertEquals("111111111", NumberOCR.parse(line1,line2,line3));

    }


}
