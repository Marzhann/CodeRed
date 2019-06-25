package com.ubs.figure;

public class Main {
    public static void main(String[] args){
        //Figure fig = new Figure();
        Rectangle rec = new Rectangle(4,8);
        Circle cir = new Circle(6);

        Figure someFigure = new Circle(6);

        System.out.println("Parameter of the rectangle: " + rec.perimeter());
        System.out.println("Parameter of the circle: " + cir.perimeter());

        System.out.println("Parameter of the some figure: " + someFigure.perimeter());

    }
}
