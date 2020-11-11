package oop;

import java.util.SortedMap;

public class Person {
    private String fio;
    private int age;
    private int weight;
    private int discharge;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String fio) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String fio) {
        this.weight = weight;
    }

    public int getDischarge() {
        return discharge;
    }

    public void setDischarge(String fio) {
        this.discharge = discharge;
    }

    @Override
    public String toString() {
        return "Person {" +
                "fio = '" + fio + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                ", discharge = " + discharge +
                '}';
    }

    Person(String fio, int age, int weight, int discharge) {
        this.fio = fio;
        this.age = age;
        this.weight = weight;
        this.discharge = discharge;

        if (age > 30 && age < 200) {
            this.age = age;
        }

        if (weight > 30 && weight < 200) {
            this.weight = weight;
        }
        if (discharge > 1 && discharge < 5) {
            this.discharge = discharge;
        }

    }
}