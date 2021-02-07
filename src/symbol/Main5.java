package symbol;

public class Main5 {
    public static void main(String[] args) {
        int n = 8;
        int symbol = n + 96;
        for (int i = 122; i >= symbol; i--) {
            System.out.print((char) i + " ");
        }
    }
}
