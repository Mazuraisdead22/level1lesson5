package Lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println(" Имя: " + name + " Профессия: " + position + " email: " + email + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age);
    }
}

