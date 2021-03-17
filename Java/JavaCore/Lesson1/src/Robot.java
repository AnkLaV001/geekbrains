public class Robot {
    private String name;
    private int speed;
    private int heightJump;

    public Robot (String name, int speed, int heightJump){
        this.name = name;
        this.speed = speed;
        this.heightJump = heightJump;
    }

    public void run() {
        System.out.println("Робот пробежал");
    }

    public void jump() {
        System.out.println("Робот прыгнул");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setHeightJump(int heightJump){
        this.heightJump = heightJump;
    }

    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public int getHeightJump(){
        return heightJump;
    }
}
