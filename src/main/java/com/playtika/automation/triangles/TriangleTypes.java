package com.playtika.automation.triangles;

public enum TriangleTypes {
    RIGHT_TRIANGLE("RIGHT_TRIANGLE"),
    EQUILATERAL("EQUILATERAL"),
    ISOSCELES("ISOSCELES"),
    SCALENE("SCALENE");

    private String type;

    TriangleTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
