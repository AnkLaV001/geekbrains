package lesson5.homework;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 16.12.2020
 */

public abstract class Animal {
    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private final String type;
    private final String name;
    private final float maxRun;
    private final float maxSwim;
    private final float maxJump;
    private final Random random = new Random();

    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
        float jumpDiff = random.nextFloat() * maxJump - (maxJump / 4);
        float runDiff = random.nextFloat() * maxRun - (maxRun / 25);
        float swimDiff = random.nextFloat() * maxSwim - (maxSwim / 100);

        this.type = type;
        this.name = name;
        this.maxJump = maxJump + jumpDiff;
        this.maxRun = maxRun + runDiff;
        this.maxSwim = maxSwim + swimDiff;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    float getMaxJump() {
        return this.maxJump;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
//        if (distance <= maxSwim) {
//            return SWIM_OK;
//        } else {
//            return SWIM_FAIL;
//        }
    }

    protected boolean jump(float height) {
        return (height <= maxJump);
    }
}