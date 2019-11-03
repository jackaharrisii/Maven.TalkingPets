package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Horse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    @Test
    public void horseSpeakTest() {
        Horse horse = new Horse("Dan");
        String expected = "Neigh Neigh";
        String actual = horse.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHorseNameTest()    {
        Horse horse = new Horse("Tim");
        Horse horse1 = new Horse("Kathy");
        Horse horse2 = new Horse("Bob");



        String expected = "Kathy";
        String actual = horse.getPetName();
        Assert.assertEquals(expected, actual);
    }



}

