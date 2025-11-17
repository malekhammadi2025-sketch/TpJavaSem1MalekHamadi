import java.util.Scanner;

public class InverserChaine {
    
    
    public static String inverser(String chaine) {
        String inverse = "";
        for (int i = chaine.length() - 1; i >= 0; i--) {
            inverse += chaine.charAt(i);
        }
        return inverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Donner une chaine : ");
        String mot = sc.nextLine();
        
        String motInverse = inverser(mot);
        System.out.println("Le mot inversé est : " + motInverse);
        
        sc.close();
        
    }
}

