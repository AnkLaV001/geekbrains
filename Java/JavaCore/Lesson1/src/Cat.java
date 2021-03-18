public class Cat implements Sportsman {

    private String name;
    private int maxDistance;
    private double heightJump;

    public Cat(String name, int maxDistance, double heightJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.heightJump = heightJump;
    }

    @Override
    public int run(int length) {
        if(this.maxDistance >= length){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int jump(double height) {
        if (this.heightJump >= height) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public double getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(double heightJump) {
        this.heightJump = heightJump;
    }
}
