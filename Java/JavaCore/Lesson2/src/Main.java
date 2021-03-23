import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) throws MyArrayDataException {


        try {
            System.out.println(createArray(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "5", "3", "4"}, {"1", "2", "3", "4"}}));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в строке: " + e.getI() + ", столбце: " + e.getJ());
        }


    }

    public static int createArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int a = array.length;
        int b = array[0].length;
        int summ = 0;
        if (a != 4 || b != 4) {
            throw new MyArraySizeException("Ваш массив не равен 4*4");
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                try {
                    summ = summ + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i + 1, j + 1);
                }
            }
        }
        return summ;
    }
}
