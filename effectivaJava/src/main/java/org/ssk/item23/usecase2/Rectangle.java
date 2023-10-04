package org.ssk.item23.usecase2;

/**
 * title        :
 * author       : sim
 * date         : 2023-10-04
 * description  :
 */
public class Rectangle extends Figure{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
