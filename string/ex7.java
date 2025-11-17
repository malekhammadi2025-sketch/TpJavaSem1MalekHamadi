import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("donner un entier ");
int n = sc.nextInt();
String s = String.valueOf(n);
System.out.println("nbr " + s);
sc.close();
}
}
