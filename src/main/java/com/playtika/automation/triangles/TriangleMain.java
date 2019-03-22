package com.playtika.automation.triangles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TriangleMain {
    public static List<Triangle> triangles = new ArrayList<>();

    public static List<Triangle> generateTriangles() {
        for (int i = 1; i <= 100000; i++) {
            triangles.add(new Triangle(
                    new Point(new Random().nextFloat(), new Random().nextFloat()),
                    new Point(new Random().nextFloat(), new Random().nextFloat()),
                    new Point(new Random().nextFloat(), new Random().nextFloat())));
        }

        System.out.println("Triangles generated!");
        return triangles;
    }


    public static String typeSelector(int item) {
        switch (item) {
            case 1:
                return TriangleTypes.RIGHT_TRIANGLE.getType();
            case 2:
                return TriangleTypes.EQUILATERAL.getType();
            case 3:
                return TriangleTypes.SCALENE.getType();
            case 4:
                return TriangleTypes.ISOSCELES.getType();
        }
        return null;
    }



           public static Triangle getTriangleByType(String type){
                Triangle triangleToReturn = null;
                for (Triangle triangle : triangles) {
                    if (triangle.getType().equals(type)) {
                        triangleToReturn = triangle;
                        break;
                    }
                }
                return triangleToReturn;
            }


    public static void main(String[] args) {
        List<Triangle> triangles = generateTriangles();

        Scanner console = new Scanner(System.in);
        System.out.println("Enter triangle type: 1, 2, 3, 4");

        int a = console.nextInt();
        Triangle triangle = getTriangleByType(typeSelector(a));

        System.out.println(triangle.toString());

    }

}