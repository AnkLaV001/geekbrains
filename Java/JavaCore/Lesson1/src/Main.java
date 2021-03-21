public class Main {
    public static void main(String[] args) {

        Human human = new Human("Vasiliy", 42000, 1.5);
        Cat cat = new Cat("Barsik", 800, 2);
        Robot robot = new Robot("Electronik", 80000, 3.5);

        Road[] roads = {new Road(400), new Road(1000), new Road(100000)};
        Wall[] walls = {new Wall(0.5), new Wall(2), new Wall(3)};

        Sportsman[] sportsmans = {human, cat, robot};

        for (Road road : roads) {
            int a;
            for (int i = 0; i < sportsmans.length; i++) {
                a = road.runRoad(sportsmans[i]);
                if (a == 0) {
                    System.out.println(sportsmans[i].getName() + " не смог пробежать " + road.getSize());
                } else if (a == 1) {
                    System.out.println(sportsmans[i].getName() + " смог пробежать " + road.getSize());
                }
            }
        }
        for (Wall wall : walls) {
            int a;
            for (int i = 0; i < roads.length; i++) {
                a = wall.jumpWall(sportsmans[i]);
                if (a == 0) {
                    System.out.println(sportsmans[i].getName() + " не смог прыгнуть на " + wall.getSize());
                } else if (a == 1) {
                    System.out.println(sportsmans[i].getName() + " смог прыгнуть на " + wall.getSize());
                }
            }
        }
    }
}
