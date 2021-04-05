import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class AppData {
    private String[] header = new String[3];
    private int[][] data;

    public AppData(int[][] data) {
        this.data = data;
    }

    public void saveCSV(String value) {
        for (int i = 0; i < header.length; i++) {
            header[i] = value + " " + i + "; ";
        }
        System.out.println(Arrays.toString(header));
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("lesson5.scv"))) {
            out.writeChars(String.valueOf(header));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

//  Реализовать сохранение данных в csv файл;
//    Структура csv файла:
//      Строка заголовок с набором столбцов
//      Набор строк с целочисленными значениями
//      * Разделитель между столбцами - символ точка с запятой (;)
//  Пример:
//      Value 1;Value 2;Value 3
//      100;200;123
//      300,400,500

