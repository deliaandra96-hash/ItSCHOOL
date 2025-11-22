import java.util.Arrays;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        out.println("HELLO TO JAVA");

       int age = 29 ;
       short age2 = 30 ;
       long number = 222000000L ;
        double weight = 53.0d ;
        float weightFloat =53.5F ;
        boolean alive = true ;
        char litera = 'A' ;
        byte something = 0 ;
      out.println(" voi printa varsta mea : " +age);  ;
      out.println(" voi printa age 2 , nu stiu ce e asta " +age2) ;
      out.println("voi printa acuma number : " + number);
        for (String s : Arrays.asList(" cantaresc " + weight, " cantaresc mai exact " + weightFloat, " sunt in viata ? " + alive, " Prima litera din alfabet este " + litera)) {
            out.println(s) ;
        }

        String name = " Delia " ;
        out.println("Ma numest " +name) ;

        int numar1 = 10 ;
        int numar2 = 5 ;
        int sum ;
        sum = numar1 + numar2 ;
        out.println("adunare:" +sum);
        out.println(numar1 + numar2);
        int dif = numar1 - numar2;
        out.println("scadere:" +dif);
        int mul = numar1 * numar2;
        out.println("inmultire:" +mul);
        int sub = numar1 / numar2;
        out.println("impartire: " +sub) ;
    }
}