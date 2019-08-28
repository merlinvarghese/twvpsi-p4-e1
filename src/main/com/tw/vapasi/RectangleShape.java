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
        if(this.length > this.width)
            return true;
        return false;
    }

    public int area() {
        return this.length * this.width;
    }
}
