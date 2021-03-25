import java.util.ArrayList;

public class Box<T extends Fruit> {
    public T owner;





    public static void main(String[] args) {
        Apple apple = new Apple(9);
        Orange orange = new Orange(20);
        Box<Apple> appleBox = new Box<>();
        appleBox.owner = apple;
        Box<Orange> orangeBox = new Box<>();
        orangeBox.owner = orange;

        float fruitWeight = (float) apple.getQuantityFruit() * apple.getAppleWeight();

        System.out.println(fruitWeight);
    }
}
