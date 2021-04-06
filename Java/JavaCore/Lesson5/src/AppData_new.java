import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData_new {
    private String[] header;
    private int[][] data;

    public AppData_new(String[] header, int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Arrays.toString(header) + Arrays.deepToString(data);
    }

    public void saveCSV(String[] header){
        try(PrintWriter out = new PrintWriter("lesson5.scv")){
            for(String headerOut : header){
                out.print(headerOut);

            }
            out.println("");
            for (int[] dataOut : data){
                out.print(Arrays.toString(dataOut));
                out.println("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readCSV (int[][] dataArray){
        ArrayList<AppData_new> appData_new = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("lesson5.scv"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null){
                String[] headers = tempString.split(";");
            }
            String tempIntString;
            int[][] intArray = new int[2][3];
            int i=0;
            while ((tempIntString = bufferedReader.readLine()) !=null){
                String[] valuesArray = tempIntString.split(";");
                i++;
                intArray[i][0] = Integer.parseInt(valuesArray[0]);
                intArray[i][1] = Integer.parseInt(valuesArray[1]);
                intArray[i][2] = Integer.parseInt(valuesArray[2]);
            }
            System.out.println(tempString + tempIntString);
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