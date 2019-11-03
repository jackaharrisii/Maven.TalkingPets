package io.zipcoder.polymorphism;

public class Horse extends Pet{

    public Horse (String petName){
        super(petName);
    }

    public String speak() {
        return "Neigh";
    }
}
