package org.ssk.item34.usecase3;

/**
 * title        :
 * author       : sim
 * date         : 2023-11-08
 * description  :
 */
public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("10");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p : Planet.values()){
            System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass));
        }
    }
}
