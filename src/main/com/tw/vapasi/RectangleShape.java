package com.tw.vapasi;

//Deals with four side shape with four perpendicular angle.
public class RectangleShape {
    private double length;
    private double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public boolean isLengthGreaterThanWidth() {
        return this.length > this.width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }
}
