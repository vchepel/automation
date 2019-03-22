package com.playtika.automation.triangles;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float distance(Point p1){
        return (float) Math.sqrt(
                (x - p1.getX()) * (x - p1.getX()) +
                        (y - p1.getY()) * (y - p1.getY())
        );

     }

}