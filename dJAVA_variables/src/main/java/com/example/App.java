package com.example;

public class App {

    static int globalX = 10;

    public static void main(String[] args) {

        String name = "Nguyen Duc Tay";
        int birthYear = 1999;
        boolean isStraight = true;
        char firstLetter = 'T';

        System.out.println("Full name: " + name);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Is straight? " + isStraight);
        System.out.println("Fistname letter: " + firstLetter);

        double localX = 10.5;

        if (isStraight = true) {

            float blockX = 10.5f;

            System.out.println(blockX);
        }

        System.out.println(globalX);
        System.out.println(localX);
        //System.out.println(blockX); error

    }
}
