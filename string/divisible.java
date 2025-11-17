import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;
        System.out.println("donner un entier");
        X = sc.nextInt();
        if (X % 3 == 0) {
            System.out.println("la valeur "+X+"est divisible par 3");
        }
        else {
            System.out.println("la valeur "+X+"est ne divisible pas  par 3");
        }

    }
}
