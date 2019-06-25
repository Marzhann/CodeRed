package com.ubs.objects;

public class Rectangle {
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    Rectangle(Point p1, Point p2, Point p3, Point p4){
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
    }
/*
    double a = this.point1.distance(this.point2);
    double b = this.point2.distance(this.point3);
    double c; = this.point3.distance(this.point4);
    double d; = this.point4.distance(this.point1);
*/
    double perimeter(){
        return 2*(this.point1.distance(this.point2) + this.point2.distance(this.point3));
    }

    boolean isLegal(){
        if(this.point1.distance(this.point2) + this.point2.distance(this.point3) == this.point3.distance(this.point4) + this.point4.distance(this.point1)){
            return true;
        }
        return false;
    }

}
