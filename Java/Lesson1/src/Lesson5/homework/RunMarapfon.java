package lesson5.homework;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.02.2021
 */

public class RunMarapfon {

    public static void main(String[] args) {
        String tempWinEvent = " это получилось";
        String tempLossEvent = " это не получилось";
        String eventName;
        String eventResult;

        Cat1 cat1 = new Cat1("Мурчаш", 100, 100, 100);
        Dog1 dog = new Dog1("Гавкаш", 0.5f, 250, 10);
        Horse1 horse1 = new Horse1("Игогош", 1.5f, 1500, 10);
        Bird1 bird1 = new Bird1("Леташ", 1.5f, 500, 10);

//        Dog1 dog1 = new Dog1("TestDog");
//        Dog1 dog12 = new Dog1("TestDog2");

        Animal[] arr = {cat1, dog, horse1, bird1};
        float jumpLength = 2.5f;
        float runLength = 250;
        float swimLength = 8;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " может ";

            eventName = "прыгнуть на " + arr[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (arr[i].jump(jumpLength)) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, jumpLength, eventResult);


            eventName = "пробежать на " + arr[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = arr[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = arr[i].swim(swimLength);
            eventName = "проплыть на " + arr[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);
    }

}
