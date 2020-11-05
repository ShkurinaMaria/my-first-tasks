package tasks1.cassa;

public class Main4 {
    public static void main(String[] args) {
        int month = 6;
        String monthString;
        switch (month) {
            case 2:
                monthString = "28 дней";
                break;
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthString = "31 день";
                break;
            case 3:
            case 4:
            case 6:
            case 9:
            case 11:
                monthString = "30 дней";
                break;
            default:
                monthString = "Ошибка";
        }
        System.out.println(monthString);
    }

}
