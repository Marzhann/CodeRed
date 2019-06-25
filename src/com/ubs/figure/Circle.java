package com.ubs.figure;

public class Circle extends Figure{
    int r;

    Circle(int r){
        this.r = r;
    }

    @Override
    int perimeter(){
        return 2*this.r;
    }
}
