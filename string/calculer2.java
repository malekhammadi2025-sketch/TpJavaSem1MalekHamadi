import java.util.Scanner;

public class calculer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int X , K ;
        System.out.println("donner un entier X");
        X = sc.nextInt();
        if (X >=0) {
            K=X ;
            
        }
        else {
            K = -(X);

        }
        System.out.println("la valeur d'un entier"+X+"est"+K);

    }
}
