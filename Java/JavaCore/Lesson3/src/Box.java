import java.util.ArrayList;

public class Box<T extends Fruit> {
    public T owner;


    public static void main(String[] args) {
        Apple apple = new Apple(8, 1);
        Orange orange = new Orange(10, 1.5f);
        Box<Apple> appleBox = new Box<>();
        appleBox.owner = apple;
        Box<Orange> orangeBox = new Box<>();
        orangeBox.owner = orange;

        float fruitWeight = apple.getQuantityFruit() * apple.getWeightFruit();

        System.out.println(fruitWeight);
    }
}
