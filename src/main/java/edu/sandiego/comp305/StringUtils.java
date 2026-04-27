package edu.sandiego.comp305;

import java.util.ArrayList;

public class StringUtils {


    public static String reverseString(String word) {

        StringBuilder letterBuffer = new StringBuilder();
        char[] wordCharacters = word.toCharArray();

        int wordSize = word.length();


        for(int i = wordSize-1; i >= 0; i--) {
            letterBuffer.append(wordCharacters[i]);
        }

        return letterBuffer.toString();
    }
}
