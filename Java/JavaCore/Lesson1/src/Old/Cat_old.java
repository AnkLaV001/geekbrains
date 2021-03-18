package Old;

public class Cat_old extends Runners implements CanRun, CanJump {

    public Cat_old(String name, int MaxDistance, double heightJump){
        super(name, MaxDistance, heightJump);
    }

    @Override
    public int run(int length) {
        if(super.getMaxDistance() >= length){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int jump(double height) {
        if (super.getHeightJump() >= height) {
            return 1;
        } else {
            return 0;
        }
    }
}
