package oop;

public class Program {
    public static void main(String[] args) {
        Person1 kate = new Person1("Kate", 63);
        System.out.println(kate.getAge());

        kate.setAge(35);
        System.out.println(kate.getAge());

        kate.setAge(83);
        System.out.println(kate.getAge());

    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (0 < age && age < 110)
            this.age = age;
    }
}
