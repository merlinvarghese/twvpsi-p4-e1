package com.tw.vapasi;

//Deals with four side shape with right angle at each other.
public class Rectangle {
    private double length;
    private double width;

    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    //Static Factory methods
    public static Rectangle createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle(side);
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
