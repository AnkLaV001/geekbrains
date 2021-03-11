import java.util.Scanner;

public class Task2 {
    static Scanner reader = new Scanner(System.in);

    public String doTask25() {
        System.out.println("Task 2.5");
        int a = reader.nextInt();
        String doTask250 = "a*a=" + (a * a) + ", a*lO=" + (a * 10);
        return doTask250;
    }

    public String doTask26() {
        System.out.println("Task 2.6");
        int a = reader.nextInt();
        String doTask260 = " " + (a) + "; " + (a + 1) + "; " + (a - 2);
        System.out.println(doTask260);
        return doTask260;
    }

    public int doTask27() {
        System.out.println("Task 2.7");
        int a = reader.nextInt();
        int doTask270 = a - 10 * a;
        System.out.println(doTask270);
        return doTask270;
    }

    public int doTask28() {
        System.out.println("Task 2.8");
        int x = 6;
        int doTask280 = 1;
        for (int i = 0; i < 3; i++) {
            doTask280 = doTask280 * x;
            System.out.println(doTask280);
        }
        return doTask280;
    }

    public String doTask29() {
        System.out.println("Task 2.9");
        int doTask290 = 9;
        String x1 = "Значение х равно: " + doTask290;
        String x2 = "Квадрат х равно: " + (doTask290 * doTask290);
        System.out.println(x1);
        System.out.println(x2);
        return String.valueOf(doTask290);
    }

    public int doTask214(){
        System.out.println("Введите значение для задания 2.14");
        int doTask214 = reader.nextInt();
        System.out.println(doTask214 + 10);
        return doTask214;
    }

    public int doTask215(){
        System.out.println("Введите значение для задания 2.15");
        int doTask215 = reader.nextInt();
        System.out.println(doTask215 * 10);
        return doTask215;
    }

    public int doTask216(){
        System.out.println("Введите значение для задания 2.16");
        int doTask216 = reader.nextInt();
        System.out.println(doTask216 + 6 + ", " + (doTask216 - 12));
        return doTask216;
    }


}