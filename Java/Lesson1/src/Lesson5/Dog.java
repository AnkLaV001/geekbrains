package Lesson5;

public class Dog extends Animals {
    private double distanceOfRun = 600;
    private double heightOfJump = 0.5;
    private double distanceOfSwim = 10;

    Dog(String name) {
        super(name);
    }

    @Override
    public int run(double distance) {
        return (distance <= this.distanceOfRun) ? ACTION_OK : ACTION_FAIL;
    }

    @Override
    public int jump(double height) {
        return (height <= this.heightOfJump) ? ACTION_OK : ACTION_FAIL;
    }

    @Override
    public int swim(double distance) {
        return (distance <= this.distanceOfSwim) ? ACTION_OK : ACTION_FAIL;
    }

}

