public class Wall implements Obstruction{

    private double heightWall;

    public Wall(double heightWall) {
        this.heightWall = heightWall;
    }

    public int jumpWall(Sportsman jumpers) {
        return jumpers.jump(heightWall);
    }

    @Override
    public double getSize() {
        return heightWall;
    }

    public void setHeightWall(double heightWall) {
        this.heightWall = heightWall;
    }
}
