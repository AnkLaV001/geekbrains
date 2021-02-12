import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        Random random = new Random();
        Worker worker1 = new Worker();
        System.out.println("Сотрудника зовут - " + worker1.getName());
        System.out.println("Он занимает должность - " + worker1.getPosition());
    }
}
