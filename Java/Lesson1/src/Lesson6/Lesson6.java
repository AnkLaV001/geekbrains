package Lesson6;


import java.io.*;
public class Lesson6 {
    public static void main(String[] args) {
//        InputStream in;
//        OutputStream out;

//      1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
        System.out.println("________________");
        System.out.println("Задание 1");
        try {
                FileOutputStream file1 = new FileOutputStream("File1.txt");
                PrintStream printStream1 = new PrintStream(file1);
                String outText1 = "The PCA Player of the Year is an annual cricket award, presented to the player adjudged to have been the best of the year in English county cricket. The award has been given since the 1970 season and the winner is chosen by a vote amongst the members of the players' trade union, the Professional Cricketers' Association (PCA). With the exception of the first year, when a joint award was made, the award has been bestowed upon one individual each season. ";
                printStream1.println(outText1);

                FileOutputStream file2 = new FileOutputStream("File2.txt");
                PrintStream printStream2 = new PrintStream(file2);
                String outText2 = "Planthoppers are insects in the suborder Auchenorrhyncha. This photograph shows three adult Phromnia rosea planthoppers on a stem, with three nymphs underneath; the adults fold their wings in a tent-like fashion, while the nymphs are clad in a dense tangle of white wax threads. Both the adults and the nymphs feed by sucking sap from the host plant.";
                printStream2.println(outText2);

//                byte[] str1 = "Недавно мне в руки попало винтажное пресс-папье от IBM 1970-х годов, в которое встроено несколько чипов памяти. Надпись Essones относится к полупроводниковой фабрике IBM в Корбей-Эсон, пригороде Парижа. IBM открыла её в 1964 году, и тогда это была крупнейшая полупроводниковая фабрика Европы.".getBytes();
//                file1.write(str1);
//                byte[] str2 = "Когда в конце 1960-х IBM стала использовать интегральные схемы, чипы запаковывали в квадратные металлические модули, назвав это Monolithic Systems Technology (MST). В пресс-папье представлены несколько этапов производства MST-модуля. Кремниевая подложка разрезается на кристаллы, крепится на квадратной керамической подложке, и оборачивается в металлический корпус размером с ноготь большого пальца.".getBytes();
//                file2.write(str2);

            } catch (FileNotFoundException e) {
                System.out.println("Cann't create file");
            }
//            catch (IOException e) {
//                System.out.println("Cann't write to file");
//            }


//      2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
        System.out.println("________________");
        System.out.println("Задание 2");
        try {
            FileOutputStream file3 = new FileOutputStream("File3.txt");
            int str21;
            FileInputStream file1 = new FileInputStream("File1.txt");
//            BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream("File1.txt"), "UTF-8"));
            while ((str21 = file1.read()) != -1) {
                file3.write(str21);
                System.out.print((char) str21);
            }
            file1.close();
            System.out.println("____");
            FileInputStream file2 = new FileInputStream("File2.txt");
            int str22;
            while ((str22 = file2.read()) != -1) {
                file3.write(str22);
                System.out.print((char) str22);
            }
            file2.close();
            file3.flush();
            file3.close();
            System.out.println("____");
            FileInputStream readFile3 = new FileInputStream("File3.txt");
            int str231;
            while ((str231 = readFile3.read()) != -1) {
                System.out.print((char) str231);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//      3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
        System.out.println("________________");
        System.out.println("Задание 3");
        try {
            FileInputStream readFile3 = new FileInputStream("File3.txt");
            byte[] findName = "the".getBytes();
            int findByte;
            int i = 0;
            while ((findByte = readFile3.read()) != -1){
                if (findByte == findName[i]){
                    i++;
                }else {
                    i = 0;
                    if (findByte == findName[i]){
                        i++;
                    }
                }
                if (i == findName.length){
                    readFile3.close();
                    System.out.println("true");
                }
            }
            readFile3.close();
            System.out.println("false");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//      4.  ** Написать метод, проверяющий, есть ли указанное слово в папке


    }
}
