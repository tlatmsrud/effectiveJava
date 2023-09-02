package org.ssk.item2;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-02
 * description  :
 */
public class BuilderTest {
    public static void main(String[] args) {
        new NutritionFacts.Builder(10)
                .calories(100)
                .sodium(10)
                .carbohydrate(10)
                .servingSize(10)
                .fat(1)
                .build();
    }
}
