import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("donner un entier positif :");
        int n = sc.nextInt();
        long fact = 1 ; 
        for (int i = 1 ; i <=n ; i++){fact =fact*i;}
        System.out.println(n+"!="+fact);
    }
    
}
