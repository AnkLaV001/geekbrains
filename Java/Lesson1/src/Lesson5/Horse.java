package Lesson5;

public class Horse extends Animals{
    private int runDHorse = 1500;
    private double jumpHorse = 3;
    private int swimHorse = 100;

//    ограничения на действия (бег: Лошадь 1500 м.; прыжок: Лошадь 3 м.;
//    плавание: лошадь 100 м.)

    public Horse(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > runDHorse){
            setRun(runDHorse);
            System.out.println("Лошадка конечно марафонец, но не на столько. Она может пробежать " + runDHorse + " метров.");
        }
        if(jump > jumpHorse){
            setJump(jumpHorse);
            System.out.println("Слишком высоко, лошадь может перепрыгнуть через препятствие до " + jumpHorse + " метров.");
        }
        if (swim > swimHorse){
            setSwim(swimHorse);
            System.out.println("Лошадка может не доплыть, она проплывёт только " + swimHorse + " метров.");
        }
    }

}
