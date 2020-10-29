package tasks1.misc;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point b) {
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }

    public static double getDistance2(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}