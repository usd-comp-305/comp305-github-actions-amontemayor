package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void testReverseStringInvertsThreeLetterWord() {

        String word = "cat";

        String reversedWord = StringUtils.reverseString(word);

        assertEquals("tac", reversedWord);

    }

    @Test
    void testReverseStringInvertsFourLetterWord() {

        String word = "talk";

        String reversedWord = StringUtils.reverseString(word);

        assertEquals("klat", reversedWord);

    }



}
