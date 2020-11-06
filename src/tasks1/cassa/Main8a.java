package tasks1.cassa;

public class Main8a {
    public static void main(String[] args) {
        int day = 1;
        int month = 3;
        if (day > 1 && day < 31 && month > 1 && month < 12) {
            System.out.println("Месяц: " + month);
            System.out.println("День: " + (day - 1));
        } else {
            switch (month) {
                case 3:
                    if (day == 1) {
                        month--;
                        day = 28;
                        System.out.println("Месяц: " + month);
                        System.out.println("День: " + day);
                    }
                    break;
                case 1:
                    if (day == 1) {
                        month = 12;
                        day = 31;
                        System.out.println("Месяц: " + month);
                        System.out.println("День: " + day);
                    }
                    break;
                case 5:
                case 7:
                case 10:
                case 12:
                    if (day == 1) {
                        month--;
                        day = 30;
                        System.out.println("Месяц: " + month);
                        System.out.println("День: " + day);
                    }
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    if (day == 1) {
                        month--;
                        day = 31;
                        System.out.println("Месяц: " + month);
                        System.out.println("День: " + day);
                    }
                    break;
                default:
                    System.out.println("Ошибка");
            }
        }

    }
}
