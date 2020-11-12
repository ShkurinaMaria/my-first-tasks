package tasks1.while1;

public class Main11 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        int sum = 0;

        while (sum + count < n){
            count++;
            sum +=count;
        }
        System.out.println("Сумма К = " + sum);
        System.out.println("К = " + count);
    }
}
