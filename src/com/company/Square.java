package com.company;

public class Square implements Shape {
    public double base;

    public Square(double base) {
        this.base=base;

    }

    @Override
    public double getArea() {
    return base*base;
    }

    @Override
    public double getPerimeter() {
    return base*4;
    }
}
