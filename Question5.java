
/**
 * Question 5.
  */
import java.util.*;

class Question5 {
    private static class Fruit {

    }

    private static class Apple extends Fruit {
    }

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        eatFruit(apples);
    }

    private static void eatFruit(List<? extends Fruit> fruit) {
        System.out.println("I am eating fruit");
    } 
}

