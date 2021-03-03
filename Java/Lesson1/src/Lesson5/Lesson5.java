package Lesson5;

public class Lesson5 {

//    1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
//    3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.,
//    Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м.;
//    плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
//    4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
//    (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//    5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег
//    может быть 400 м., у другой 600 м.

    public static void main(String[] args) {
//        DogSmall dogSmall = new DogSmall("Пёсик",400, 0.3, 3);
//        DogBig dogBig = new DogBig("Палкан",600, 0.3, 3);
//        Horse horse = new Horse("Лошадка",800, 2.5, 101);
        Dog dog = new Dog("Пёсик");
        Bird bird = new Bird("Птичка");
//        for (int i = 0; i < 10; i++)
//            bird.run(i);
//        System.out.println("____________________");
//        bird.jump(4);
//        System.out.println("____________________");
//        dog.swim(4);


        double animalDistanceOfRun = 150;
        double animalDistanceOfJump = 10;
        double animalDistanceOfSwim = 4;

        Animals[] animals = {dog, bird};

        for (int i = 0; i < animals.length; i++) {
            int returnRunResult = animals[i].run(animalDistanceOfRun);
            int returnJumpResult = animals[i].jump(animalDistanceOfJump);
            int returnSwimResult = animals[i].swim(animalDistanceOfSwim);
            if (returnRunResult == Animals.ACTION_OK) {
                System.out.println(animals[i].getName() + " пробежал " + animalDistanceOfRun);
            } else {
                System.out.println(animals[i].getName() + " не смог пробежать");
            }

            if (returnJumpResult == Animals.ACTION_OK) {
                System.out.println(animals[i].getName() + " прыгнул на " + animalDistanceOfRun);
            } else {
                System.out.println(animals[i].getName() + " не смог прыгнуть");
            }

            if (returnSwimResult == Animals.ACTION_OK) {
                System.out.println("Животное " + animals[i].getName() + " проплыло " + animalDistanceOfSwim);
            } else if (returnSwimResult == Animals.ACTION_FAIL) {
                System.out.println("Животное " + animals[i].getName() + " не смогло проплыть");
            } else if (returnSwimResult == Animals.ACTION_NONE) {
                System.out.println("Животное " + animals[i].getName() + " не умеет плавать");
            }
            if (returnSwimResult != Animals.ACTION_FAIL){
                System.out.println("Животное " + animals[i].getName() + " проплыло " + animalDistanceOfSwim);
            }

        }


//        double swimResults = dog.swim(animalDistanceOfSwim);

        //        Cat cat = new Cat("Котик", 200, 2, 5);
//
////        System.out.println("Пёсик " + dog.run());
//        dogSmall.run();
//        dogBig.run();
//
//        cat.swim();
//        horse.jump();
//
//        bird.run();
//        bird.jump();
//        bird.swim();


    }


}
