import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner le numéro du mois(1 á 12).");
        int mois = sc.nextInt();
        switch (mois) {
            case 12 :case 1:case 2:
                System.out.println("hiver");
            
                break;
                case 3 : case 4: case 5:
                System.out.println("printemps");
                break;
                case 6 : case 7 : case 8 :
                System.out.println("été");
                break;
                case 9 : case 10:case 11:
                System.out.println("automne");
                break ;
            default:
                
                System.out.println("Mois invalide!");
        }
    }
    
}
