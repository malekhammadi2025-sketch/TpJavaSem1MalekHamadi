import java.util.Scanner;

public class calculer {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int X , T ;
       System.out.println("donner un entier X"); 
       X = sc.nextInt();
       T= Math.abs(X);
       System.out.println("la valeur d'un entier"+X+"est"+T);
    }
}


