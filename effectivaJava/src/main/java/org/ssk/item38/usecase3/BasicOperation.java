package org.ssk.item38.usecase3;

/**
 * title        :
 * author       : sim
 * date         : 2023-12-05
 * description  :
 */
public enum BasicOperation {

    PLUS("+"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    },
    TIMES("*"){
        @Override
        public double apply(double x, double y) {
            return x*y;
        }
    },
    DIVIDE("/"){
        @Override
        public double apply(double x, double y) {
            return x/y;
        }
    };

    private final String symbol;


    BasicOperation(String symbol){
        this.symbol = symbol;
    }
/*    public double apply(double x, double y){
        switch (this){
            case PLUS : return x+y;
            case MINUS : return x-y;
            case TIMES : return x*y;
            case DIVIDE: return x/y;
        }

        throw new AssertionError("알 수 없는 연산 : "+this);
    }*/

    abstract double apply(double x, double y);
}
