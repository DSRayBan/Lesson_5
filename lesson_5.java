package ru.geekbrains.Lesson5;

public class LessonFive {
    public static void main(String[] args) {
        User[] user = new User[5];
        user[0] = new User("Ивановов И. И.", "Инженер по навигации" , "1@ya.ru",
                "+9161234567", 10, 25);
        user[1] = new User("Петров П. П.", "Ведущий инженер" , "2@ya.ru",
                "+9162345678", 20, 28);
        user[2] = new User("Иванов И. И.", "Зам. главного механика" , "1@ya.ru",
                "+9163456789", 30, 32);
        user[3] = new User("Ивановов И. И.", "Главный механик" , "1@ya.ru",
                "+9164567890", 40, 35);
        user[4] = new User("Ивановов И. И.", "Зам. ген. директора" , "1@ya.ru",
                "+9165678901", 50, 43);

        for (int i=0; i <user.length; i++)
        if (user[i].Age() > 40) user[i].print();
    }
}




Class User




package ru.geekbrains.Lesson5;

public class User {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public User(String name, String position, String email, String phone_number, int salary, int age) {
       this.name = name;
       this.position = position;
       this.email = email;
       this.phone_number = phone_number;
       this.salary = salary;
       this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + "; Должность:" + position +  "; Email: " + email + "; Номер телефона" + phone_number + "; Заработная плата" + salary + "; Возврат" + age);
    }
    int Age() {
        return age;
    }
}
