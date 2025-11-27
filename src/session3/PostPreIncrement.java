package session3;

public class PostPreIncrement {
  public  static void main(String[] args) {

       int x = 5 ;
       int y = x ++ ; // y = 5 , x + 1 x=6
      System.out.println(x);
      System.out.println(y);

      int z = 5 ;
      int w = ++z ; //z = 6  w <- z(6)

      System.out.println(z);
      System.out.println(w);

      x = 5 ;
      y = x-- ; // y <- x   ->  x= x--1 ;
      System.out.println(x);
      System.out.println(y);

      z = 5 ;
      w = --z ;  // z= z -1 ; w = z
      System.out.println(z);
      System.out.println(w);



    }
}
