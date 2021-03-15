package lesson5.homework;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.02.2021
 */

public class Bird1 extends Animal{

    Bird1(String name, float maxJump, float maxRun, float maxSwim) {
        super("Птичко", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE; //-1
    }
}
