package session11;


import javax.lang.model.element.Name;

public class H {


    static void main(String[] args) {
        System.out.println(" ");

    }
        class UserEmployee {



         private String name ;
         private String email;
         private String team ;
         private String role ;
         private String positionInTeam ;

         public UserEmployee(String name, String email, String team, String role, String positionInTeam) {
             this.name =name;
             this.email = email ;
             this.team =team;
             this.role =role ;
             this.positionInTeam =positionInTeam ;
         }


          public String getName(){
              return name;
          }

            public String getEmail() {
                return email;
            }

            public String getTeam() {
                return team;
            }

            public String getRole() {
                return role;
            }

            public String getPositionInTeam() {
                return positionInTeam;
            }
            public void displayDetails(){

            }
            public void receiveNotification(){

            }

            class Administrator extends UserEmployee{
                public Administrator(String name, String email, String team, String role, String positionInTeam) {
                    super(name, email, team, role, positionInTeam);
                }

                void add() {

                  }
                  void delete() {

                  }
                  void set(){

                  }
                  void get(){

                  }
                  void activate() {

                  }
                  void deactivate(){

                  }
            class Manager extends UserEmployee {
                    String[] user = {};
                    String[] team = {} ;

                public Manager(String name, String email, String team, String role, String positionInTeam) {
                    super(name, email, team, role, positionInTeam);
                }

                @Override
                public void displayDetails() {
                    super.displayDetails();

                }

                String send(){
                    return email ;


                }

             class Team {
                 public String name ;
                 public String id ;
                 public String address ;


                 }
             }

            }

            }
        }

          // Stiu ca nu este bine dar mai mult de atat nu sa putut:))


