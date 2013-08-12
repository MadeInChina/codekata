
package com.hrw.codekata.test.guessnumber;

import org.junit.Test;
import static org.junit.Assert.*;
import com.hrw.codekata.guessnumber.GenerateNumber;

public class GuessNumberTest {

    private static final String FAILURE = "failure";
    private static final String DEFAULT_NUMBER = "1234";
    private String generateNumber;

    @Test
    public void should_return_a_generate_number() {
        GenerateNumber.reset();
        generateNumber = GenerateNumber.generate();
        assertEquals(generateNumber, DEFAULT_NUMBER);
    }

    @Test
    public void should_return_0A0B_no_number_match() {
        assertGuessNumber("0A0B", "5678");
    }

    @Test
    public void should_return_1A0B_only_one_number_match() {
        assertGuessNumber("1A0B", "1678");
    }

    @Test
    public void should_return_2A0B_only_two_number_match() {
        assertGuessNumber("2A0B", "1278");
    }

    @Test
    public void should_return_3A0B_only_three_number_match() {
        assertGuessNumber("3A0B", "1238");
    }

    @Test
    public void should_return_4A0B_only_four_number_match() {
        assertGuessNumber("4A0B", "1234");
    }

    @Test
    public void should_return_0A1B_only_one_number_value_match() {
        assertGuessNumber("0A1B", "5671");
    }

    @Test
    public void should_return_0A2B_only_two_number_value_match() {
        assertGuessNumber("0A2B", "5621");
    }

    @Test
    public void should_return_0A3B_only_three_number_value_match() {
        assertGuessNumber("0A3B", "5321");
    }

    @Test
    public void should_return_0A4B_only_four_number_value_match() {
        assertGuessNumber("0A4B", "4321");
    }

    @Test
    public void should_return_1A1B_one_match_and_one_number_value_match() {
        assertGuessNumber("1A1B", "1546");
    }

    @Test
    public void should_return_2A2B_two_match_and_two_number_value_match() {
        assertGuessNumber("2A2B", "1243");
    }

    private void assertGuessNumber(String expected, String actual) {
        GenerateNumber.reset();
        assertEquals(expected, GenerateNumber.validate(actual));
    }

    @Test
    public void should_return_failure_guess_ten_times_not_match() {
        GenerateNumber.reset();
        for (int i = 1; i <= 10; i++) {
            GenerateNumber.validate("1240");
            if (i == 10) {
                assertEquals(FAILURE, GenerateNumber.validate("1240"));
            }
        }

    }

}
