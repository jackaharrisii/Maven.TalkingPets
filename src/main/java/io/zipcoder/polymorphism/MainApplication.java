package io.zipcoder.polymorphism;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main (String[] args) {
        Console console = System.console();
        Integer numberOfPets = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> typesOfPets = new ArrayList<String>();
        ArrayList<String> petNames = new ArrayList<String>();
        Boolean keepAdding = true;
        String iteration = "first";

        while (keepAdding == true) {
            if(numberOfPets == 5){
                System.out.println("\nSweet Jesus, you might have a problem. Are you a hoarder??????\n");}
            if(numberOfPets == 10){
                System.out.println("\nYou have previous generations of cats in your freezer, don't you?\n");}
            if(numberOfPets == 15){
                System.out.println("\nOkay, go ahead an finish telling us about your pets, but I'm calling the cops.\n");}
            System.out.println(String.format("What kind of pet is your %s pet?\n(options: cat, dog, horse)", iteration));
            typesOfPets.add(scanner.next());
            System.out.println("What is this pet's name?");
            petNames.add(scanner.next());
            System.out.println("Would you like to add another pet? (Y/N)");
            if (scanner.next().toUpperCase().equals("N")) {
                keepAdding = false;
            }
            iteration = "next";
            numberOfPets++;
        }
        for (int i = 0; i < typesOfPets.size(); i++) {
            System.out.println(String.format("You have a %s named %s.", typesOfPets.get(i), petNames.get(i)));
        }
        if(numberOfPets >= 5 && numberOfPets <10){
            System.out.println("\nYour house is pretty full.\nYou might want to take a hard look at your life choices.....\n");}
        if(numberOfPets >= 10 && numberOfPets < 15){
            System.out.println("\nYour lights flicker as your extra chest freezers in the garage kick on.\n" +
                    "Your power bill is probably going to be pretty high this month......");}
        if(numberOfPets >= 15){
            System.out.println("\nYou hear sirens in the distance.\n" +
                    "If you're going to try to run from the cops, you'd better leave soon.\n" +
                    "You wonder how many cats you can take with you in a backpack........\n");}
    }
}
