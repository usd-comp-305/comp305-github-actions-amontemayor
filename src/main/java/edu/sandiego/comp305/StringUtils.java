package edu.sandiego.comp305;


public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString(final String word) {

        final StringBuilder letterBuffer = new StringBuilder();

        final char[] wordCharacters = word.toCharArray();

        final int wordSize = word.length();


        for(int i = wordSize-1; i >= 0; i--) {
            letterBuffer.append(wordCharacters[i]);
        }

        return letterBuffer.toString();
    }
}
