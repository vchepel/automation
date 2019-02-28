package com.playtika.automation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {

        nameChecker();
        mailChecker();

    }

    public static void nameChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z{4}a-z0-9- ]+$");
            if (pattern.matcher(name).matches()) {
                System.out.println("Right!");
            } else {
                System.out.println("Wrong");
        }
    }


    public static void mailChecker(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mail: ");
        String mail = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-_]+@[A-Za-z]+.[a-z]+]$");
        if (pattern.matcher(mail).matches()) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong");
        }
    }
}
