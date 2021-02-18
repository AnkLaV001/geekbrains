package Lesson5;

public class Cat extends Animals{

//    ограничения на действия (бег: кот 200 м.; прыжок: кот 2 м.;
//    плавание: кот не умеет плавать)
    public Cat(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > 200){
            setRun(200);
            System.out.println("Котейка не сможет столько пробежать, он пробежит сколько сможет.");
        }
        if(jump > 2){
            setJump(2);
            System.out.println("Слишком высоко, котека не запрыгнет.");
        }
        if (swim > 0){
            setSwim(0);
            System.out.println("Кошки не умеют плавать.");
        }

    }

//    public String swim(double swim){
//        if (swim > 0){
//            return String.valueOf(System.out.printf("Кошки не умеют плавать"));
//        }
//        return null;
//    }

}
