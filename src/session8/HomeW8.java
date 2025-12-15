package session8;

import java.util.*;

public class HomeW8 {
    static void main(String[] args) {
        shoppingList();
        wishListChristmas();
        studentList();
        exercitiuFOUR();
        cityNames();
        studentNames();
        namesOfFruits();
        movieTitles();
        binaryNumber();
    }

    // Ex1 -----------
    public static void shoppingList() {


        String[] shopping = {"Fruits", "Vegetable", "Meat"};
        System.out.println(shopping[2]);
    }


    // Ex 2 ---------

    public static void wishListChristmas() {

        ArrayList<String> wishList = new ArrayList<String>();
        wishList.add("health");
        wishList.add("happiness");
        wishList.add("peace");

        for (String i : wishList) {
            System.out.println(i);
        }
    }

    public static void studentList() {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("Marcel");
        studentList.add("Madalin");
        studentList.add("Pavel");
        studentList.add("Mihai");
        studentList.add("Mihaela");
        studentList.add("Elena ");
        studentList.add("Catalina");
        studentList.add("Andreea");
        studentList.add("Andrei");
        graduateStudentList.addAll(studentList);
        System.out.println(graduateStudentList);


    }


    // Ex 4 -----------

    public static void exercitiuFOUR() {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int addCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                addCount++;
                System.out.println("Numere pare :  " + evenCount);
                System.out.println("Numere impare : " + addCount);

            }

        }

    }
      //ex 5 -----------

    public static void cityNames() {
        ArrayList<String> citiez = new ArrayList<>(5);
        String[] city ={"Uricani" , "Arad" , "Bistrita" , "Bacau " , "Timisoara"} ;
        System.out.println(System.in);
        Scanner sc = new Scanner("city") ;
        System.out.println(city);
    }



     // EX 6 ------------

    public static void studentNames() {

        LinkedList<String> linkedList = new LinkedList<>() ;
        linkedList.add("Delia");
        linkedList.contains("Delia") ;
        System.out.println(linkedList.contains("Delia"));
        linkedList.remove("Delia") ;
        System.out.println(linkedList.remove("Delia"));
    }



    // Ex7 ------------


     public static void namesOfFruits() {
        ArrayList<String> fruits = new ArrayList<>(3) ;
         fruits.add("Blueberrie") ;
         fruits.add("Strawberries") ;
         fruits.add("Mango") ;
         fruits.add("Pineapple") ;
         Collections.sort(fruits);
         System.out.println(fruits + " ");
         System.out.println(fruits.toArray().length);
     }



     // Ex8  ------------


    public static void movieTitles() {
        String[] movie = {"Game of Thrones" ,"The Originals" ,"The Vampire Diaries" , " Pretty Little Liars"} ;
        Arrays.sort(movie) ;
        System.out.println(Arrays.toString(movie));
        System.out.println(Arrays.binarySearch(movie, "The Originals") ) ;

    }




    //Ex 9 -----------


    public static void binaryNumber() {

      String binaryNumber ="1011" ;
        int decimal = Integer.parseInt(binaryNumber , 2) ;
        System.out.println("Binary" +binaryNumber);
        System.out.println("decimal" +decimal);
    }


    //Ex 10 ----------



}