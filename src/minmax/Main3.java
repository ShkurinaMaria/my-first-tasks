package minmax;

public class Main3 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(5, 5),
                new Rectangle(3, 9),
                new Rectangle(8, 6),
        };
        System.out.println(maxsimum(rectangles));
    }

    static int maxsimum(Rectangle[] arr) {
        int max = arr[0].getA() * arr[0].getB();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].getA();
            int b = arr[i].getB();
            int s = a * b;
            if (s > max) {
                max = s;
            }
        }
        return max;
    }
}

class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}