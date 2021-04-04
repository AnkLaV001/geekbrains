import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArrayOfWord {
//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

    public static void main(String[] args) {
        int i = 0;

        String[] arrayWord = {"Паскудный", "Обтаять", "Плеяда", "Лежак",
                "Расхохотаться", "Сивучиха", "Силач", "Паскудный", "Фраза", "Художество", "Вовремя", "Выкувырнуть",
                "Лежак", "Оболгать", "Огранить", "Опустить", "Осиный", "Отморозить", "Паскудный", "Художество",
                "Разбаловаться"};
        System.out.println("Общее кол-во слов: " + arrayWord.length);

        LinkedHashSet<String> hashSetArrayOfWord = new LinkedHashSet<>(Arrays.asList(arrayWord));
        System.out.println("Уникальные слова: " + hashSetArrayOfWord);


//        Идея в том, чтобы проходиться итератором по всем эллементам HashSet и сравнивать каждый элемент с каждым
//        эллементом в строковом массиве, если есть совпадение то прибавлять к i единицу
        Iterator<String> word = hashSetArrayOfWord.iterator();
        while (word.hasNext()) {
            for (int j = 0; j < arrayWord.length; j++) {
                if (word.next().equals(arrayWord[j])) {
                    i++;

                }
            }
        }
        System.out.println("Всего уникальных слов: " + i);
    }

}
