import java.util.Scanner;

public class Cryptage1 {

    // --- Fonction pour crypter un mot ---
    public static String crypter(String mot) {
        String resultat = "";  
        int i = 0;           

        while (i < mot.length()) {
            char lettre = mot.charAt(i); 
            int compteur = 1;            

            while (i + 1 < mot.length() && mot.charAt(i + 1) == lettre) {
                compteur++;
                i++;       
            }

            resultat = resultat + compteur + lettre;
            i++; 
        }

        return resultat;
    }

    // --- Fonction tokeneize (pour garder les mots et ignorer les espaces) ---
    public static String tokeneize(String phrase) {
        String resultatFinal = "";
        String mot = "";

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (c != ' ') {
                mot = mot + c; // construire le mot
            } else {
                // si on atteint un espace, on crypte le mot et on ajoute un espace
                if (!mot.equals("")) {
                    resultatFinal = resultatFinal + crypter(mot) + " ";
                    mot = ""; // réinitialiser le mot
                }
            }
        }

        // crypter le dernier mot (s’il y en a un)
        if (!mot.equals("")) {
            resultatFinal = resultatFinal + crypter(mot);
        }

        return resultatFinal;
    }

    // --- Programme principal ---
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner une phrase : ");
        String phrase = clavier.nextLine(); 

        String phraseCryptee = tokeneize(phrase);

        System.out.println();
        System.out.println("Texte original : " + phrase);
        System.out.println("Texte crypté   : " + phraseCryptee);

        clavier.close(); 
    }
}

