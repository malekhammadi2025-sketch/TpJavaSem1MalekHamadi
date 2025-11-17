import java.util.Scanner;

public class LireEntiers {

    // Méthode pour lire un entier strictement positif
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    // Méthode pour tester si un entier est pair
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entiers = new int[10];

        // Lecture de 10 entiers
        for (int i = 0; i < 10; i++) {
            entiers[i] = lectureN(sc);
        }

        // Affichage du résultat pour chaque entier
        for (int i = 0; i < 10; i++) {
            System.out.println("Entier " + entiers[i] + " est " + (estPair(entiers[i]) ? "pair" : "impair"));
        }

        sc.close();
    }
}
