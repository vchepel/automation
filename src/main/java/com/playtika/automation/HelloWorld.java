package com.playtika.automation;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String s = console.nextLine();
        System.out.printf("You have entered: %s", s);

        //System.out.println("Vector (5, 0, 0) => (" + (int) b + ", " + (int) c + ", " + (int) d + ")");

       /* int a = 110;
        int b = 20;
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        System.out.printf("%s => %d + %d = %d","Result", a, b, c);*/

    }
}
