package com.playtika.automation;

public class ThirdEx {

    public static void main(String[] args) {

        int x = 5;
        int y = 0;
        int z = 0;
        double a = Math.sqrt(x * x + y * y + z * z);


        double b = x / a;
        double c = y / a;
        double d = z / a;
        System.out.printf("%s => (%d, %d, %d)","Vector (5, 0, 0)", (int)b, (int)c, (int)d);

    }

}
