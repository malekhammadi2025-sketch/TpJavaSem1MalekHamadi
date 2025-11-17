import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Donne la température");
        int t = sc . nextInt (); 
        if (t <= 0)
        System.out.println("Glace"); 
        else if (t <=100)
        System.out.println("Eau");
        else 
          System.out.println("vapeur");

        }
    }
