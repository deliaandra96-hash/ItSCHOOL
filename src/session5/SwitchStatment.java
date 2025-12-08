package session5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class SwitchStatment {

   public static final  int MONDAY = 1;
   public static final int TUESDAY = 2 ;
   public static final int WENSDAY = 3 ;
   public static final int THURSDAY = 4;
   public static final int FRIDAY = 5 ;

    static void main() {

 //   printDayOfWeek();
    prindDayOfWeekSimpleEdiyion();
    printGrade();
    }


    private static void  printDayOfWeek() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu ziua :");
        String day = input.nextLine() ;

        switch (day) {
            case"Monday" :
                System.out.println("today is Monday");
                break;
            case"Tuesday" :
                System.out.println("Tuesday");
                break;
            case "Thursday" :
                System.out.println("Thursday");
                break;
            case"Friday" :
                System.out.println("Friday");
                break;
            default:
                System.out.println("weekend");
        }

    }




     private static void prindDayOfWeekSimpleEdiyion() {
        Scanner input = new Scanner(System.in) ;
         System.out.println("inserati 1-5 numarul zilei");
         int day =input.nextInt();

         switch (day) {
             case MONDAY -> System.out.println("Monday");
             case TUESDAY -> System.out.println("Tuesday");
             case WENSDAY -> System.out.println("Wensday");
             case THURSDAY -> System.out.println("Thursday");
             case FRIDAY -> {
                     System.out.println("Friday");
                 System.out.println(" is it ?");
             }
             default -> System.out.println("probabil weekend");
         }
     }



     private static void printGrade() {
         Scanner input = new Scanner(System.in);
         System.out.println("inserati o nota de la A la D ");
         char grade = input.nextLine().toUpperCase().charAt(0);

         switch (grade) {
             case 'A' -> System.out.println("bravo");
             case 'B' -> System.out.println("almost");
             case 'C' -> System.out.println("not good");
             case 'D' -> System.out.println("bad");
             default -> System.out.println("eroare la citire");
         }
    }

}
