package tasks1.cassa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int month = 2;
        int day = 1;
        ArrayList<Integer> days31month = new ArrayList(Arrays.asList(1, 5, 7, 8, 10, 12));

        if (day == 1) {
            if (month == 3) {
                day = 28;
                month = 2;
            } else if(days31month.contains(month)) {
                day = 30;
                month--;
            } else {
                day = 31;
                month--;
            }
        } else {
            day--;
        }
        System.out.print(day + " " + month);
    }

}
