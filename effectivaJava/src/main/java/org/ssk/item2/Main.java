package org.ssk.item2;

/**
 * title        :
 * author       : sim
 * date         : 2023-09-02
 * description  :
 */
public class Main {

    public static void main(String[] args) {
        NutritionFact nutritionFact = new NutritionFact(10, 10,1,1,1,1);

        int servings = nutritionFact.getServings();

        if(servings >= 10){

            // 1회 제공량이 10개 이상일 경우에 대한 비지니스 로직
        }

        new NutritionFacts.Builder(10).carbohydrate(10).sodium(5);
    }
}
