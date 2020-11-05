package tasks1.cassa;

public class Main1 {
    public static void main(String[] args) {
        int day = 10;
        String dayString;
        switch (day) {
            case 1 :
                dayString = "Понедельник";
                break;
            case 2:
                dayString = "Вторник";
                break;
            case 3:
                dayString = "Среда";
                break;
            case 4:
                dayString = "Четверг";
                break;
            case 5:
                dayString = "Пятница";
                break;
            case 6:
                dayString = "Суббота";
                break;
            case 7:
                dayString = "Воскресенье";
                break;
            default: dayString = "Такого дня недели нет";
        }
        System.out.println(dayString);
    }
}
