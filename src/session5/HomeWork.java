import java.util.Scanner;

public class HomeWork {
    static void main(String[] args) {

        //Ex 1
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter an integer  : ");
        int number =input.nextInt() ;
        if (number % 2 == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}



      // eX 2
static void main() {

       Scanner input = new Scanner(System.in) ;
    System.out.println("Enter a namber between (1 -12 ) " );
      int month = 6 ;
      switch (month) {
          case 1 -> System.out.println("January");
          case 2 -> System.out.println("Februari");
          case 3 -> System.out.println("March");
          case 4 -> System.out.println("April");
          case 5 -> System.out.println("May");
          case 6 -> System.out.println("June");
          case 7 -> System.out.println("July");
          case 8 -> System.out.println("August");
          case 9 -> System.out.println("September");
          case 10 -> System.out.println("October");
          case 11 -> System.out.println("November");
          case 12 -> System.out.println("December");
          default -> {
              System.out.println("Invalid Month");
              System.out.println("Print the name of the corresponding month");
          }
      }


}



      //Ex 3


void main(String[] args) {
    int[] array = {1, 2, 3, -1, -2, -3};
    System.out.println("print the number :" + Arrays.toString(array));


    // Ex 4


    Scanner input = new Scanner(System.in);
    String txt = "Delia";
    char letter = txt.toUpperCase().charAt(2);
    System.out.println("letter : " + letter);


    // 5

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter the number n : ");
    int n = input.nextInt();
    int a = 0;
    int b = 1;
    System.out.println("The first " + n + "Fibonacci numbers are : ");
    for (int i = 0; i < n; i++) {
        System.out.println(a + "");
        int next = a + b;
        a = b;
        b = next;
    }
}


     //  ex 6
    // int i = 5 ;
  //  System.out.println("Enter numbers");
   //  while (i < -1) {
// System.out.println("all numbers : " +i);
  //       i-- ;
  //  }


      // ex 7




     //   Scanner input = new Scanner(System.in);
      //  int i = 5;
       //  do{
       //      System.out.println("quess the number " +i);
      //   } while ( i <



     // ex 8


       // int n1 = 0, n2 = 1;
      //  System.out.print(n1 + " " + n2 + " ");

       // for (int i = 3; i <= 10; i++) {
      //  int next = n1 + n2;
      //  System.out.print(next + " ");
      //  n1 = n2;
      //  n2 = next;




        // ex 9

        //int[] numbers = {3, 4, 7, 10, 15};

        //for (int number : numbers) {
        //if (number % 2 == 0) {
       // System.out.println(number + " - Even");
       //   } else {
       //            System.out.println(number + " - Odd");




    // ex 10


            //System.out.println("Menu:");
            //System.out.println("1. Print \"Hello World\"");
            //System.out.println("2. Print your name");
            //System.out.println("3. Exit");
            //System.out.print("Choose an option: ");
            //int option = scanner.nextInt();
            //scanner.nextLine(); // consume newline

            //switch (option) {
       // case 1:
             //System.out.println("Hello World");
                //    break;
                  //          case 2:
                      //      System.out.print("Enter your name: ");
              //String name = scanner.nextLine();
                //    System.out.println("Your name is: " + name);
                //    break;
                      //      case 3:
                         //   System.out.println("Exiting...");
                    //return;
                     //default:
               // System.out.println("Invalid option. Try again.");




          // ex 11 ---------------


            //Scanner scanner = new Scanner(System.in);
            //int sum = 0, count = 0;

            // while (true) {
              //  System.out.print("Enter a number (0 to stop): ");
             //int num = scanner.nextInt();
             // if (num == 0) break;
             //sum += num;
             //count++;

             //    if (count == 0) {
            //  System.out.println("No numbers entered.");
            //       } else {
             //   System.out.println("Average: " + (double) sum / count);














