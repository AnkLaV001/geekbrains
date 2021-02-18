package Lesson5;

public class DogBig extends Dog{
    int runDogBig = 600;
    double jumpDogBig = 0.5;
    int swimDogBig = 10;

    public DogBig(String name, int run, double jump, int swim) {
        super(name, run, jump, swim);
        if(run > runDogBig){
            setRun(runDogBig);
            System.out.println(name + "конечно сильная собака, но столько не сможет пробежать, пробежит только " + runDogBig + " метров.");
        }
        if(jump > jumpDogBig){
            setJump(jumpDogBig);
            System.out.println("Слишком высоко, собачка сможет прыгать только на " + jumpDogBig + "метров.");
        }
        if (swim > swimDogBig){
            setSwim(swimDogBig);
            System.out.println("Ваш пёсель может утонуть. У него хватит сил только на " + swimDogBig + " метров.");
        }
    }
}
