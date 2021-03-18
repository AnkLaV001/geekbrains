package Old;

public class Human_old extends Runners implements CanRun, CanJump {

    public Human_old(String name, int maxDistance, double heightJump){
        super(name, maxDistance, heightJump);
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
