package lesson5.homework;

public class Cat1 extends Animal {

    Cat1(String name, float maxJump, float maxRun, float maxSwim) {
        super("Котэ", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE; //-1
    }
}
