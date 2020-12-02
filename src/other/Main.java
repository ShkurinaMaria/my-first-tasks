package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = generatePersons();

        System.out.println("\nПользователи: \n");
        showPersons(persons);

        System.out.println("\nОбновленные показатели пользователей: \n");
        updateUserProfits(persons);
        calculateRating(persons);
        showPersons(persons);

    }

    public static void calculateRating(ArrayList<Person> persons) {
        persons.sort(new ProfitSorter());
        for (int i = 0; i < persons.size(); i++) {
            persons.get(i).setPosition(i+1);
        }
    }


    public static void showPersons(ArrayList<Person> p) {
        p.forEach(System.out::println);
    }

    public static ArrayList<Person> generatePersons() {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Patric", "Harper", "Mason", "Evelyn", "Ella", "Jackson"));
        return names.stream().map(name -> new Person(name, 0, 0)).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void updateUserProfits(ArrayList<Person> persons) {
        int max = 200;
        int min = 100;
        persons.forEach(person -> {
            int t = (int) (Math.random() * ((max - min) + 1)) + min;
            person.setProfit(person.getProfit() + t);
        });
    }
}