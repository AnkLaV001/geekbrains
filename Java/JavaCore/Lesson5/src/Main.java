import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] headerArray = {"Value 1;", "Value 2;", "Value 3"};
       int[][] dataArray = {{423, 432, 435}, {423, 4324, 5435}};
       int[][] dataArray2 = {{4754, 77, 111}, {22, 543, 2234}};

//        AppData appData = new AppData(dataArray);
//
//        appData.saveCSV("Value");

        AppData_new appData_new = new AppData_new(headerArray, dataArray);
        appData_new.saveCSV(headerArray);
        appData_new.readCSV(dataArray2);
    }
}