package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {



    @Test
    void testReverseStringInvertsThreeLetterWord() {

        final String word = "cat";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("tac", reversedWord);

    }

    @Test
    void testReverseStringInvertsFourLetterWord() {

        final String word = "talk";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("klat", reversedWord);

    }

    @Test
    void testReverseStringInvertsTwoLetterWord() {

        final String word = "of";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("fo", reversedWord);

    }

    @Test
    void testReverseStringWithEmptyString() {

        final String word = "";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("", reversedWord);

    }

    @Test
    void testReverseStringWithSingleCharacterString() {

        final String word = "a";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("a", reversedWord);

    }

    @Test
    void testReverseStringOnPalindrome() {

        final String word = "racecar";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("racecar", reversedWord);

    }

    @Test
    void testReverseStringWithSpaces() {

        final String word = "race car";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("rac ecar", reversedWord);

    }

    @Test
    void testReverseStringWithCases() {

        final String word = "Banana";

        final String reversedWord = StringUtils.reverseString(word);

        assertEquals("ananaB", reversedWord);

    }







}
