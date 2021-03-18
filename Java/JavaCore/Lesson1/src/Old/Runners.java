package Old;
public abstract class Runners {

    private String name;
    private int maxDistance;
    private double heightJump;

    public Runners(String name, int maxDistance, double heightJump) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.heightJump = heightJump;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public double getHeightJump() {
        return heightJump;
    }
}
