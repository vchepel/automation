package com.playtika.automation.triangles;

public class Triangle {
    Point a, b, c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public float perimeter() {
        float sideA = a.distance(b);
        float sideB = b.distance(c);
        float sideC = c.distance(a);
        return sideA + sideB + sideC;
    }


    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(
                p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a))
        );
    }


    public String getType() {
        String type = null;
        if (isRightTriangle()) {
            type = TriangleTypes.RIGHT_TRIANGLE.getType();
        } else if (isEquilateral()) {
            type = TriangleTypes.EQUILATERAL.getType();
        } else if (isIsosceles()) {
            type = TriangleTypes.ISOSCELES.getType();
        } else if (isScalene()) {
            type = TriangleTypes.SCALENE.getType();
        }
        return type;
    }


    //прямоугольный
    public boolean isRightTriangle() {
        boolean result = false;
        if (c.distance(a) * c.distance(a) == a.distance(b) * a.distance(b) + b.distance(c) * b.distance(c)) {
            result = true;
        }
        return result;
    }


    //равносторонний
    public boolean isEquilateral() {
        boolean result = false;
        if (a.distance(b) == b.distance(c) && b.distance(c) == c.distance(a)) {
            result = true;
        }
        return result;
    }


    //равнобедренный
    public boolean isIsosceles() {
        boolean result = false;
        if (
                (a.distance(b) == b.distance(c) && a.distance(b) != c.distance(a)) ||
                        (a.distance(b) == c.distance(a) && a.distance(b) != b.distance(c)) ||
                        (b.distance(c) == c.distance(a) && b.distance(c) != a.distance(b))

        ) {
            result = true;
        }
        return result;

    }


    //произвольный
    public boolean isScalene() {
        boolean result = false;
        if (a.distance(b) != b.distance(c) && a.distance(b) != c.distance(a) && b.distance(c) != c.distance(a)) {
            result = true;
        }
        return result;
    }

}