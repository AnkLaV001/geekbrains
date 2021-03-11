import java.sql.SQLOutput;

public class Task1 {

    private int Null;

    public int doTask16() {
        System.out.println("Task 1.6");
        byte a = 8;
        byte b = 4;
        if (a >= 0 & a <= 9 & b >= 0 & b <= 9) {
            int c = a * 10 + b;
            return c;
        } else {
            return Null;
        }
    }

    public float doTask17(){
        System.out.println("Task 1.7");
        int x = 23;
        float y = (float)x/3;
        return y;
    }

}
