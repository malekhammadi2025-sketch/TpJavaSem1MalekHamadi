import java.util.Scanner; 

public class Cryptage {

public static String crypter(String phrase) {
String[] mots = phrase.split(" "); 
StringBuilder resultat = new StringBuilder();

for (String mot : mots) {
StringBuilder motCrypte = new StringBuilder();
int i = 0;

while (i < mot.length()) {
int count = 1;


while (i + 1 < mot.length() && mot.charAt(i) == mot.charAt(i + 1)) {
count++;
i++;
}

motCrypte.append(count).append(mot.charAt(i));
i++;
}

resultat.append(motCrypte).append(" ");
}

return resultat.toString().trim();
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 

System.out.println("Donner une phrase : ");
String phrase = sc.nextLine(); 

String crypte = crypter(phrase); 

System.out.println("Texte original : " + phrase);
System.out.println("Texte crypté : " + crypte);

sc.close(); 
}
}

