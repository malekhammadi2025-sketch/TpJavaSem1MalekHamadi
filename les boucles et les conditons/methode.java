import java.util.Scanner;

public class methode {
public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier positif : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur Le nombre doit etre strictement positif.");
            }
        } while (n <= 0);
        return n;
    }


    public static int compter(int n) {
        int compteur = 0;
        while (n != 0) {
            compteur++;
            n = n / 10; 
        }
        return compteur;
    }
}
       