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

    public static boolean checkMapSize(int x, int y){
        return x >= 0 && x < sizeMapX && y >= 0 && y < sizeMapY;
    }
    public static boolean checkEmptyPlace(int x, int y){
        return map[y][x] == emptyPlace;
    }

    public static void main(String[] args) {
        createMap();
        printMap();
    }

}
