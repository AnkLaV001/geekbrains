public class Lesson1 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Написать метод вычисляющий выражение a * (b + (c / d)) и
        // возвращающий результат с плавающей точкой,
        // где a, b, c, d – целочисленные входные параметры этого метода;
        int a1 = 2;
        int b1 = 2;
        int c1 = 3;
        float d1 = 4;
        task1(a1, b1, c1, d1);
        System.out.println(task1(a1, b1, c1, d1));


        System.out.println("Задание 2");
        //Написать метод, принимающий на вход два целых числа,
        // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
        // если да – вернуть true, в противном случае – false;
        int a2 = 2;
        int b2 = 9;
        int c2;
        c2 = a2 + b2;
        //task2(a2, b2);
        if (c2 <= 10){
            System.out.println("FALSE");
        } else if (c2 >= 20){
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }


        System.out.println("Задание 3");
        // Написать метод, которому в качестве параметра передается целое число,
        // метод должен проверить положительное ли число передали, или отрицательное.
        // Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
        int a3 = -1;
        if (a3 < 0){
            System.out.println("Данное число ОТРИЦАТЕЛЬНОЕ");
        } else {
            System.out.println("Данное число ПОЛОЖИТЕЛЬНОЕ");
        }


        System.out.println("Задание 4");
        // Написать метод, которому в качестве параметра передается строка,
        // обозначающая имя, метод должен вернуть приветственное сообщение
        // «Привет, переданное_имя!»; Вывести приветствие в консоль.
        String a4 = "Инокентий";
        System.out.println("Привет, " + a4 + "!");


        System.out.println("Задание 5");
        // Написать метод, который определяет является ли год високосным.
        // Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.
        // Для проверки работы вывести результаты работы метода в консоль
        int a5 = 1812;
        float b5 = (a5/100);
        float c5 = (a5/400);
        float d5 = (a5/4);
        //task5(a5);
        String vis = "високосный";
        String no_vis = "невисокосный";

        //пока не понимаю как сделать, мысли как должно быть в комментариях

        if (b5 == 0){ //тут проверяется делится ли число на 100 без дробной части
            if (c5 == 0){ //если в предыдущем поделилось, то проверяем делится ли на 400, если да високосный
                System.out.println("Данный год является " + vis);
            } else{ // если число делилось только на 100 то невисокосный
                System.out.println("Данный год является " + no_vis) ;
            }
        } else if (a5 / 4 == 0){ // если число не делилось на 100, то проверяем деление на 4 без остатка, если да то високосный
            System.out.println("Данный год является " + vis);
        } else { // если ни одно из условий не сработало, то невисокосный
            System.out.println("Данный год является " + no_vis);
        }


    }



    public static float task1(int a1, int b1, int c1, float d1){

        return a1 * (b1 + (c1 / d1));
    }



    //public static int task2(int a2, int b2){
        //int c2;
       // c2 = a2 + b2;
        //return c2;
    //}

}
