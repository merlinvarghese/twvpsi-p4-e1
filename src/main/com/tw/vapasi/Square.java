package com.tw.vapasi;

//Deal with shape of four equal sides making right angle with each other.
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * (this.side);
    }
}
