package tasks1.cassa;

public class Main2 {
    public static void main(String[] args) {
        int number = 1;
        String numberString;
        switch (number) {
            case 1:
                numberString = "Плохо";
                break;
            case 2:
                numberString = "Неудовлетворительно";
                break;
            case 3:
                numberString = "Удовлетворительно";
                break;
            case 4:
                numberString = "Хорошо";
                break;
            case 5:
                numberString = "Отлично";
                break;
            default: numberString = "Ошибка";
        }
        System.out.println(numberString);
    }
}
