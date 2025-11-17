import java.util.Scanner;
import java.util.scanner;
public class Exercice5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("De quel mois s agit-il:");
        int mois = sc.nextInt();
        System.out.print("De quelle annee ?:");
        int annee = sc.nextInt();
        if (mois < 1|| mois> 12){
            System.out.println("impossible , ce mois n existe pas ");
}else{
    int jours ;
    switch (mois) {
        case 1 :case 3 : case 5: case 7: case 8: case 10: case 12 : 
        jours = 31 ;
        break ;
        case 4 : case 6 : case 9 : case 11 : 
        jours = 30;
        break;
        case 2 :
        if ((annee% 4 == 0 && annee % 100 ! = 0)||(annee% 400 ==0 )) {
            jours = 29 ; 
        } else {
            jours = 28 ;
        }
        break;
        default :
        jours = 0 ;
            
        }
        System.out.println("En"+annee+", le mois n"+mois+"a"+jours+"jours");
            
        }
            
         sc.close();
    }
