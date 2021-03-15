package lesson5.homework;

public class Dog1 extends Animal {

    Dog1(String name, float maxJump, float maxRun, float maxSwim) {
        super("Пёсель", name, maxJump, maxRun, maxSwim);
    }

    //Так создавать нельзя - ограничения в записи полей конечного объекта
//    Dog1(String name) {
//        super("Пёсель", name, 100, 100, 125);
//    }

}
