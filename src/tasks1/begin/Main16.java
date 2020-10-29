package tasks1.begin;

import java.lang.reflect.Constructor;

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

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point b) {
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }

    static double getDistance2(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}