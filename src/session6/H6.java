package session6;

import java.util.Scanner;

public class H6 {
    static void main(String[] args) {
        reverseString();
        palindromeCheck();
        concatenateString();
        removeVowels();
    }

    public static void reverseString() {

        StringBuilder sb = new StringBuilder("Delia");
        sb.reverse();
        System.out.println(sb);


    }

    public static void palindromeCheck() {

        Scanner input = new Scanner("sb");
        StringBuilder sb = new StringBuilder("input");
        StringBuilder reversed = new StringBuilder(sb.reverse().toString());
        input.equals(reversed);
        System.out.println("Este palindrom");
        System.out.println("nu este palindrom");


    }
    public static void concatenateString() {

        StringBuilder sb = new StringBuilder() ;
        String s = "1" ;
        s += " 9 " ;
        s += " 9 ";
        s += " 6 " ;
        System.out.println(s);



}

    public static void removeVowels() {

        StringBuilder result = new StringBuilder("Delia");
        String word = " Delia" ;
        for(int i = 0 ; i < word.length() ; i++) {
            char c =word.charAt(i) ;
            if("aeiou".indexOf(c) == -1) {
                result.append(c) ;
            }
        }
        System.out.println("Text witout vowels : " +result.append("c") );



    }

  // public static void wordCapitalizer() ;

  //String sentence = "i want to learn java";
   // StringBuilder result = new StringBuilder();
    //  for (String word : sentence.split(" ")) result.append(Character.toUpperCase(word.charAt(0)).append(word.substring(1)).append(" ");
  //   System.out.println(result.toString().trim());





}






