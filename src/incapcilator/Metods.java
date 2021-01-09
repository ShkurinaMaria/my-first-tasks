package incapcilator;

public class Metods {
    public static void main(String[] args) {
        String s = "Меня зовут Мария. ";
        s = s.concat(" Я занимаюсь изучением Java");
        System.out.println(s);

        float a = 56f;
        System.out.println("Возвращаем значение " + String.valueOf(a));
        String data = String.join("/", "22", "06", "2020");
        System.out.println(data);

        String str1 = "Hello";
        String str2 = "hello5";
        String str3 = "Hello37777";
        int var1 = str1.compareTo(str2);
        System.out.println("str1 && srt2 comparison:" + var1);
        int var2 = str2.compareTo(str3);
        System.out.println("str1 && str3 comparison: " + var2);
        int var3 = str2.compareTo(str2);
        System.out.println("str2 && str3 comparison: " + var3);

        char result = str2.charAt(2);
        System.out.println(result);

        String Str1 = new String("Добро пожаловать на ProgLang.su");
        char[] Str2 = new char[4];

        try {
            Str1.getChars(5, 9, Str2, 0);
            System.out.print("Скопированное значение: ");
            System.out.println(Str2);

        } catch (Exception ex) {
            System.out.println("Возникает исключение...");
        }
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(Str1.toUpperCase());
        String[] seasons  = new String []{"Winter", "Spring", "Summer", "Autumn"};
        Season.printSeasons(seasons);
    }
}

class Season {
    static void printSeasons (String [] seasons){
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
    }
}

