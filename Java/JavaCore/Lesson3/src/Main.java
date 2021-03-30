import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Apple> appleBox = new ArrayList<>(18);
//        ArrayList<Orange> orangeBox = new ArrayList<>(12);
        Box<Apple> appleBox1 = new Box<Apple>(new ArrayList<Apple>(Arrays.asList(new Apple[18])));
        Box<Orange> orangeBox1 = new Box<Orange>(new ArrayList<Orange>(Arrays.asList(new Orange[12])));
        System.out.println("Вес коробки с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки с опельсинами: " + orangeBox1.getWeight());
        System.out.println("Сравнение веса коробок: " + appleBox1.compareTo(orangeBox1));
        appleBox1.addFruits(new Apple(), 6);



    }
}

//1) Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

//2) Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//3) Для хранения фруктов внутри коробки можно использовать ArrayList;

//4) Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и
// их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

//5) Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
// которую подадут в compare() в качестве параметра. true – если их массы равны, false в
// противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

//6) Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
// в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

//7) Не забываем про метод добавления фрукта в коробку.
