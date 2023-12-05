package org.ssk.item38.usecase1;

/**
 * title        :
 * author       : sim
 * date         : 2023-12-06
 * description  :
 */
public enum ExtendedOperation implements Operation{
    EXP("^"){
        @Override
        public double apply(double x, double y) {
            return Math.pow(x,y);
        }
    },

    REMAINDER("%"){
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;
    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return symbol;
    }
}
