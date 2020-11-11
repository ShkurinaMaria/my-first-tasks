package tasks1.while1;

public class Main1 {
    public static void main(String[] args) {
        int a = 17;
        int b = 15;
        while (b < a){
            a = a%b;
        }
        System.out.println("Длина незанятой части = " + a);
    }
}
