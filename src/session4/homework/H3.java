package session4.homework;

import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class H3 {

    static void main(String[] args) {

        // ex 1 ------------

        String stringOne ="OpenAI" ;
        String stringTwo ="OpenAI" ;

        System.out.println("Same object?" +(stringOne == stringTwo)); // true


        //ex2 --------------

        int firstNumber = 29 ;
        int secondNumber = 30 ;

        System.out.println(firstNumber == secondNumber); //false

        String  firstString = "first";
        String  secondString = "first" ;

        System.out.println(firstString.equals(secondString)); //true



        //ex3 --------------

        int age = 20;
        if ( age >= 18 ) {
            System.out.println( " I am adult"); //true
        } else {
            System.out.println("I am not an adult");
        }



        //ex4 --------------

        int heightOne = 163;
        int heightTwo = 165;

        int maximumHeight=(heightOne > heightTwo) ? 163 : 165 ;
        System.out.println("Maximumheight" +maximumHeight); //Maximumheight 165




        //ex5 ---------------

        for(int i =1 ; i <= 10 ; i++) {
            System.out.println(i);
        }
        for(int i= 2; i <= 10 ; i+=2 ) {
            System.out.println(i);
        }



        //ex6 ---------------

        int temperature = 30;
        System.out.println("Hot");
        if(temperature > 20) {
            System.out.println("Warm");
        }
        if(temperature > 15) {
            System.out.println("Cold");
        }



        // Ex 7

        int sideOne = 10 ;
        int sideTwo = 10 ;
        int sideThree = 10 ;

        String type = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral " : (sideOne ==sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene" ;

        System.out.println(" The triangle is : " + type);





        //Ex 8

        int number = 7 ;
        int factorial = 3 ;
        for (int i = 1; i<= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial" +factorial);





        // Ex 9

        String countryOne = "USA" ;
        String countryTwo = "USA" ;
        System.out.println(countryOne.equals(countryTwo));





        // 10

        ArrayList<String>
                listOne = new ArrayList<>();
                 listOne.add("apples") ;
                 listOne.add("melon") ;
        ArrayList<String>
                  listTwo = listOne ;
                  listOne.add("oranges") ;
        System.out.println("LIST 1 :" +listOne);
        System.out.println("List 2 : " +listTwo);




        // Ex 11

        int a = 10 ;
        int b = 20 ;
        int c = 30 ;
        int d = 40 ;
        int additionResult = a + b ;
        int multiplicationResult = c * d ;
        System.out.println("the sum of a + b is : " +additionResult);
        System.out.println("the sum of c * d is : " +multiplicationResult);




        // Ex 12

        int Number = 25 ;
        int negativNumber = -number ;
        System.out.println("Number : " + number);
        System.out.println("Negative number : " +negativNumber);





        //13
        boolean isRaining = true ;
        boolean isSunny = false ;
        isRaining = !isRaining ;
        isSunny = !isSunny ;
        System.out.println(" isRaining : " +isRaining);
        System.out.println("isSunny : " +isSunny);





        // Ex 14

        int couter = 0 ;
        System.out.println(++couter);

        couter-- ;
        System.out.println(--couter);




        // Ex 15

       int total = 100;
       total -= 20 ;
        System.out.println("After subtraction :" +total);

        total*= 2;
        System.out.println("After multiplicatin :" +total);



        //Ex 16

        int number1 = 50 ;
        number1 =-number1 ;
        System.out.println("Negatet : " +number1);
        number1++ ;
        System.out.println("Increment : " +number);








        //17

        boolean hasUsername = true ;
        boolean hasPassword = false ;

        if(hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }





        // 18

        int[] numbers = new int[5] ;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i + 1 ;
        }

        System.out.println("Before decrement : ");
        for(int num : numbers) {
            System.out.println(num + "");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] - 1 ;
        }
        System.out.println("After decrement :");
        for (int num : numbers) {
            System.out.println(num + "");

        }





        // Ex 19

      int age1 = 29;

      String category =(age <= 12) ? "Childe" :(age <= 17) ? " Teenager": (age <= 64)  ? "Adult" : "Senior" ;
        System.out.println("Age :" +age);
        System.out.println("Category" +category);




        // 20

        int a1 = 15 ;
        int b2= 19 ;
        int c3= 35 ;
        int max =(a1 > b2) ? ((a1 > c3 ) ? a1 : c3  ) : ((b2 >c3) ? b2 : c3) ;
        System.out.println("mAX VALUE IS : " +max);






        // Ex 21

         double score = 70 ;
         String grade = (score >=90) ? "A" : (score >=80) ? "B" : (score >= 70) ? "C" : (score >=60) ? "D" : "F" ;
        System.out.println("Grade : " +grade);
        // max value 35
        // grade : c







































    }
}
