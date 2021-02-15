package Lesson4.src;

public class Worker {
    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст
    //2 Конструктор класса должен заполнять эти поля при создании объекта;
    //3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    //4 Вывести при помощи методов из пункта 3 ФИО и должность.
    //5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    //6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    //7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
    private String name; //ФИО
    private String position; //Должность
    private int phoneNumber; // Телефон
    private int salary; //Зарплата
    private int age; //Возраст
    static Worker[] arrayWorkers = new Worker[5];

    public Worker(String name, String position, int phoneNumber, int salary, int age){
//    public Worker(){
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
  }

    public static void arrayWorkers() {
        arrayWorkers[0] = new Worker("Seva1", "CEO", 587895, 84654, 45);
        arrayWorkers[1] = new Worker("Seva2", "Nothing", 454654, 846541321, 25);
        arrayWorkers[2] = new Worker("Seva3", "CEO", 778456, 897984, 54);
        arrayWorkers[3] = new Worker("Seva4", "CEO", 231324, 1321, 78);
        arrayWorkers[4] = new Worker("Seva5", "CEO", 787448, 8498954, 15);
        for (int i = 0; i < arrayWorkers.length; i++) {
            if(arrayWorkers[i].age > 40) {
                System.out.println("Сотрудника зовут - " + arrayWorkers[i].name + " и ему " + arrayWorkers[i].age + " лет");
            }
            System.out.println("_________________________");
            if(arrayWorkers[i].age > 35) {
                System.out.println("Сотрудника зовут - " + arrayWorkers[i].name + " и ему " + arrayWorkers[i].age + " лет, и его зарплата:" + arrayWorkers[i].salary);
                arrayWorkers[i].salary = arrayWorkers[i].salary + 10000;
                System.out.println("Теперь его зарплата составляет: " + arrayWorkers[i].salary);
            }
            System.out.println("_________________________");

        }
    }
//   public static void arrayWorker(){
////    public static Worker[] arrayWorkers;
//        arrayWorkers[0] = new Worker("Seva1", "CEO", 587895, 84654, 45);
//        arrayWorkers[1] = new Worker("Seva2", "Nothing", 454654, 846541321, 25);
//        arrayWorkers[2] = new Worker("Seva3", "CEO", 778456, 897984, 54);
//        arrayWorkers[3] = new Worker("Seva4", "CEO", 231324, 1321, 78);
//        arrayWorkers[4] = new Worker("Seva5", "CEO", 787448, 8498954, 15);
//        System.out.println(arrayWorkers[i]);
//    }


    public void setName(String value){name = value;}
    public void setPosition(String value){position = value;}
    public void setPhoneNumber(int value){phoneNumber = value;}
    public void setSalary(int value){salary = value;}
    public void setAge(int value){age = value;}

    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }


}