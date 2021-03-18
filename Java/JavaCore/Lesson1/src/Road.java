public class Road implements Obstruction{

    private int lengthRoad;

    public Road(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }

    public int runRoad(Sportsman runner) {
        return runner.run(lengthRoad);
    }

    public void setLengthRoad(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }

    @Override
    public double getSize() {
        return lengthRoad;
    }
}
