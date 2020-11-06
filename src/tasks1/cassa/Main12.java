package tasks1.cassa;

public class Main12 {
    public static void main(String[] args) {
        int element = 1; // Элемент: 1 - радиус, 2 - диаментр, 3 - длина, 4 - площадь.
        float value = 4; // Значение элемента
        float p = 3.14f;
        switch (element) {
            case 1:
                System.out.println("Радиус = " + value);
                System.out.println("Диаметр = " + (2 * value));
                System.out.println("Длина = " + (2 * p * value));
                System.out.println("Площадь = " + (p * value * value));
                break;
            case 2:
                System.out.println("Радиус = " + (value / 2));
                System.out.println("Диаметр = " + (value));
                System.out.println("Длина = " + (2 * value));
                System.out.println("Площадь = " + (p * ((value / 2) * (value / 2))));
                break;
            case 3:
                System.out.println("Радиус = " + (value / (2 * p)));
                System.out.println("Диаметр = " + (value / (4 * p)));
                System.out.println("Длина = " + (value));
                System.out.println("Площадь = " + (p * ((value / (2 * p)) * (value / (2 * p)))));
                break;
            case 4:
                System.out.println("Радиус = " + Math.sqrt(value / p));
                System.out.println("Диаметр = " + (2 * Math.sqrt(value / p)));
                System.out.println("Длина = " + (2 * p * Math.sqrt(value / p)));
                System.out.println("Площадь = " + (value));
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
