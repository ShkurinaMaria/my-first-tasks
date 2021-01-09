package incapcilator;

class Main1 {
    public static void main(String[] args) {
        int[][] myList = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}};

        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList[i].length; j++) {
                System.out.print(myList[i][j] + " ");
            }
            System.out.println();
        }
        Opiration op1 = Opiration.Sum;
        System.out.println("Сумма равна " + op1.action(4,7));
        Opiration op2 = Opiration.Sub;
        System.out.println("Разность равна " + op2.action(2,8));
        Opiration op3 = Opiration.Div;
        System.out.println("Частное равно " + op3.action(76,66));
        Opiration op4 = Opiration.Mult;
        System.out.println("Произведение равно " +op4.action(332,55));

    }
}

enum Opiration{
  Sum {
    public int action(int x, int y){return x + y;}
  },
    Sub{
      public int action(int x, int y){return x - y;}
    },
    Mult {
        public int action(int x, int y){return x * y;}
    },
    Div {
      public int action(int x , int y){return x / y;}
    };
    public abstract int action(int x, int y);
}