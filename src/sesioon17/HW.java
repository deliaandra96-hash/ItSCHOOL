package sesioon17;

import java.util.ArrayList;
import java.util.List;

public class HW {

    public  static void main(String[] args) {

      List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10) ;
      List<Integer> evenNumbers = number.stream()
              .filter(n -> n % 2 == 0)
              .toList();
        System.out.println(evenNumbers);



        //ex 2 si  -------

        List<String> words = new ArrayList<>(List.of("banana", "apple","pear"));
        words.sort((a ,b ) ->a.compareTo(b));
        System.out.println(words);


        // ex 3 --------

        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream()
                .reduce(0, (a ,b ) -> a + b) ;
        System.out.println(sum);





       // Ex 4 -------
       List<String> words1 = new ArrayList<>(List.of("banana" , "apple" , "pear"));
       words1.sort((a,b ) -> b.compareTo(a));
        System.out.println(words1);





    }
}
