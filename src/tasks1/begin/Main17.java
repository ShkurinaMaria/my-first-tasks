package tasks1.begin;

import tasks1.misc.Point;

public class Main17 {
    public static void main(String[] args) {
        Point a = new Point(3, 9);
        Point b = new Point(2, 9);
        Point c = new Point(6, -6);
        System.out.println(Point.getDistance2(a, b) + Point.getDistance2(b, c));
    }
}