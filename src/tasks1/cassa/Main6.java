package tasks1.cassa;

public class Main6 {
    public static void main(String[] args) {
        int unit = 5;
        int a = 325;
        switch (unit) {
            case 1: // дециметр
                System.out.println((float) a * 0.1 + " м");
                break;
            case 2: // киллометр
                System.out.println((float) a * 1000 + " м");
                break;
            case 3: // метр
                System.out.println(a + " м");
                break;
            case 4: // миллиметр
                System.out.println((float) a * 0.001 + " м");
                break;
            case 5: // сантиметр
                System.out.println((float) a * 0.01 + " м");
                break;
            default:
                System.out.println("Ошибка");
        }
    }

}
