public class Main {
    public static void main (String[] args){
        Human human = new Human("Vasiliy", 3, 1);
        Cat cat = new Cat("Barsik", 2, 2);
        Robot robot = new Robot("Electronik", 10, 3);
        human.run();
        cat.jump();
        robot.run();
    }
}
