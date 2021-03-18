package Old;

public class Road {

    private int lengthRoad;

    public Road(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }

    public int runRoad(CanRun runner) {
        return runner.run(lengthRoad);
    }

    public int getLengthRoad() {
        return lengthRoad;
    }

    public void setLengthRoad(int lengthRoad) {
        this.lengthRoad = lengthRoad;
    }
}
