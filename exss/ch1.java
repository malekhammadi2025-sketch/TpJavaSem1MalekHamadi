import java .util.Scanner;
public class ch1 {

    public static  boolean espace (String ch) {
        int a =0;
         char caractere;
         char sp= ' ';
        for (int i=0;i<ch.length();i++){
            caractere = (ch.charAt(i));
            if (caractere==sp){
                a ++;
            }
            
        }
        boolean test;
        if(a==1){
            test=true;
        }
        else{
           test = false;
        }
    return test ;
    }
    public static boolean CarSp(String C){
        int k=0;
        String csp="@#?!$";
        for (int i=0; i<C.length();i++){
            if((csp.indexOf(C.charAt(i)))!=-1){
                      k++;
            }
           // (C.charAt(i)=='&'||C.charAt(i)=='$'||C.charAt(i)=='!'||C.charAt(i)=='?')    
        }
        boolean test;
        if(k==1){
            test=true;
        }
        else{
           test = false;
        }
    return test ;
    }
    public static boolean test (String ch ){
      boolean testy=false;
       for (int i=0; i<ch.length();i++){
        if (Character.isLowerCase(ch.charAt(i))&Character.isDigit(ch.charAt(i))) {
            testy = true;
            
        }

       }
return testy;
        }
    

   
   
    public static void main(String[] args) {
       /*  String ch1="bonjour@";
       if(espace(ch1)){
        System.out.println("valide");
       }
       else{
        System.out.println("non valide");
       } ;
    System.out.println(CarSp(ch1));*/
     Scanner sc =new Scanner (System .in);
     String d;
     do{System.out.println( "donner une chaine de caractere");
     d=sc.nextLine();
    }
     while( (espace(d)==false)|| (CarSp(d)==false) || (test(d)==false)||(d.length()>50) );



        
       }
    }
