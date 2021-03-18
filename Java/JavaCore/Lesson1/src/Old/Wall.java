package Old;

public class Wall {
    private double heightWall;

    public Wall(double heightWall) {
        this.heightWall = heightWall;
    }

    public int jumpWall(CanJump jumpers) {
        return jumpers.jump(heightWall);
    }

    public double getHeightWall() {
        return heightWall;
    }

    public void setHeightWall(double heightWall) {
        this.heightWall = heightWall;
    }
}
