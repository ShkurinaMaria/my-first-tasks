package tasks1.series;

public class Main13 {
    public static void main(String[] args) {
        Operation operation1 = new Operation(new int[]{1, 10, 15});
        System.out.println(operation1.sum());
        System.out.println(operation1.mult());
        System.out.println(operation1.avg());
    }
}

class Operation {
    private final int[] arr;

    public Operation(int[] arr) {
        this.arr = arr;
    }

    int sum() {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    double mult() {
        double mult = 1;
        for (int j : arr) {
            mult *= j;
        }
        return mult;
    }

    float avg() {
        return (float)this.sum() / this.arr.length;
    }
}