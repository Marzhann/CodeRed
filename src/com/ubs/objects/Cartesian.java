package com.ubs.objects;

public class Cartesian {
    public static void main(String[] arg){

        Point a = new Point(4,3);
        Point b = new Point(4,3);

        System.out.println("A distance btw 2 points is: " + a.distance(b));

        //rectangle
        Point p1 = new Point(-4,3);
        Point p2 = new Point(-4,-3);
        Point p3 = new Point(4,-3);
        Point p4 = new Point(4,3);

        Rectangle rectangle = new Rectangle(p1,p2,p3,p4);

        if (rectangle.isLegal()){
            System.out.println("A perimeter of a rectangle is: " + rectangle.perimeter());
        }
        else{
            System.out.println("Oops... Sorry, this is not a valid rectangle");
        }

        Point[] fCoordinates = new Point[4];
        fCoordinates[0] = p1;
        fCoordinates[1] = p2;
        fCoordinates[2] = p3;
        fCoordinates[3] = p4;

        Point[] f2Coordinates = new Point[4];
        f2Coordinates[0] = new Point(-4,3);
        f2Coordinates[1] = new Point(-4,-3);
        f2Coordinates[2] = new Point(4,-3);
        f2Coordinates[3] = new Point(4,3);

        Figure figure = new Figure(fCoordinates);
        Figure figure2 = new Figure(f2Coordinates);

        System.out.println("Number of points of a FIGURE " + figure.numberOfPoints());

        if(figure.isEqual(figure2)){
            System.out.println("Given two figures are equal");
        }
        else {
            System.out.println("Not equal figures");
        }


    }
}
