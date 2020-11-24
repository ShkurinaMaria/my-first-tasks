package minmax;

public class Main15 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 1, 9, 0, 6};
        int b = 8;
        int c = 11;
        int max = arr[0];
        int idx = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > b && arr[i] < c && max <= arr[i]) {
                max = arr[i];
                idx = i;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Мфксимальное число, которое больше " + b + " и " + "меньше " + c + " = " + max);
            System.out.println("Индекс максимального числа = " + idx);
        } else {
            System.out.println("0 0");
        }
    }
}

/*

        List<Integer> numbers = Arrays.asList(1, 3, 10, 7, 9);
        int result = numbers.stream()
                .filter(integer -> integer < c && integer > b)
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println(result);
*/