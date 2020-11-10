package com.company;

public class Circle implements Shape {
    public double radio;
    public double diametro;
    public double r;

    public Circle(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double getArea() {
        r=Math.pow(radio,2);
        return 3.1416*r;
    }

    @Override
    public double getPerimeter() {
        return 3.1416*diametro;
    }
}
