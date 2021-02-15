package Lesson5;

public class Bird extends Animals{

//    ограничения на действия (бег: Птица 5 м.,; прыжок: Птица 0.2 м.;
//    плавание: птица не умеет плавать)
    public Bird(int run, double jump, int swim) {
        super(run, jump, swim);
        if(run > 5){
            setRun(5);
            System.out.println("Слишком большое расстояние для птички, она пробежит сколько сможет.");
        }
        if(jump > 0.2){
            setJump(0.2);
            System.out.println("Слишком высоко, птички так высоко не прыгают.");
        }
        if (swim > 0){
            setSwim(0);
            System.out.println("Птицы не умеют плавать.");
        }
    }
}
