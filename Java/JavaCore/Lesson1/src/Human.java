public class Human extends Animal implements RunRoad{

    public Human(String name, int MaxDistance, int heightJump){
        super(name, MaxDistance, heightJump);
    }

    @Override
    public void run() {
        System.out.println("Человек пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    @Override
    public int run(int length) {
        return 0;
    }
}
