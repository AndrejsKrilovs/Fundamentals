package com.company;

import com.company.classes.CustomObject;
import com.company.classes.OurTestObjectWithTwoSetFields;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Junior {

    //Given two natural numbers (first and last), get the sum from First to Last
    //3 and 8 = 3,4,5,6,7,8 = 3+4+5+6+7=8 == ?
    public int getAllNaturalNumbersSumFromAtoB(int start, int end) {
        return IntStream.rangeClosed(start, end).sum();
    }

    //True if string is not null and not empty else false
    public Boolean isStringNullOrEmpty(String str) {
        return str.isEmpty() && str.isBlank();
    }

    //Check that array element with index 3 equals to provided value (second param)
    public Boolean isArrayElementWithIndex3EqualsToProvidedString(String[] array, String value) {
        return Array.get(array, 2).equals(value);
    }

    //Given String. Check do it contains first char sequence, and second sequence at same moment
    //GOOGLE what methods have Object String in java
    public Boolean doesStringContainsFirstCharSequenceAndTheSecond(String str, String firstSequence, String secondSequence) {
        return str.contains(firstSequence) && str.contains(secondSequence);
    }

    //make an instance of OurTestObjectWithTwoSetFields and set Custom Object field to first field and second
    public OurTestObjectWithTwoSetFields createOurTestObjectWithTwoSetFields() {
        OurTestObjectWithTwoSetFields instance = new OurTestObjectWithTwoSetFields();
        instance.setCustomObjectOne(new CustomObject());
        instance.setCustomObjectTwo(new CustomObject());
        return instance;
    }
}
