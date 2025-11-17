import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("donnez un entier non nul :");
        int n = sc.nextInt();
        if (n == 0){
            System.out.println("Erreur: le nombre ne doit pas etre nul !");

        } else {
            if (n % 2 == 0){
                System.out.println("le nombre "+ n + "est pair .");
            } else{
                System.out.println("le nombre "+ n + "est impair .");
            }
        }
        sc.close();
    }
}
