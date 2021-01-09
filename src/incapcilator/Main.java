package incapcilator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Маруся");
        person1.setAge(44);
        person1.speak();

    }
}


class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }

    public String  getName() {
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
}