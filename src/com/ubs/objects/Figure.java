package com.ubs.objects;

import java.util.Arrays;

public class Figure {
    Point[] coordinates;

    Figure(Point[] pArr){
        this.coordinates = pArr;
    }

    int numberOfPoints(){
        return coordinates.length;
    }

    double perimeter(){
        double pPerimeter = 0;
        for(int i=0; i < coordinates.length - 1; i++){
            pPerimeter = pPerimeter + coordinates[i].distance(coordinates[i+1]);
        }
        pPerimeter = pPerimeter + coordinates[coordinates.length-1].distance(coordinates[0]);
        return pPerimeter;
    }

    public boolean isEqual(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        for(int i = 0; i < coordinates.length; i++){
            if (!coordinates[i].isEqual(figure.coordinates[i])){
                return false;
            }
        }
        return true;
    }

}
