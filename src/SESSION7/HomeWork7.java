package SESSION7;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeWork7 {
    static void main(String[] args) {
        displayTodaysDate();
        displayDateComponents();
        areDatesEqual();
        todaySpecificData();
        displayCurrentTime();
    }

     // Ex 1 --------------

    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now() ;
        System.out.println("Today date : " +today);
    }

    // Ex 2 ----------------

    public static void displayDateComponents() {
        LocalDate Year = LocalDate.now() ;
        int YYYY = 2025 ;
        int MM = 12 ;
        int DD = 10 ;
        System.out.println(YYYY);
        System.out.println(MM);
        System.out.println(DD);

    }

    // Ex 3 -------------------











    // Ex 4 -------------

    public static void areDatesEqual() {
       LocalDate today = LocalDate.now() ;
        Scanner input = new Scanner("today" ) ;
        System.out.println(input);

    }


    //Ex 5 //
    public static void todaySpecificData() {
        LocalDate todaySpecificData = LocalDate.ofYearDay(2019 ,10);
        System.out.println(todaySpecificData);

    }



    //Ex 6 ----------------

    public static void displayCurrentTime() {
        LocalDateTime formatter = LocalDateTime.now();
        int HH = 13 ;
        int MM = 59 ;
        int SS = 47;
        System.out.println("HH:MM:SS ");
    }




}
