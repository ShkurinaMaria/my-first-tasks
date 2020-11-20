package tasks1.proc;

public class Main7 {
    public static void main(String[] args) {
        invDigits(5678599);
    }

    static void invDigits(int k) {
        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(k)).reverse().toString()));
    }
}
