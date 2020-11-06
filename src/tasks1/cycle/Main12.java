package tasks1.cycle;

public class Main12 {
    public static void main(String[] args) {
        float n = 5;
        float mult = 1;
        for (float i = 1; i <= 5; i++) {
            mult = mult * (1 + (float) i / 10);
        }
        System.out.println("Произведений = " + mult);
    }
}
