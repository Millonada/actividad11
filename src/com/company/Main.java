package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner read = new Scanner(System.in);
        int opcion;
        double b,h,l,diametro,radio,D,d,l1,l2,l3;
        boolean salir = false;
        String opcionArea;

        do {
            System.out.println("Area y Periemetros de las figuras geometricas");
            System.out.println("Selecciona una figura de la siguiente lista");
            System.out.println("1-Cuadrado ");
            System.out.println("2-Triangulo ");
            System.out.println("3-Circulo ");
            System.out.println("4-Romboide ");
            System.out.println("5-Rombo ");
            System.out.println("6-Salir");
            opcion = read.nextInt();

            switch (opcion){
                case 1:
                    // cuadrado
                    System.out.println("Por favor ingresa la base del cuadrado");
                    b=read.nextDouble();
                    Square cuadrado = new Square(b);
                    areaOrPerimetre("Cuadrado",cuadrado);

                    break;
                case 2:
                    // triangulo
                    System.out.println("Por favor ingresa la base del Triangulo");
                    b=read.nextDouble();
                    System.out.println("Por favor ingresa la altura del Triangulo");
                    h=read.nextDouble();
                    System.out.println("Ingresa lado 1");
                    l1=read.nextDouble();

                    System.out.println("Ingresa lado 2");
                    l2=read.nextDouble();
                    System.out.println("Ingresa lado 3");
                    l3=read.nextDouble();


                    Triangle triangulo = new Triangle(b,h,l1,l2,l3);

                    areaOrPerimetre("Triangulo",triangulo);
                    break;
                case 3:
                    // circulo
                    System.out.println("Por favor ingresa el radio del circulo");
                    radio=read.nextDouble();
                    System.out.println("Ahora ingresa el diametro");
                    diametro=read.nextDouble();

                    Circle circulo = new Circle(radio,diametro);
                    areaOrPerimetre("Circulo",circulo);
                    break;
                case 4:
                    //romboide
                    System.out.println("Por favor ingresa la base del Romboide");
                    b=read.nextDouble();
                    System.out.println("Por favor ingresa la altura del Romboide");
                    h=read.nextDouble();
                    Rhomboid romboide = new Rhomboid(b,h);
                    areaOrPerimetre("Romboide",romboide);

                    break;
                case 5:
                    // rombo
                    System.out.println("Por favor ingresa lado mayor");
                    D=read.nextDouble();
                    System.out.println("Por favor ingresa lado menor");
                    d=read.nextDouble();
                    System.out.println("Ingresa lado del rambo");
                    l=read.nextDouble();
                    Diamond rombo = new Diamond(D,d,l);
                    areaOrPerimetre("Rombo",rombo);
                    break;
                case 6:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion invalida intentalo otra vez");
                    break;

            }
        }while (salir != true);


    }

    public static void areaOrPerimetre(String figuraName,Shape shape){
        String opcionArea;
        Scanner read = new Scanner(System.in);
        System.out.println("¿Deseas obtener su Area? (s/n)");
        opcionArea=read.next();
        if (opcionArea.equals("s")){
            System.out.println("El area del "+figuraName+" es: " + shape.getArea());
        }else{
            System.out.println("El perimetro del "+figuraName+" es : " + shape.getPerimeter());
        }
    }
}
