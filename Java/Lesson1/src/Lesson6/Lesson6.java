package Lesson6;

import java.io.*;

public class Lesson6 {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

//      1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);

            try {
                FileOutputStream file1 = new FileOutputStream("File1.txt");
                FileOutputStream file2 = new FileOutputStream("File2.txt");
                byte[] str = "Недавно мне в руки попало винтажное пресс-папье от IBM 1970-х годов, в которое встроено несколько чипов памяти. Надпись Essones относится к полупроводниковой фабрике IBM в Корбей-Эсон, пригороде Парижа. IBM открыла её в 1964 году, и тогда это была крупнейшая полупроводниковая фабрика Европы.".getBytes();
                file1.write(str);
                byte[] str2 = "Когда в конце 1960-х IBM стала использовать интегральные схемы, чипы запаковывали в квадратные металлические модули, назвав это Monolithic Systems Technology (MST). В пресс-папье представлены несколько этапов производства MST-модуля. Кремниевая подложка разрезается на кристаллы, крепится на квадратной керамической подложке, и оборачивается в металлический корпус размером с ноготь большого пальца.".getBytes();
                file2.write(str2);

            } catch (FileNotFoundException e) {
                System.out.println("Cann't create file");
            } catch (IOException e) {
                System.out.println("Cann't write to file");
            }


//      2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

        try {
            FileInputStream file1 = new FileInputStream("File.txt");
            int str1;
            while (str1 = file1.read())
        } catch (FileNotFoundException e) {
            System.out.println("Cann't find file");
        }

//      3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
//      4.  ** Написать метод, проверяющий, есть ли указанное слово в папке


    }
}
