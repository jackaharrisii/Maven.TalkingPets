package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog (String petName){
        super(petName);
    }

    public String speak() {
        return "Woof!!!";
    }
}

