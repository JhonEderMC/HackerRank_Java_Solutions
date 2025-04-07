package Advanced.Java_Factory_Pattern_05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 enum TypeFoodEnum {
    PIZZA("Pizza", "Fast Food"),
    CAKE("Cake", "Dessert");

    private String name;
    private String ordered;

     TypeFoodEnum(String name, String ordered) {
        this.name = name;
        this.ordered = ordered;
     }

     public static String getName(TypeFoodEnum typeFoodEnum){
         return typeFoodEnum.name;
     }

     public static String getOrdered(TypeFoodEnum typeFoodEnum){
         return typeFoodEnum.ordered;
     }
 }

interface Food {
    String getFoodType();
    String getOrdered();
}

class Pizza implements Food {
    @Override
    public String getFoodType() {
        return TypeFoodEnum.getName(TypeFoodEnum.PIZZA);
    }
    @Override
    public String getOrdered() {
        return TypeFoodEnum.getOrdered(TypeFoodEnum.PIZZA);
    }


}
class Cake implements Food {
    @Override
    public String getFoodType() {
        return TypeFoodEnum.getName(TypeFoodEnum.CAKE);
    }
    @Override
    public String getOrdered() {
        return TypeFoodEnum.getOrdered(TypeFoodEnum.CAKE);
    }
}
class FoodFactory  {
    public Food getFood(String type) {
        if(TypeFoodEnum.getName(TypeFoodEnum.PIZZA).equalsIgnoreCase(type)) {
            return new Pizza();
        } else if(TypeFoodEnum.getName(TypeFoodEnum.CAKE).equalsIgnoreCase(type)) {
            return new Cake();
        } else {
            return null;
        }
    }
}

public class Solution {
    private static String STRING_FACTORY_ORDER = "The factory returned class %s";
    private static String STRING_SOMEONE_ORDER = "Someone ordered a %s!";

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String typeFodd = br.readLine().trim();
            Food food = foodFactory.getFood(typeFodd);
            System.out.println(String.format(STRING_FACTORY_ORDER, food.getFoodType()));
            System.out.println(String.format(STRING_SOMEONE_ORDER, food.getOrdered()));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
