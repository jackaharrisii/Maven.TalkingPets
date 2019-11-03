package io.zipcoder.polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Bo");
        String expected = "Meow Meow";
        String actual = cat.speak();


        Assert.assertEquals(expected, actual);
    }


    @Test
    public void geCatNameTest() {
        Cat cat = new Cat("Tim");
        Cat cat1 = new Cat("Kathy");
        Cat cat2 = new Cat("Bob");
        System.out.println(cat.speak());
        System.out.println(cat.getClass().getName());
        String expected = "Kathy";
        String actual = cat.getPetName();

        Assert.assertEquals(expected, actual);
    }
}


