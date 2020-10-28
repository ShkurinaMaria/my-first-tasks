package tasks1.begin;

public class Main15 {
    public static void main(String[] args) {
        float S = 5f;
        float p = 3.14f;
        float D = (float) Math.sqrt((S * 4) / p);
        float L = D * p;
        System.out.println("Диаметр круга D = " + D);
        System.out.println("Длина окружности круга L = " + L);
    }
}