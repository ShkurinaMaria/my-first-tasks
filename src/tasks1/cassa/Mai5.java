package tasks1.cassa;

public class Mai5 {
    public static void main(String[] args) {
        int act = 3;
        int a = 5;
        int b = 1;
        int c = 0;
        boolean isCalculate = false;
        switch (act) {
            case 1:
                c = a + b;
                isCalculate = true;
                break;
            case 2:
                c = a - b;
                isCalculate = true;
                break;
            case 3:
                c = a * b;
                isCalculate = true;
                break;
            case 4:
                c = a / b;
                isCalculate = true;
                break;
        }
        if (isCalculate) {
            System.out.println(c);
        } else {
            System.out.println("Ошибка");
        }
    }
}
