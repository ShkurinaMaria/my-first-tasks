package tasks1.while1;

public class Main15 {
    public static void main(String[] args) {
        double cont = 1000;
        double perc = 0.01;
        int k = 0;
        double sum = 0;

        while (cont < 1100) {
            k++;
            sum = cont;
            cont = cont * perc;
            cont = cont + sum;
        }
        System.out.println(Math.ceil(cont));
        System.out.println(k);
    }
}
