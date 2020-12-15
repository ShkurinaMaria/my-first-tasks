package Masha;

import java.util.Arrays;

public class Main111 {
    public static void main(String[] args) {
        String str = "dtvvmj@mail.ru";
        String[] subStr = str.split("@");
        String[] subStr1 = subStr[1].split("\\.");
        for (int i = 0; i < subStr.length; i++) {
            if (i == 0) {
                System.out.print(subStr[0].charAt(0) + "" + subStr[0].charAt(1) + "" + subStr[0].charAt(2) + "***@");
            } else {
                System.out.print("***." + subStr1[1]);
            }
        }
    }
}

