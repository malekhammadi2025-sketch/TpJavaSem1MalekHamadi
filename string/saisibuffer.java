import java.util.Scanner;

public class saisibuffer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String ch2 = sc.nextLine();
        StringBuffer ch = new StringBuffer(ch2);
        System.out.println("les contenu du StringBuffer est:"+ch);
        sc.close();
    }
    
}
