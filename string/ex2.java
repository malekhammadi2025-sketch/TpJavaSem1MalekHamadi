import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir une chaine ");
        String ch = sc.nextLine(); 
        System.out.println("saisir une caractere");
        char car = sc.next().charAt(0);
        int compteur = 0;
        for (int i = 0 ; i < ch.length();i++){
            if (ch.charAt(i)==car){
                compteur++;
            }
        }
        System.out.println("le caractere"+car+"apparait"+compteur+"fois");
        sc.close();
        

    } 
    
}
