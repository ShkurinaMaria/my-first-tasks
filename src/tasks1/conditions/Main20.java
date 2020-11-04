package tasks1.conditions;

public class Main20 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 8;
        if (a < b && b < c){
            System.out.println("Точка " + b);
            System.out.println("Расстояние между точками = " + (b - a));
        }
        if (a < c && c < b){
            System.out.println("Точка " + c);
            System.out.println("Расстояние между точками = " + (c - a));
        }
    }
}
