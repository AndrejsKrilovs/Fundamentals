package com.company;

import com.company.classes.ClassWithField;
import com.company.classes.ObjectForConfiguration;

import java.util.stream.IntStream;

public class Developer {


    //Number is given as a String. Check that that number is natural (return true or false)
    public Boolean checkNumberIsNatural(String number) {
        try {
            return Integer.parseInt(number) > 0;
        } catch (NumberFormatException nfe) {
//            throw new NumberFormatException("Invalid number");
            return false;
        }
    }

    //array is given find all elements SUM
    public int getSumOfNumbersInsideArray(int[] array) {
        return IntStream.of(array).sum();
    }

    //You need create and return ObjectForConfiguration object. Set to first field 11, to second 22, to third 33
    public ObjectForConfiguration createObject() {
        ObjectForConfiguration instance = new ObjectForConfiguration();
        instance.setFirstField(11);
        instance.setSecondField(22);
        instance.setThirdField(33);
        return instance;
    }

    //Call method secretField of object ObjectForConfiguration with parameter 22;
    public void createObjectCallMethodAndReturn(ObjectForConfiguration objectForConfiguration) {
        objectForConfiguration.secretActionMethod(22);
    }

    /**
     * is given to objects of type  ClassWithField, that class have field valueInClass. Need to return that class, that have bigger value of valueInClass. Or return
     * first instance if value equals.
     */
    public ClassWithField getClassWithBiggerValue(ClassWithField first, ClassWithField second) {
        if(first.getValueInClass() > second.getValueInClass())
            return first;
        else if(first.getValueInClass() < second.getValueInClass())
            return second;
        else
            return new ClassWithField(Integer.MAX_VALUE);
    }

}
