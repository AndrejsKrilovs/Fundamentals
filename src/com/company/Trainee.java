package com.company;

import com.company.classes.CustomObject;

public class Trainee {

    //return "Hello"
    public String sayHello() {
        return "Hello";
    }

    //Return biggest number
    public int getMaxNumber(Integer a, Integer b) {
        return Integer.max(a, b);
    }

    //Return true if number is bigger then 20, false other side
    public Boolean isBiggerThen20(Integer a) {
        return a > 20;
    }

    //return sum of two numbers
    public int sumOfTwoNumber(int a, int b) {
        return Integer.sum(a, b);
    }

    //Return new instance (Object) of CustomObject Class, custom object already defined
    public CustomObject createCustomObject() {
        return new CustomObject();
    }

}
