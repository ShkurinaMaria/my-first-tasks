package tasks1.begin;

import tasks1.misc.Point;

public class Main16 {
    public static void main(String[] args) {
        int x1 = -4;
        int y1 = 3;
        int x2 = 4;
        int y2 = 2;
        double result1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println("Расстояние между точками A(" + x1 + ", " + y1 + ")" + " и " + "B(" + x2 + ", " + y2 + ") = " + result1);

        Point a = new Point(-4, 3);
        Point b = new Point(4, 2);
        System.out.println(a.getDistance(b));
        System.out.println(a.getDistance(a));
        System.out.println(Point.getDistance2(a, b));
    }
}