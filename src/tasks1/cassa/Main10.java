package tasks1.cassa;

public class Main10 {
    public static void main(String[] args) {
        int route = 1; // исходное направление : Север - 1.
        int n = 2; // номер команды : продолжать движение - 0, поворот налево -1 , поворот направо - 2.
        switch (route) {
            case 1:
                if (n == 0) {
                    System.out.println("Север");
                }
                if (n == 1) {
                    System.out.println("Запад");
                }
                if (n == 2) {
                    System.out.println("Восток");
                }
                break;
            default: System.out.println("Ошибка");

        }
    }
}
