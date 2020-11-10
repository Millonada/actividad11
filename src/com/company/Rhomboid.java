package com.company;

public class Rhomboid implements Shape {

    public double b;
    public double h;

    public Rhomboid(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return b*h;
    }

    @Override
    public double getPerimeter() {
        return b+b+h+h;
    }
}
