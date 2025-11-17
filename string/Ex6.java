import java.util.Scanner;

public class Ex6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Entrer un verbe du 1er groupe (terminé par 'er') : ");
String verbe = sc.nextLine();
String racine = verbe.substring(0, verbe.length() - 2);
System.out.println("Conjugaison du verbe " + verbe + " au présent :");
System.out.println("Je " + racine + "e");
System.out.println("Tu " + racine + "es");
System.out.println("Il/Elle " + racine + "e");
System.out.println("Nous " + racine + "ons");
System.out.println("Vous " + racine + "ez");
System.out.println("Ils/Elles " + racine + "ent");

sc.close();
}
}
