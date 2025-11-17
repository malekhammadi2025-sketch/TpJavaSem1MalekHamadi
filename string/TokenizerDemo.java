import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String texte1 = "bonjour      les etudiants , bienvenue en java !";
        StringTokenizer st1 =new StringTokenizer(texte1,",");
        System.out.println("decoupage du texte en mots :");
        while (st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        System.out.println("le texte principale est :"+texte1);
    }
    
}
        

