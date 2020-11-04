package tasks1.conditions;

public class Main14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 6;
        int min = a;
        int max = c;
         if (b < min) {
             min = b;
         }
         if (c < min){
             min = c;
         }
         if (b > max) {
             max = b;
         }
         if (a > max) {
             max = a;
         }
        System.out.println(min);
        System.out.println(max);
    }
}
