import java.util.Scanner;

public class caractere {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        char X;
        do {
            System.out.println("donner un charactere X");
          X= sc.next().charAt(0);
        }
       while (!((X >= 'a' && X <= 'z') || (X >= 'A' && X <= 'Z')));
       System.out.println("Caractère valide saisi : " + X);
       
    }
}
