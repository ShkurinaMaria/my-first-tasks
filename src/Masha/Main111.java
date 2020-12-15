package Masha;

public class Main111 {
    public static void main(String[] args) {
        String[] emails = {
                "dtvvmj@mail.ru",
                "acro221996@mail.ru",
                "acro221996@yande.ru",
                "acro221996@gmail.com",
                "a@adf.onin"
        };
        for (String email : emails) {
            System.out.println(getHiddenEmail(email));
        }
    }

    public static String getHiddenEmail(String email) {
        String[] emailAndDomain = email.split("@");
        String[] subStr1 = emailAndDomain[1].split("\\.");
        return (emailAndDomain[0].length() > 2 ? emailAndDomain[0].substring(0, 3) : emailAndDomain[0]) +
                "***@***." +
                subStr1[1];
    }
}

