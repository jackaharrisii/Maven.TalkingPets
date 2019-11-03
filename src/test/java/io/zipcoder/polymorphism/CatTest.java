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

//    @Test
//    public void catSpeakTest() {
//        Cat cat = new Cat();
//        String expected = "Meow Meow";
//        String actual = cat.speak();
//        Cat[] catList = new Cat[]{cat1, cat2, cat};
//
//        Assert.assertEquals(expected, actual);


    @Test
    public void geCatNameTest() {
        Cat cat = new Cat("Tim");
        Cat cat1 = new Cat("Kathy");
        Cat cat2 = new Cat("Bob");
        System.out.println(cat.speak());
        System.out.println(cat.getClass().getName());
//        System.out.println(cat.sleepAllDay());


////        String expected = "Kathy";
////        String actual = petList[1].getName();
//
//        Assert.assertEquals(expected, actual);
    }
}


