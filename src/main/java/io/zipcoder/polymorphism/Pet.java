package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {

    public String petName;

    public Pet(String petName) {
        this.petName = petName;
    }


    public String speak(){
        return "I'm a pet";
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String name) {
        this.petName = name;
    }

}
