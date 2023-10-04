package org.ssk.item23.usecase2;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-04
 * description  :
 */
public class Circle extends Figure{

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }

    public String hi(){
        return "hihi";
    }
}
