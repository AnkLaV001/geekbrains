package Lesson5;

public class Bird extends Animals {
    private double distanceOfRun = 5;
    private double heightOfJump = 0.2;
    private double distanceOfSwim = 0;

    Bird(String name){
        super(name);
    }

    @Override
    public int run(double distance) {
        return (distance <= this.distanceOfRun) ? ACTION_OK : ACTION_FAIL;

    }

    @Override
    public int jump(double height) {
        return (height <= this.heightOfJump) ? ACTION_OK : ACTION_FAIL;
    }

    @Override
    public int swim(double distance) {
        return ACTION_NONE;
    }

//    ограничения на действия (бег: Птица 5 м.,; прыжок: Птица 0.2 м.;
//    плавание: птица не умеет плавать)


//    public Bird(String name, int run, double jump, int swim) {
//        super(name, run, jump, swim);
//        if(run > runDBird){
//            setRun(runDBird);
//            System.out.println("Слишком большое расстояние для птички, она может пробежать только " + runDBird + " метров.");
//        }
//        if(jump > jumpBird){
//            setJump(jumpBird);
//            System.out.println("Слишком высоко, птички так высоко не прыгают, она прыгнет только на " + jumpBird + " метра.");
//        }
//        if (swim > swimBird){
//            setSwim(swimBird);
//            System.out.println("Птицы не умеют плавать.");
//        }
//    }
}
