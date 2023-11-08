package org.ssk.item34.usecase5;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-08
 * description  :
 */
public enum Operation {

    PLUS {public double apply(double x, double y){return x+y;}},
    MINUS {public double apply(double x, double y){return x+y;}},
    TIMES {public double apply(double x, double y){return x+y;}},
    DIVIDE {public double apply(double x, double y){return x+y;}};

    abstract double apply(double x, double y);
}
