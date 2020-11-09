package tasks1.cycle;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Main13a {
    public static void main(String[] args) {
        int n = 2;
        int a = -1;
        BigDecimal subt = new BigDecimal(0).setScale(2, HALF_UP);

        for (int i = 1; i <= n; i++) {
            a *= -1;
            BigDecimal x = BigDecimal.valueOf(a * (1 + ((float) i / 10))).setScale(2, HALF_UP);
            subt = subt.add(x);
        }

        System.out.println("Сумма и разность = " + subt);
    }
}
