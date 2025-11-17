import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String text;

/*while (true) {
System.out.print("saisir un texte ");
text = sc.nextLine();
if (text.length() <= 50)
 break;
System.out.println("repte un autre fois");
}*/
System.out.print("saisir un texte ");
text = sc.nextLine();
while (text.length() > 50) {
    System.out.print("saisir un texte ");
text = sc.nextLine();
    
}



int count = 0;
for (int i = 0; i < text.length(); i++) {
char c = text.charAt(i);
if (Character.isLowerCase(c)) count++;
}

System.out.println("le texte "+text+" contient " + count + " lettre minuscules ");
sc.close();
}
}

