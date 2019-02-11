package com.playtika.automation;

import java.util.Scanner;

public class SpeedConverter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter time (minutes): ");
        long minutes = console.nextLong();

        System.out.println("Enter distance (kilometers): ");
        long distance = console.nextLong();

        System.out.println("Speed (m/s): " + convertSpeed(minutes,distance));
    }

    public static long convertSpeed (long distanceKm, long timeMinutes) {

        long result = (distanceKm * 1000) / (timeMinutes * 60);
        return result;
    }
}
