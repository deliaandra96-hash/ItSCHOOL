package session3;

public class LogicalOperators {
   public static void main(String[] args) {

       boolean isPresent = true ;
       boolean isRegistred = false ;

       System.out.println(" isPresent =" +isPresent);
       System.out.println("isPresent =" +isRegistred);
       System.out.println("isPresent = " + !isPresent);
       System.out.println("!isRegistred =" + !isRegistred);

       int a = 10 ;
       int b = 20 ;
       // int a = 10 , b = 20 ;

       System.out.println(a == b );
       System.out.println(a != b );
       System.out.println(a < b );
       System.out.println(a > b );
       System.out.println(a <= b);
       System.out.println(a >= b);

       if(a < b ) {
           System.out.println("a este mai mic sau egal decat b ");
       }

       if( a<= b ) {
           System.out.println("a este mai mic decat b ");
       } else {
           System.out.println(" a este mai mare sau egal decat b  ");
       }

       if (a > b ) {
           System.out.println("a este mai mare decat b");
       } else if ( a ==b ) {
           System.out.println(" a este egala cu b");
       } else {
           System.out.println(" a este mai mic decat b ");
       }
        int x;
       x = ( a < b) ? 1 : 2 ;
       System.out.println(" val x = " +x);

       int y;
       y = (a == b ) ? 1: 2 ;
       System.out.println("val y = " +y);

       boolean w;
       w =(x> y) ? true: false ;
       System.out.println(" val w = " + w);


    }
}
