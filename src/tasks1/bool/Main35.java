package tasks1.bool;

public class Main35 {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int x1 = 3;
        int y1 = 2;
        System.out.println("Являются  ли поля одинакового цвета  " + ((x + y) %2 != 0 && (x1 + y1) %2 != 0 || (x + y) %2 == 0 && (x1 + y1) %2 == 0 ));
    }
}
