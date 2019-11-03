package io.zipcoder.polymorphism;

public class Pet {

    public String petName;

    public String speak(){
        return "I'm a pet";
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet(String petName) {
        this.petName = petName;
    }
}
