package com.company;

import com.company.classes.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

public class Lead {
    /**
     * There are elements in array that is provided in param,
     * need to replace all elements in that array that are equals to valueToReplace with value: valueForReplace
     * Given: { "1","2","3"}, "2", "new value instead of 2"
     * Result: { "1, "new value instead of 2", "3"}
     */
    public String[] replaceInArrayEachGivenElementWith(String[] arrayForModification, String valueToReplace, String valueForReplace) {
        return Stream.of(arrayForModification)
                .map(item -> item.equalsIgnoreCase(valueToReplace) ? item.replace(valueToReplace, valueForReplace) : item)
                .toArray(String[]::new);
    }

    /**
     * Number is given. need to find most close natural number that gives in POW(2) ( sqrt of it) natural number
     * GIVEN: 2 RESULT: 1
     * GIVEN: 3 RESULT: 1
     * GIVEN: 4 RESULT: 2
     * GIVEN: 5 RESULT: 2
     * GIVEN: 6 RESULT: 2
     */
    public int findClosedNaturalRoundDownToSQRTof(int sqrt) {
        BigDecimal value = BigDecimal.valueOf(Math.sqrt(sqrt));
        return value.setScale(1, RoundingMode.DOWN).intValue();
    }

    /**
     * Create TWO Demensional Array numberXnumber (google) and fill it with number provided
     * Given 3 Result: {3,3,3}, {3,3,3}, {3,3,3}
     * Given 2 Result: {2,2}, {2,2}
     * <p>
     * 3 3 3
     * 3 3 3
     * 3 3 3
     * <p>
     * 2 2
     * 2 2
     */
    public int[][] createTwoDimensionalArrayAndFillItWithNumberProvided(int number) {
        int[][] result = new int[number][number];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = number;
            }
        }
        return result;
    }

    //given number. Return array that have first N fibbonachi numbers
    // https://en.wikipedia.org/wiki/Fibonacci_number
    public int[] getNFirstFibonacciNumbersInArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if(i <= 1) {
                result[i] = 1;
            } else {
                result[i] = Integer.sum(result[i - 2], result[i - 1]);
            }
        }
        return result;
    }


    /**
     * Return class by provided string or if key (provided string) are unknown then return Adenosine instance
     * A = Adenosine
     * C = Cytosine
     * G = Guanine
     * M = Methyladenine
     */
    public DNAClass switchBecauseNoHashMap(String key) {
        switch (key){
            case "A":
                return new Adenosine();
            case "C":
                return new Cytosine();
            case "G":
                return new Guanine();
            case "M":
                return new Methyladenine();
            default:
                return new DNAClass();
        }
    }

}
