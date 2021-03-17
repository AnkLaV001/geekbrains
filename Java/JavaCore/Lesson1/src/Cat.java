public class Cat extends Animal{

    public Cat(String name, int MaxDistance, int heightJump){
        super(name, MaxDistance, heightJump);
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }
}
