public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("Задание 1");
//        Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
//        заменяющий в принятом массиве 0 на 1, 1 на 0
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(array1);
        System.out.println();

        System.out.println("Задание 2");
//        Задать пустой целочисленный массив размером 8.
//        Написать метод, который c помощью цикла заполнит его
//        значениями 1 4 7 10 13 16 19 22
        int[] array2 = new int[8];
        task2(array2);
        System.out.println();

        System.out.println("Задание 3");
//         Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//         написать метод,принимающий на вход массив и
//         умножающий числа меньше 6 на 2
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(array3);
        System.out.println();

        System.out.println("Задание 4");
//         Задать одномерный массив. Написать методы поиска в
//         нём минимального и максимального элемента
        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task4(array4);
        System.out.println();

        System.out.println("Задание 5");
//         Создать квадратный целочисленный массив
//         (количество строк и столбцов одинаковое),
//         заполнить его диагональные элементы единицами, используя цикл(ы)
        int[][] array5 = new int[5][5];
        task5(array5);
        System.out.println();

        System.out.println("Задание 6");
//         Написать метод, которому на вход подаётся одномерный
//         массив и число n (может быть положительным, или отрицательным),
//         при этом метод должен циклически сместить все элементы массива на n позиций.
//         [1,2,3,4,5], -2 => [3,4,5,1,2]
//         [1,2,3,4,5], 2 => [4,5,1,2,3]
        int[][] array5 = new int[5][5];
        task5(array5);
        System.out.println();

        System.out.println("Задание 7");
//         Не пользоваться вспомогательным массивом при решении задачи 6
        int[][] array5 = new int[5][5];
        task5(array5);
        System.out.println();

    }


    public static void task1(int[] array1){
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " > ");
            array1[i] = (array1[i]==1) ? 0 : 1;
//            if (array1[i] == 1){
//                array1[i] = 0;
//            }else {
//                array1[i] = 1;
//            }
            System.out.println(array1[i]);
        }
    }
    public static void task2(int[] array2){
        array2[0]=1;
        System.out.println(array2[0]);
        for (int i = 1; i < array2.length; i++) {
            array2[i] = array2[i-1] + 3;
            System.out.println(array2[i]);
        }
    }
    public static void task3(int[] array3){
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (array3[i]<6) ? array3[i]*2 : array3[i];
//            if (array3[i]<6){
//                array3[i]=array3[i]*2;
//            }
            System.out.println(array3[i]);
        }
    }
    public static void task4(int[] array4){
        int a4 = array4[0];
        int b4 = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (a4 < array4[i]) {
                a4 = array4[i];
            } else if (b4 > array4[i]){
                b4 = array4[i];
            }

        }
        System.out.println("Число: " + a4 + " самое наибольшее");
        System.out.println("Число: " + b4 + " самое наименьшее");
    }

    public static void task5(int[][] array5) {
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                array5[i][j] = i+j;
                System.out.println(array5[i][j]);
            }


            }
        }
    }


