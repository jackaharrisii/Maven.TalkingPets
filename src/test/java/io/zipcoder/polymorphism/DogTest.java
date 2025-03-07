package io.zipcoder.polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Henry");
        String expected = "Woof!!!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getDogNameTest() {
        Dog dog = new Dog("Tim");
        Dog dog1 = new Dog("Kathy");
        Dog dog2 = new Dog("Bob");

        String expected = "Kathy";
        String actual = dog1.getPetName();
        Assert.assertEquals(expected, actual);
    }
}

