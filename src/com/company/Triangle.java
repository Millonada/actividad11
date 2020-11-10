package com.company;

public class Triangle implements Shape {
    public double b;
    public double h;
    public double l1;
    public double l2;
    public double l3;

    public double r;

    public Triangle(double b, double h, double l1, double l2, double l3) {
        this.b = b;
        this.h = h;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double getArea() {
        r=(b*h)/2;

        return r;
    }

    @Override
    public double getPerimeter() {
        return l1+l2+l3;
    }
}
