import java.util.Scanner;

public class ch1 {

    public static boolean espace(String ch) {
        int a = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == ' ') {
                a++;
            }
        }
        return a == 1;
    }

    public static boolean CarSp(String C) {
        int k = 0;
        String csp = "@#?!$";
        for (int i = 0; i < C.length(); i++) {
            if (csp.indexOf(C.charAt(i)) != -1) {
                k++;
            }
        }
        return k == 1;
    }

    public static boolean test(String ch) {
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < ch.length(); i++) {
            if (Character.isLowerCase(ch.charAt(i))) {
                hasLower = true;
            }
            if (Character.isDigit(ch.charAt(i))) {
                hasDigit = true;
            }
        }
        return hasLower && hasDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d;

        do {
            System.out.println("donner une chaine de caractere");
            d = sc.nextLine();
        } while (!espace(d) || !CarSp(d) || !test(d) || d.length() > 50);

        System.out.println("(valide) !");
    }
}
