package tasks1.bool;

public class Main29 {
    public static void main(String[] args) {
        int x = -1, y = 4;
        int x1 = 0, y1 = 0;
        int x2 = -5, y2 = 5;
        System.out.println("Точка с координатами " + x + " и " + y + " лежит в прямоугольнике " + (x < x1 && x > x2 && y > y1 && y < y2));
    }
}
