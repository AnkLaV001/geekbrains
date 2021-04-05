public class Main {
    public static void main(String[] args) {
       int[][] dataArray = {{423, 432, 435}, {423, 4324, 5435}};
//        AppData appData = new AppData(dataArray);
//
//        appData.saveCSV("Value");

        AppData_new appData_new = new AppData_new(dataArray);
        appData_new.saveCSV();
    }
}