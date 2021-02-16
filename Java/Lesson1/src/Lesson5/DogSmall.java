package Lesson5;

public class DogSmall extends Dog{
    int runDogSmall = 400;
    double jumpDogSmall = 0.5;
    int swimDogSmall = 10;

//    ограничения на действия (бег: собака 500 м.; прыжок: собака 0.5 м.;
//    плавание: собака 10 м.)
//    5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег
//    может быть 400 м., у другой 600 м.

    public DogSmall(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > runDogSmall){
            setRun(runDogSmall);
            System.out.println(name + "конечно сильная собака, но столько не сможет пробежать, пробежит только " + runDogSmall + " метров.");
        }
        if(jump > jumpDogSmall){
            setJump(jumpDogSmall);
            System.out.println("Слишком высоко, эта собачка прыгает только на высоту до " + jumpDogSmall + " метров.");
        }
        if (swim > swimDogSmall){
            setSwim(swimDogSmall);
            System.out.println("Ваш пёсель может утонуть. Не заставляйте его плыть больше " + swimDogSmall + " метров.");
        }
    }

}
