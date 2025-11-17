import java.util.Scanner;

public class parite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,u ,d ;
        do{
            System.out.println("Donner un entier a");
            a=sc.nextInt();
        }
         while(a<10 || a>99);
         u = a % 10 ;
         d = a / 10 ;
         if ((u % 2 == 0 &&  d % 2 == 0) || (u % 2 != 0 &&  d %2 != 0)){
            System.out.println(a+ " est coherent");
         }
            else{
                System.out.println(a+" est incoherent");
            }
    

       
    }
}
