package com.tw.vapasi;

//Deals with four side shape with four perpendicular angle.
public class RectangleShape {
    private int length;
    private int width;

    public RectangleShape(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public boolean isLengthGreaterThanWidth() {
        return this.length > this.width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int perimeter() {
        return 2*(this.length + this.width);
    }
}
