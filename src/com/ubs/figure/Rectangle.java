package com.ubs.figure;

public class Rectangle extends Figure {
    int a;
    int b;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    int perimeter(){
        return 2*(this.a+this.b);
    }
}
