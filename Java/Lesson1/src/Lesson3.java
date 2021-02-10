import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static char[][] map;
    public static int sizeMapX;
    public static int sizeMapY;

    public static char player1 = 'X';
    public static char player2 = 'O';
    public static char emptyPlace = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap(){
        sizeMapY = 3;
        sizeMapX = 3;
        map = new char[sizeMapY][sizeMapX];
        for (int y = 0; y < sizeMapY; y++){
            for (int x = 0; x < sizeMapX; x++) {
                map[y][x] = emptyPlace;
            }
        }
    }

    public static void printMap(){
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("_________________");
    }

    public static void player1Turn(){
        int x;
        int y;
        do{
            System.out.println("Введите позицию куда поставить фишку:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }   while (!checkMapSize(y, x) || !checkEmptyPlace(y,x));
        map[y][x] = player1;
    }

    public static void player2Turn(){
        int x;
        int y;
        do{
//            System.out.println("Введите позицию куда поставить фишку:");
//            x = scanner.nextInt() - 1;
//            y = scanner.nextInt() - 1;
            if(){

            }
            x = random.nextInt(sizeMapX);
            y = random.nextInt(sizeMapY);
        }   while (!checkEmptyPlace(y,x));
        map[y][x] = player2;
    }

    public static boolean checkMapSize(int x, int y){
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }
    public static boolean checkEmptyPlace(int x, int y){
        return map[y][x] == emptyPlace;
    }
    public static boolean checkOpponentWin(char anotherPlayer){
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if(map[y][x] = anotherPlayer && checkWin(anotherPlayer))
            }

        }
    }
    public static boolean checkWin(char currentPlayer){
        if (map[0][0] == currentPlayer && map[0][1] == currentPlayer && map[0][2] == currentPlayer) return true;
        if (map[1][0] == currentPlayer && map[1][1] == currentPlayer && map[1][2] == currentPlayer) return true;
        if (map[2][0] == currentPlayer && map[2][1] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][0] == currentPlayer && map[2][0] == currentPlayer) return true;
        if (map[0][1] == currentPlayer && map[1][1] == currentPlayer && map[2][1] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][2] == currentPlayer && map[2][2] == currentPlayer) return true;

        if (map[0][0] == currentPlayer && map[1][1] == currentPlayer && map[2][2] == currentPlayer) return true;
        if (map[0][2] == currentPlayer && map[1][1] == currentPlayer && map[2][0] == currentPlayer) return true;

        return false;
    }
    public static boolean checkFullMap(){
        for (int y = 0; y < sizeMapY; y++) {
            for (int x = 0; x < sizeMapX; x++) {
                if (map[y][x] == emptyPlace){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createMap();
        printMap();

        while (true) {
            player1Turn();
            printMap();
            if (checkWin(player1)) {
                System.out.println("Human WIN!");
                break;
            }
            if (checkFullMap()) {
                System.out.println("DRAW!");
                break;
            }

            player2Turn();
            printMap();
            if (checkWin(player2)) {
                System.out.println("AI WIN!");
                break;
            }
            if (checkFullMap()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
