package minmax;

public class Main2 {
    public static void main(String[] args) {
        Rectangle1[] rectangles1 = new Rectangle1[]{
                new Rectangle1(5, 5),
                new Rectangle1(4, 9),
                new Rectangle1(8, 6),
        };
       System.out.println(minimum(rectangles1));
    }

    static int minimum(Rectangle1[] arr) {
        int min = arr[0].getA() * arr[0].getB();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].getA();
            int b = arr[i].getB();
            int s = a * b;
            if (s < min) {
                min = s;
            }
        }
        return min;
    }
}

class Rectangle1 {
    private int a;
    private int b;

    public Rectangle1(int a, int b) {
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