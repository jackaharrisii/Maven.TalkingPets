package io.zipcoder.polymorphism;

public class Cat extends Pet{

    public String speak() {
        return "Meow";
    }

    public String getName() {
        return null;
    }

    public Cat(String name) {
        super(name);
    }

    public String sleepAllDay(){
        return "Sleep all day";
    }
}

