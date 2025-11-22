public class Main {

    public static void main(String[] args) {
           //Afisan un mesaj simplu la inceputul programului
        System.out.println("Hello to Java ");

         // Declararea si initializarea variabilelor

          int age = 29 ;
          short age2 =30;
          long number = 2222200;
          double weight = 53.0d;
          float weightFloat = 115.5f ;
          boolean alive = true ;
          char litera = 'A' ;
          byte something = 0 ;

          //Afisarea variabilelor

        System.out.println("Varsta mea este: " +age);
        System.out.println("Alta varsta (short):" +number);
        System.out.println(" Un numar foarte mare (long)" +number);
        System.out.println("Greutate (double)" +weight);
        System.out.println("Greutate mai exacta (float)" +weightFloat);
        System.out.println("Sunt in viata ? " +alive);
        System.out.println("Prima litera din alfabet" +litera);
        System.out.println("Valoare byte " +something) ;

        //Variabila de tip String

        String name = "Delia " ;
        System.out.println("Ma numesc :" +name) ;

        //Operatii aritmetice de baza

        int numar1 =10;
        int numar2 =5;

        int sum =numar1 + numar2;
        int dif =numar1 - numar2 ;
        int mul= numar1 * numar2;
        int div = numar1 / numar2 ;

        System.out.println("Adunare:" +sum);
        System.out.println("Adunare directa :" +(numar1 + numar2));
        System.out.println("Scadere:" +dif);
        System.out.println("Inmultire:" +mul);
        System.out.println("Impartire:" +div);


      }
}