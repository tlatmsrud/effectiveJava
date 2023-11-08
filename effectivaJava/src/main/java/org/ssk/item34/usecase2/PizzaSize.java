package org.ssk.item34.usecase2;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-08
 * description  :
 */
public enum PizzaSize {
    S(14), M(16), L(18);

    private final int size;

    private static final int SIZE_PER_FLOUR = 30; // 가중치
    PizzaSize(int size){
        this.size = size;
    }

    public int amountOfFlour(){
        return size * SIZE_PER_FLOUR;
    }
}
