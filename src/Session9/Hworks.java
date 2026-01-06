package Session9;

import java.util.Collections;
import java.util.List;

public class Hworks {
   public static void main(String[] args) {

       Student s1 = new Student("Ana ", "Popescu", "F", 20, 2005 - 8 - 17, "205081738541", "Timisoara Calea Victoriei 12");
       s1.showStudent();
       Student.Profesor p1 = new Student.Profesor("Andrei ", "Barbu", "M",32,12-02-1992,"10920212123456","Timisoara str.Aries nr. 10","Math",90);
       Student.Profesor p2 = new Student.Profesor("Cristina","Ilie","F",35,12-02-1992,"2890907123457","Timisora. Str.Martirilor nr8", "Computer Science", 60 ) ;
       Student.Profesor p3 = new Student.Profesor("Sorin", "Popescu", "M", 35,07-9-1989,"1860601123458","Timisora. str.Circumvalatiunii nr 15","Cemistry", 60) ;
       Student.Profesor p4 = new Student.Profesor("Mihaela ", "Tudor", "F",30, 01-06-1986,"1860601123458","Timisora, str.Simion Varnutiu nr.3 ", "Biology" ,90);
       Student.Profesor p5 = new Student.Profesor("Daniel", "Nistor","M",33,18-8-1992,"1910818123460","Timisoara. str.Bega nr.21","Geography",120);
       Student.Profesor p6 = new Student.Profesor("Alina ", "Marinescu","F",36,05-05-1988,"2880505123461","Timisoara. str.Daliei nr 6","English" ,90);
       Student.Profesor p7 = new Student.Profesor("Florin", "Vasile","M",39,30-01-1985,"1850130123464","Timisoara. str.Mures nr1","History",60);
       Student.Profesor p8 = new Student.Profesor("Radu","Cernat","M",31,27-11-1993,"19311271234662","Timisora. str.Transilvania nr.12","Physics",40) ;
       p1.showProfesor();
       p2.showProfesor();
       p3.showProfesor();
       p4.showProfesor();
       p5.showProfesor();
       p6.showProfesor();
       p7.showProfesor();
       p8.showProfesor();
       Student2 s2 = new Student2("Andreea","Ciulea",100, Collections.singletonList(9));
       s2.showStudent2();
       AccountBanking c1 = new AccountBanking("ANDREEA",5000);
       System.out.println("Soldul curent este : " +c1.getBalance());

   }
}

     class Student {
         String firstName ;
         String lastName ;
         String sex ;
         int age ;
         int dateOfBirth ;
         String CNP ;
         String addres ;

         Student(String firstName, String lastName, String sex , int age, int dateOfBirth , String CNP, String addres) {
             this.firstName = firstName ;
             this.lastName = lastName ;
             this.sex = sex ;
             this.age = age ;
             this.dateOfBirth = dateOfBirth;
             this.CNP = CNP;
             this.addres = addres ;

         }
          void showStudent() {
              System.out.println(firstName);
              System.out.println(lastName);
              System.out.println(sex);
              System.out.println(age);
              System.out.println(dateOfBirth);
              System.out.println(CNP);
              System.out.println(addres);
          }


           static class Profesor{
              String firstName ;
              String lastName ;
              String sex ;
              int age ;
              int dateOfBirth ;
              String CNP ;
              String addres ;
              String courses;
              int duration;

           Profesor(String firstName,String lastName,String sex,int age, int dateOfBirth,String CNP, String addres,String courses,int duration){
               this.firstName =firstName ;
               this.lastName = lastName;
               this.sex = sex ;
               this.age = age;
               this.dateOfBirth = dateOfBirth;
               this.CNP = CNP ;
               this.addres = addres;
               this.courses = courses;
               this.duration = duration ;
           }

           void showProfesor(){
               System.out.println("first name :" +firstName);
               System.out.println("last name : "  +lastName);
               System.out.println(" sex: " +sex);
               System.out.println("age : " +age);
               System.out.println("date of birth : " +dateOfBirth);
               System.out.println("CNP : " +CNP);
               System.out.println("addres : " +addres);
               System.out.println("course : " +courses);
               System.out.println("duration : " +duration);
           }
          }
     }


     //ex 2 --- school gradebook
     class Student2 {

         private  String firstName;
         private   String lastName;
         private  int id ;
         private List<Integer> grade;

     Student2(String firstName,String lastName, int id , List<Integer> grade) {
         this.firstName = firstName ;
         this.lastName = lastName ;
         this.id = id ;
         this.grade = grade ;
     }
     void showStudent2(){
         System.out.println("first name : " +firstName);
         System.out.println("last name : " +lastName);
         System.out.println("id  : " +id);
         System.out.println(" grade : " +grade);



         }
     }



     // ex 3 ------

    class AccountBanking {


         private String titular ;
         private int sold ;

      public AccountBanking(String titular , int deposit){
          this.titular = titular ;
          this.sold = sold ;

      }

       void deposit(int suma) {
           if (suma >= 0) {
               sold = sold + suma;
           } else {
               System.out.println(suma);
           }
       }
       void withdraw(int suma) {
           if (suma >= 0) {
               sold = sold - suma;
           } else {
               System.out.println(suma);
           }
       }
         public int getBalance() {
          return sold ;


           }
      }





