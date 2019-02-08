package com.playtika.automation;

public class FirstEx {

    public static void main(String[] args) {
        funct1();
        funct2();
        funct3();
        funct4();

    }

    public static void funct1() {
        long x = 2215;
        long y = 37;
        long z = 5;
        long n = 2;
        long a = x - (y + 123) / z * n;
        System.out.println(a);
    }

    public static void funct2() {

        int x = 200;
        int y = 5;
        int z = 2;
        int n = 2;
        int a = (x + (50 - y * z) / n) - x;
        System.out.println(a);
    }


   public static void funct3() {

        float x = 2;
        float y = 100;
        float z = 12;
        float n = 20;
        float a = x / (y * (z-1) - 564) + n;
        System.out.println(a);
    }

    public static void funct4() {

        double x = 20;
        double y = 40;
        double z = 80;
        double n = 25;
        double a = -x / -y + z / (n + 15);
        System.out.println(a);

    }


}
