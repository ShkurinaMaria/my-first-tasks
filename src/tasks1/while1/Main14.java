package tasks1.while1;

public class Main14 {
    public static void main(String[] args) {
        int a = 4;
        float count = 0;
        float sum = 0;

        while (sum  <= a){
            count++;
            sum = sum + (1 / count);
        }
        System.out.println("Сумма = " + (sum - (1 / count)));
        System.out.println("Число К = " + (count - 1));
    }
}
