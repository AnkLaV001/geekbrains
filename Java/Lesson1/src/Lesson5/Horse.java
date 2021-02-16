package Lesson5;

public class Horse extends Animals{

//    ограничения на действия (бег: Лошадь 1500 м.; прыжок: Лошадь 3 м.;
//    плавание: лошадь 100 м.)

    public Horse(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > 1500){
            setRun(1500);
            System.out.println("Лошадка конечно марафонец, но не на столько. Она пробежит сколько сможет.");
        }
        if(jump > 3){
            setJump(3);
            System.out.println("Слишком высоко, лошадь не запрыгнет.");
        }
        if (swim > 100){
            setSwim(100);
            System.out.println("Лошадка может не доплыть.");
        }
    }

}
