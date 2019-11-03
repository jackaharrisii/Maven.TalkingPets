package io.zipcoder.polymorphism;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main (String[] args) {
        //SETTING UP MY VARIABLES
        Console console = System.console();
        Integer numberOfPets = 0;
        Scanner scanner = new Scanner(System.in);
        Boolean keepAdding = true;
        String iteration = "first";

        //OLD ARRAYLISTS AND VARIABLES
        ArrayList<String> typesOfPets = new ArrayList<String>();
        ArrayList<String> petNames = new ArrayList<String>();

        //NEW ARRAYLISTS AND VARIABLES FOR PART 3
        ArrayList<Pet> listOfPets = new ArrayList<Pet>();
        String typeOfPet;
        String nameOfPet;

        while (keepAdding == true) {
            // -----------THE CONSOLE JUDGES THE USER SOMETIMES-----------------------------------------------------------
            if(numberOfPets == 5){
                System.out.println("\nSweet Jesus, you might have a problem. Are you a hoarder??????\n");}
            if(numberOfPets == 10){
                System.out.println("\nYou have previous generations of cats in your freezer, don't you?\n");}
            if(numberOfPets == 15){
                System.out.println("\nOkay, go ahead an finish telling us about your pets, but I'm calling the cops.\n");}

            //------------GET INFORMATION ABOUT THE USER'S PETS-----------------------------------------------------------
            System.out.println(String.format("What kind of pet is your %s pet?\n(options: cat, dog, horse)", iteration));
            typeOfPet = scanner.next();
//            typesOfPets.add(scanner.next());
            System.out.println("What is this pet's name?");
            nameOfPet = scanner.next();
//            petNames.add(scanner.next());
            if (typeOfPet.equals("cat")){listOfPets.add(new Cat(nameOfPet));}
            else if (typeOfPet.equals("dog")){listOfPets.add(new Dog(nameOfPet));}
            else if (typeOfPet.equals("horse")){listOfPets.add(new Horse(nameOfPet));}
            else {new Pet(nameOfPet);}
            System.out.println("Would you like to add another pet? (Y/N)");
            if (scanner.next().toUpperCase().equals("N")) {
                keepAdding = false;
            }
            iteration = "next";
            numberOfPets++;
        }
        for (int i = 0; i < listOfPets.size(); i++) {
//            System.out.println(String.format("You have a %s named %s.", typesOfPets.get(i), petNames.get(i)));
            System.out.println(String.format("%s says %s.", listOfPets.get(i).getPetName(), listOfPets.get(i).speak()));
        }

        //-----------CUSTOM ENDINGS-----------------------
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
