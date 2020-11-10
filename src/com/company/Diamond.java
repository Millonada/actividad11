package com.company;

public class Diamond implements Shape {
    public double D;
    public double d;
    public double l;

    public Diamond(double D, double d, double l) {
        this.D = D;
        this.d = d;
        this.l = l;
    }

    @Override
    public double getArea() {
        return D*d;
    }

    @Override
    public double getPerimeter() {
        return l+l+l+l;
    }
}
