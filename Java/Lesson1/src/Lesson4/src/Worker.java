public class Worker {
    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст
    //2 Конструктор класса должен заполнять эти поля при создании объекта;
    //3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    //4 Вывести при помощи методов из пункта 3 ФИО и должность.
    //5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    //6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    //7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
    private String name = "Victor";
    private String position = "CEO";
    private int phoneNumber = 1234567890;
    private int salary = 250000;
    private int age = 40;

//    public Worker(String name, String position, int phoneNumber, int salary, int age){
//        this.name = name;
//        this.position = position;
//        this.phoneNumber = phoneNumber;
//        this.salary = salary;
//        this.age = age;
//    }

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