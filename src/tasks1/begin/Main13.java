package tasks1.begin;

public class Main13 {
    public static void main(String[] args) {
        float r1 = 7f;
        float r2 = 3f;
        float p = 3.14f;
        float S1 = p * r1 * r1;
        float S2 = p * r2 * r2;
        System.out.println("Площадь первого круга S1 = " + S1);
        System.out.println("Площадь второго круга S2 = " + S2);
        System.out.println("Площадь площадь кольца при R1 > R2 = " + (S1 - S2));
    }
}
