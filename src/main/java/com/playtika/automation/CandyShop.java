package com.playtika.automation;

import java.util.Scanner;

public class CandyShop {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("1kg Candies price: ");
        float candy = console.nextFloat();

        System.out.println("1kg Cookies price: ");
        float cookies = console.nextFloat();

        System.out.println("Summary for one order = " + calculatedPrice(candy, cookies));
        System.out.println("Summary for three orders = " + calculatedSecondPrice(candy, cookies));
    }

    public static float calculatedPrice(float candiesKgPrice, float cookiesKgPrice){
        float orderPrice = 0.3f * candiesKgPrice + 0.4f * cookiesKgPrice;
        return orderPrice;

    }

    public static float calculatedSecondPrice(float moreCandies, float moreCookies){
        float secondOrderPrice = (1.8f * moreCandies + 2f * moreCookies) * 3;
        return secondOrderPrice;
    }
}
