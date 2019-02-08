package com.playtika.automation;

import java.util.Scanner;

public class CandyShop {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("1kg Candies price: ");
        float candy = console.nextFloat();

        System.out.println("1kg Cookies price: ");
        float cookies = console.nextFloat();

        //float orderPrice = 0.3f * candy + 0.4f * cookies;

        //System.out.println("Summary = " + orderPrice);
        System.out.println("Summary = " + calculatedPrice(candy, cookies));
    }
    public static float calculatedPrice(float candiesKgPrice, float cookiesKgPrice){
        float orderPrice = 0.3f * candiesKgPrice + 0.4f * cookiesKgPrice;
        return orderPrice;

    }
}
