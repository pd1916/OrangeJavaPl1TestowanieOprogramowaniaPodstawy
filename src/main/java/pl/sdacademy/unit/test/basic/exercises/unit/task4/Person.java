package pl.sdacademy.unit.test.basic.exercises.unit.task4;

public class Person {
    private String name;
    private String surname;
    private int age;

    private Address address;

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        if(age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public boolean isChild() {
        return age >= 0 && age <= 18;
    }
}