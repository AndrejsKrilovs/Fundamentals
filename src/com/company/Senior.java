package com.company;

public class Senior {
    private boolean sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private boolean sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //Array is given with numbers need to understand is it sorted or not ?
    public Boolean isArraySorted(int[] array) {
        return sortAscending(array) || sortDescending(array);
    }

    /**
     * Find most common letter (char) in string
     * Given: abbbcd  | Result: b
     * Given: aaadcc  | Result: a
     * Given: ttw     | Result: t;
     */
    public String getMostCommonCharInString(String string) {
        if(string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException("Input string must have non-empty value.");
        }

        char maximalCharacter = 0;
        int maximalCharacterCount = 0;
        int[] characterArray = new int[Character.MAX_VALUE + 1];
        for (int i = string.length() - 1; i >= 0; i--) {
            char currentCharacter = string.charAt(i);
            if (++characterArray[currentCharacter] >= maximalCharacterCount) {
                maximalCharacterCount = characterArray[currentCharacter];
                maximalCharacter = currentCharacter;
            }
        }
        return String.valueOf(maximalCharacter);
    }

}
