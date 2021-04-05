public class Main {
    public static void main(String[] args) {
       int[][] dataArray = {{423, 432, 435}, {423, 4324, 5435}};
        AppData appData = new AppData(dataArray);

        appData.saveCSV("Value");
    }
}