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

    @Test
    void testReverseStringInvertsTwoLetterWord() {

        String word = "of";

        String reversedWord = StringUtils.reverseString(word);

        assertEquals("fo", reversedWord);

    }

    @Test
    void testReverseStringWithEmptyString() {

        String word = "";

        String reversedWord = StringUtils.reverseString(word);

        assertEquals("", reversedWord);

    }

    @Test
    void testReverseStringWithSingleCharacterString() {

        String word = "a";

        String reversedWord = StringUtils.reverseString(word);

        assertEquals("a", reversedWord);

    }





}
