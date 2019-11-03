package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    @Test
    public void petSpeakTest() {
        Pet pet = new Pet("Pete");
        String expected = "Hi, I'm a pet.";
        String actual = pet.speak();
    }

    @Test
    public void getPetNameTest()    {
        Pet pet = new Pet("Tim");
        Pet pet1 = new Pet("Kathy");
        Pet pet2 = new Pet("Bob");



        String expected = "Kathy";
        String actual = pet1.getPetName();
        Assert.assertEquals(expected, actual);
    }







}

