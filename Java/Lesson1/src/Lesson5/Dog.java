package Lesson5;

public class Dog extends Animals{

//    ограничения на действия (бег: собака 500 м.; прыжок: собака 0.5 м.;
//    плавание: собака 10 м.)

    public Dog(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > 500){
            setRun(500);
            System.out.println("Собакен не сможет столько пробежать, он пробежит сколько сможет.");
        }
        if(jump > 0.5){
            setJump(0.5);
            System.out.println("Слишком высоко, собачка не запрыгнет.");
        }
        if (swim > 10){
            setSwim(10);
            System.out.println("Ваш пёсель может утонуть.");
        }
    }

}
