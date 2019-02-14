package com.playtika.automation;

import java.util.Scanner;

public class GridWriter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of spaces (3, 6, 9): ");
        int spaces = console.nextInt();

        if(spaces == 3 || spaces == 6 || spaces == 9) {
                for(int i = 0; i < 4; i++) {
                    for (int j = 0; j < 5 + (4 * spaces); j++) { //first line
                        System.out.print("*");
                    }
                System.out.println();


                for (int l=0; l < (spaces / 3); l++) { //second line
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                        for (int k = 0; k < spaces; k++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                }
                } else{
            System.out.println("You've entered wrong value!");

        }

    }
}