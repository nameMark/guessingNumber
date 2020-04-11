package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // number of your tries
        int range = 0;
        int yourNumber = 0;     // variable you are writing
        String level;


        System.out.println("  ***GUESSING MY NUMBER GAME***");

        System.out.print("     What level do you want?:");
        while (true) {

            level = scanner.nextLine().toLowerCase();
            if (level.equals("easy")) {
                count = 30;
                break;
            } else if (level.equals("medium")) {
                count = 15;
                break;
            } else if (level.equals("hard")) {
                count = 3;
                break;
            }
            System.out.println("write easy/medium/hard");
        }

            int secretNumber = 1 + (int) (Math.random() * 99); //random number inn range from 1 to 100

            System.out.println("");
            System.out.print("I am thinking of number  from 1 to 100"
                    + " ... guess what it is?:");
            do {
                yourNumber = scanner.nextInt();
                count++;
                if (level.equals("easy") && count < 30){
                    System.out.println("You lose!");
                    if (yourNumber > secretNumber) {
                        System.out.println("lower!");
                    } else if (yourNumber < secretNumber) {
                        System.out.println("higher!");
                    }
                }

            }
                while (yourNumber != secretNumber);




                if (count > 1) {
                    System.out.println("Congratulations. You guessed the number with "
                            + count + " tries!");
                } else {
                    System.out.println("Congratulations. You guessed the number with "
                            + count + ". try!");
                }


    }
}
