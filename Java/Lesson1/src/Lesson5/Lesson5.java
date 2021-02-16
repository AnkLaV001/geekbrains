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

    public static void main(String[] args){
        Dog dog = new Dog("Пёсик",200, 0.3, 3);
        Horse horse = new Horse("Лошадка",800, 2.5, 101);
        Bird bird = new Bird("Птичка", 6, 0.2, 0);
        Cat cat = new Cat("Котик", 200, 2, 5);

//        System.out.println("Пёсик " + dog.run());
        dog.swim();
        cat.swim();

        bird.run(700);
        bird.jump();
        bird.swim();


    }



}