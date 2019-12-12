package com.company;

import java.util.Arrays;

public class Architect {
    /**
     * nxn Two dimensional array that represents a field of data nxn.
     * There is an image of letter inside it , that need to be recognized and returned examples
     * EXAMPLE OF IMAGES: (See also Test examples)
     * 1 1 1
     * 0 1 0 = T
     * 0 1 0
     * <p>
     * 0 1 1
     * 0 1 0 = C
     * 0 1 1
     * <p>
     * 1 1 1
     * 1 0 1 = O
     * 1 1 1
     * <p>
     * 1 1 0
     * 1 1 0 = P
     * 1 0 0
     * <p>
     * 1 0 1
     * 1 1 1 = H
     * 1 0 1
     * <p>
     * 0 1 0
     * 0 1 0 = L
     * 0 1 1
     * <p>
     * 0 1 0
     * 1 1 1 = A
     * 1 0 1
     * <p>
     * E.T.C
     * <p>
     * Array can be XnX
     * <p>
     * need to recognize all letters and print a string with them
     * Letters always are printed in 3x3 array
     * <p>
     * Examples of work
     * GIVEN::
     * 0 1 0 0 0 0
     * 1 1 1 0 0 0
     * 1 0 1 0 0 0
     * 0 0 0 1 0 0
     * 0 0 0 1 0 0
     * 0 0 0 1 1 0
     * <p>
     * RESULT: "AL"
     * <p>
     * GIVEN::
     * 0 0 0 0 0 0
     * 0 0 0 0 0 0
     * 0 0 0 0 0 0
     * 0 0 0 1 0 1
     * 0 0 0 1 1 1
     * 0 0 0 1 0 1
     * <p>
     * RESULT: "H"
     * <p>
     * GIVEN::
     * 1 0 0 1 0
     * 1 0 0 1 0
     * 1 1 0 1 1
     * 0 0 0 0 0
     * <p>
     * RESULT: "LL"
     */

    private final int[][] T = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 1, 0}
    };

    private final int[][] H = {
            {1, 0, 1},
            {1, 1, 1},
            {1, 0, 1}
    };

    private final int[][] L = {
            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
    };

    private boolean findArray(int[][] array, int[][] subArray) {
        return Arrays.deepEquals(array, subArray);
    }

    public String recognizeLetter(int[][] field) {
        String result = "";
        if(findArray(field, T)) {
            result = String.join(result,"T");
        }
        if(findArray(field, H)) {
            result = String.join(result,"H");
        }
        if(findArray(field, L)) {
            result = String.join(result,"L");
        }
        return result;
    }

    /**
     * 2) Create a program that will print own SOURCE
     */
}
