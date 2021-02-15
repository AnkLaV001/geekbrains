package Lesson5;

public class Animals {
//    2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//    В качестве параметра каждому методу передается величина, означающая или длину препятствия
//    (для бега и плавания), или высоту (для прыжков).
    private int run;
    private double jump;
    private int swim;

    public Animals(int run, double jump, int swim){
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public void run(){
        System.out.println("пробежал" + run);
    }
    public void jump(){
        System.out.println("пробежал" + jump);
    }
    public void swim(){
        System.out.println("проплыла" + swim);
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
