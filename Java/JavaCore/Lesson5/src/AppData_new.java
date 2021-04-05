import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class AppData_new {
    private String[] header = {"Value 1;", "Value 2;", "Value 3"};
    private int[][] data;

    public AppData_new(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Arrays.toString(header) + Arrays.deepToString(data);
    }

    public void saveCSV(){
        try(PrintWriter out = new PrintWriter("lesson5.scv")){
            for(String headerOut : header){
                out.print(headerOut);

            }
            out.println("");
            for (int[] dataOut : data){
                out.print(dataOut);
                out.println("");
            }
        } catch (FileNotFoundException e) {
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