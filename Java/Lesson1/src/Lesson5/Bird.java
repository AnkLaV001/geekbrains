package Lesson5;

public class Bird extends Animals{
    private int runDBird = 5;
    private double jumpBird = 0.2;
    private int swimBird = 0;

//    ограничения на действия (бег: Птица 5 м.,; прыжок: Птица 0.2 м.;
//    плавание: птица не умеет плавать)
    public Bird(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > runDBird){
            setRun(runDBird);
            System.out.println("Слишком большое расстояние для птички, она может пробежать только " + runDBird + " метров.");
        }
        if(jump > jumpBird){
            setJump(jumpBird);
            System.out.println("Слишком высоко, птички так высоко не прыгают, она прыгнет только на " + jumpBird + " метра.");
        }
        if (swim > swimBird){
            setSwim(swimBird);
            System.out.println("Птицы не умеют плавать.");
        }
    }
}
