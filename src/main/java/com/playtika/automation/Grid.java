package com.playtika.automation;

import java.util.Scanner;

public class Grid {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of spaces (3, 6, 9): ");
        int spaces = console.nextInt();

        if (spaces == 3 || spaces == 6 || spaces == 9){

            for (int i = 0; i < 9; i++){
                if (i % 2 == 0){
                    firstLineCreation(spaces);
                }else {
                    secondLineCreation(spaces);
                }
            }

        }else {
            System.out.println("You've entered a wrong number!");
        }
        }

        public static void firstLineCreation (int starsNumber){
        for (int i = 0; i < 5 + (4 * starsNumber); i++) {
            System.out.print("*");
        }
        System.out.println();
    } // first method ends

    public static void secondLineCreation(int spacesNumber) {
        for(int k = 0; k < spacesNumber / 3; k++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
                for (int j = 0; j < spacesNumber; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // second method ends
    }

