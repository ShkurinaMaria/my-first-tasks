package oop;

public class Dancer {
    private String name;
    private int age;

    public Dancer (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println(toString() + "Я танцею как все");
    }
    @Override
    public String toString (){
        return "Я " + name + ",мне " + age + " лет. ";
    }
}

class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }
// переопределение метода базового класса

    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую электрик буги!");
    }
}

class BreakDankDancer extends Dancer{

    public BreakDankDancer(String name, int age) {
        super(name, age);
    }
// переопределение метода базового класса

    @Override
    public void dance(){
        System.out.println(toString() + "Я танцую брейк-данс!");
    }
}