package sesioon17;

import java.time.LocalDate;

public class HOMEWORK {
    static void main(String[] args) {

        PersonalInformation personalInformation = new PersonalInformation("John Doe " , "123 Main ST , HOMETOWN USA " , "123-456-77890" ,"john@enample.com");
         personalInformation.showDisplay();
         Objective ob = new Objective(" To leverage my 5 years of experoence in Java development and problem -solving skills in a senior develoer role , contributing to team successes through hard work and collaboration") ;
         ob.showDisplay1();
         Education education = new Education("ABC University" ,"Bachelor of Science in Computer Science","May 2020") ;
         education.showDispley2();
    }
        static class PersonalInformation{
            String name ;
            String address;
            String phoneNumber ;
            String email ;


                PersonalInformation(String name, String address, String phoneNumber, String email) {

                    this.name = name;
                    this.address = address;
                    this.phoneNumber = phoneNumber;
                    this.email = email;


            }



            void showDisplay(){
                System.out.println(name + " " +address+ " " + phoneNumber+ " " + email);
            }
    }

      static class Objective {
        String text ;
        Objective(String text ) {
            this.text = text ;

        }

        void showDisplay1(){
            System.out.println(text+ " ");
        }
       }

       static class Education{

             String universityName ;
             String degree ;
             String graduationDate ;

             Education(String universityName, String degree, String duratin){
                 this.universityName = universityName;
                 this.degree = degree ;
                 this.graduationDate = graduationDate;

             }

             void showDispley2(){
                 System.out.println(universityName+ " " +degree+ " " +graduationDate);
             }

       }

}