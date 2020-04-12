package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; // number of your tries
        int range = 0;
        int yourNumber = 0;     // variable you are writing
        String level;
        int secretNumber = 1 + (int) (Math.random() * 99); //random number inn range from 1 to 100

        System.out.println("  ***GUESSING MY NUMBER GAME***");

        System.out.print("     What level do you want?:");
        while (true) {
            level = scanner.nextLine().toLowerCase();
            if (level.equals("easy")) {
                range = 20;
                break;
            } else if (level.equals("medium")) {
                range = 15;
                break;
            } else if (level.equals("hard")) {
                range = 8;
                break;
            }
            System.out.print("write easy/medium/hard:");
        }

        System.out.println("");
        System.out.print("I am thinking of number  from 1 to 100" + " ... guess what it is?:");

        while (yourNumber != secretNumber) {
            yourNumber = scanner.nextInt();
            count++;
            if (range == count) {
                System.out.println("You lose! Try again.");
            }
            else if (count < range){
                if (yourNumber > secretNumber) {
                    System.out.println("lower!");
                } else if (yourNumber < secretNumber) {
                    System.out.println("higher!");
                }
            }
        }
        if (count > 1) {
            System.out.println("Congratulations. You guessed the number with " + count + " tries!");
        } else {
            System.out.println("Congratulations. You guessed the number with " + count + ". try!");
        }
    }
}
