package Old;
public class Main_old {
    public static void main(String[] args) {

        Human_old human = new Human_old("Vasiliy", 42000, 1.5);
        Cat_old cat = new Cat_old("Barsik", 800, 2);
        Robot_old robot = new Robot_old("Electronik", 80000, 3.5);

        Road[] roads = {new Road(400), new Road(1000), new Road(100000)};
        Wall[] walls = {new Wall(0.5), new Wall(2), new Wall(3)};

        for (Road road : roads) {
            Runners[] runners = {human, cat, robot};
            int a;
            for (int i = 0; i < runners.length; i++) {
                a = road.runRoad((CanRun) runners[i]);
                if (a == 0) {
                    System.out.println(runners[i].getName() + " не смог пробежать " + road.getLengthRoad());
                } else if (a == 1) {
                    System.out.println(runners[i].getName() + " смог пробежать " + road.getLengthRoad());
                }
            }
        }
        for (Wall wall : walls) {
            Runners[] runners = {human, cat, robot};
            int a;
            for (int i = 0; i < roads.length; i++) {
                a = wall.jumpWall((CanJump) runners[i]);
                if (a == 0) {
                    System.out.println(runners[i].getName() + " не смог прыгнуть на " + wall.getHeightWall());
                    break;
                } else if (a == 1) {
                    System.out.println(runners[i].getName() + " смог прыгнуть на " + wall.getHeightWall());
                }
            }
        }
    }
}
