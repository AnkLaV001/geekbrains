public abstract class Animal {

    private String name;
    private int maxDistance;
    private int heightJump;

    public Animal(){

    };

    public Animal(String name, int maxDistance, int heightJump){
        this.name = name;
        this.maxDistance = maxDistance;
        this.heightJump = heightJump;
    }

    public abstract void run();
    public abstract void jump();

    public void setName(String name) {
        this.name = name;
    }
    public void setMaxDistance(int maxDistance){
        this.maxDistance = maxDistance;
    }
    public void setHeightJump(int heightJump){
        this.heightJump = heightJump;
    }

    public String getName() {
        return name;
    }
    public int getMaxDistance(){
        return maxDistance;
    }
    public int getHeightJump(){
        return heightJump;
    }
}
