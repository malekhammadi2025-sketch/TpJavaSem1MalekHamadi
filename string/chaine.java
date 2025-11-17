import java.util.Scanner;

public class chaine {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    String ch ;
    do{
        System.out.println("donner une phrase");
        ch=sc.nextLine();
    }
    while(ch.length()>30);
    String res=""; 
    for (int i = 0; i<ch.length();i++){
        char c = ch.charAt(i);
        if(c>='a'&& c <= 'z'){
            c =(char)('a'+(c-'a'+3)%26);
        }
        else if (c>='A'&& c <= 'Z'){
            c=(char)('A'+(c-'A'+3)%26);
        }
        res=res+c;
    }
    System.out.println(res);
    }
    
}
