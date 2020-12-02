package other;

import java.util.Comparator;

public class ProfitSorter implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getProfit() - o1.getProfit();
    }
}
