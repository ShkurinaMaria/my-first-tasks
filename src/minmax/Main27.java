package minmax;

public class Main27 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int maxByZero = 0, maxByOne = 0;
        int countZero = 0, countOne = 0;
        int idxZero = 0, idxOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
                if (countZero > maxByZero) {
                    maxByZero = countZero;
                    idxZero = i;
                }
            } else {
                countZero = 0;
            }
            if (arr[i] == 1) {
                countOne++;
                if (countOne > maxByOne) {
                    maxByOne = countOne;
                    idxOne = i;
                }
            } else {
                countOne = 0;
            }
        }
        System.out.println(maxByOne > maxByZero ? "Количество и номер = " + maxByOne + " и " + (idxOne - maxByOne + 1) : "Количество и номер = " + maxByZero + " и " + (idxZero - maxByZero + 1));
    }
}