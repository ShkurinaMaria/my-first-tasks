package tasks1.integer;

public class Main29 {
    public static void main(String[] args) {
        int a = 51;
        int b = 10;
        int c = 3;
        float svobodno = (float) (a * b) - (((a * b) / (c * c)) * (c * c));
        System.out.println("Свобоная площадь прямоугольника = " + svobodno);
    }
}
