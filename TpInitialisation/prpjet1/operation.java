public class operation {
public static void main(String[] args) {
    int A = 8 , B = 17 ;
    Boolean Res ;
    Res = A > B ;
    System.out.println("A > B?:"+ Res);
    Res =! (A>B);
    System.out.println("!(A>B):"+ Res);
    Res = A==B;
    System.out.println("A==B:"+Res);
    Res=A!=B ;
    System.out.println("A!=B:"+Res);
    Res=(A<B)&(A==B);
    System.out.println("(A<B)&(A==B)?:"+Res);
    Res=(A<B)|(A==B);
    System.out.println("(A<B)|(A==B)?"+ Res);
    Res=(A<B)^(A==B);
    System.out.println("(A<B)^^(A==B)?"+Res);
    Res=A<B? true :false  ;
    System.out.println("A<B ? true : false ? "+ Res);
   int x=4 , y = 10;
   x = y ++ ;
   System.out.println(x);
   System.out.println(y);
   x = ++y ;
   System.out.println(x);
   System.out.println(y);
}
}