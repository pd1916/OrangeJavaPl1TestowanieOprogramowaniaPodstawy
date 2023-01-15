package pl.sdacademy.unit.test.basic.exercises.unit.task4;

public class Person {
    private String name;
    private String surname;
    private int age;

    private Address address;

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean isChild() {
        return age >= 0 && age <= 18;
    }
}