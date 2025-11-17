import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner un nomber (1 á 10)");
        int n = sc.nextInt();
        for (int i = 1; i <= 10 ; i++){
            System:System.out.println(n +"x"+i+"="+(n * i));
        }
        
    }
    
}
