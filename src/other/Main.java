package other;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = generatePersons();

        System.out.println("\nПользователи: \n");
        showPersons(persons);

        // System.out.println("\nРейтинг по profit: \n");
        // тут нужен метод который посчитает рейтинг
        // showPersons(persons);

        System.out.println("\nОбновленные показатели пользователей: \n");
        updateUserProfits(persons); // накопления (profit) пользователей обновляются
        showPersons(persons);
    }

    public static void showPersons(ArrayList<Person> p) {
        p.forEach(System.out::println);
    }

    public static ArrayList<Person> generatePersons() {
        return new ArrayList<Person>() {
            {
                add(new Person("Patric", 200, 0));
                add(new Person("Harper", 300, 0));
                add(new Person("Mason", 400, 0));
                add(new Person("Evelyn", 500, 0));
                add(new Person("Ella", 600, 0));
                add(new Person("Jackson", 700, 0));
            }
        };
    }
    public static ArrayList<Person> updateUserProfits(ArrayList<Person> persons) {
        int max = 200;
        int min = 100;
        persons.forEach(person -> {
            int t = (int)(Math.random() * ((max - min) + 1)) + min;
            if (Math.random() < 0.5) {
                person.setProfit(person.getProfit() + t);
            } else {
                person.setProfit(person.getProfit() - t);
            }
        });
        return persons;
    }
}


