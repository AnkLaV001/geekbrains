package Lesson5;

public class Animals {
//    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//    В качестве параметра каждому методу передается величина, означающая или длину препятствия
//    (для бега и плавания), или высоту (для прыжков).
    private int run;
    private double jump;
    private int swim;
    private String name;

    public Animals(String name, int run, double jump, int swim){
        this.run = run;
        this.jump = jump;
        this.swim = swim;
        this.name = name;
    }

    public void run(){
        System.out.println(name + " пробежал(а) " + run + " метра(ов)");
    }
    public void jump(){
        System.out.println(name + " пробежал(а) " + jump + " метра(ов)");
    }
    public void swim(){
        System.out.println(name + " проплыл(а) " + swim + " метра(ов)");
    }

    public void setRun(int value){
        run = value;
    }
    public void setSwim(int value){
        swim = value;
    }
    public void setJump(double value){
        jump = value;
    }

    public int getRun(){
        return run;
    }
    public int getSwim(){
        return swim;
    }
    public double getJump(){
        return jump;
    }



}
