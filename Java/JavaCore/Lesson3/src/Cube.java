import java.util.ArrayList;

//Написать метод, который меняет два элемента массива местами
// (массив может быть любого ссылочного типа);
//В 1 пункте задания используйте параметризованный тип.
//В задании можно вместо массива пользоваться ArrayList,
// у которого есть удобные методы list.add(obj), list1.addAll(list2), list.clear();

public class Cube<T extends String> {

    public static void main(String[] args){
        ArrayList<String> cube = new ArrayList<>();
        cube.add("1");
        cube.add("2");
        cube.add("3");
        cube.add("4");
        cube.add("5");
        cube.add("6");

        System.out.println(cube);

        for (int i = 1; i < cube.size(); i = i + 2) {
            cube.add(i - 1, cube.get(i));
            cube.remove(i + 1);
            System.out.println(cube);
        }

    }

}
