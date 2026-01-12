//package session12;

import java.awt.*;

public  class HW {
}




// Ex1 --------
public abstract  class Parent {
    public void message(){
        System.out.println("this is a class primary : ");
    }

    abstract String sendMessage();

}


class Child extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass ");
    }

    @Override
    public String sendMessage() {
        return "";
    }

    class GrandChild extends Parent {

        @Override
        public void message() {

            System.out.println("This is second");
        }

        @Override
        public String sendMessage() {
            return "";
        }

    }
}
// Ex 2 ---------
abstract class Bank{

    public Bank(String name ) {

    }

    public void  getBalance() {
        System.out.println("Bank");

    }

    class BankA extends Bank{

        BankA(String name) {
            super(name);
        }
        @Override
        public void getBalance() {
            int depozit = 100;
            System.out.println("depozpit bank a :   " +depozit);

        }
    }


    class BankB extends Bank{
        BankB(Integer accountNumber ) {
            super("B") ;
            this.getBalance();
        }
        @Override
        public void getBalance() {
            int depozit = 150 ;
            System.out.println("deposit bank b  " +depozit);
        }
    }


    class BankC extends Bank{
        BankC(String currency ){
            super("$");
            this.getBalance();
        }
        @Override
        public void getBalance() {
            int depozit = 200 ;
            System.out.println("depozit bank c " +depozit);
        }
    }
}


    public void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            public String sendMessage() {
                return "";
            }
        };

        parent.message();
        Child child = new Child();
        child.sendMessage();

        Bank bank = new Bank("") {

            BankA bankA = new BankA("A");

            public BankA getBankA() {
                return bankA;
            }

            BankB bankB = new BankB(241241324);
            BankC bankC = new BankC("C");


        };
        Marks a = new StudentA(88, 90, 100);
        Marks b = new StudentB(77, 83, 87);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());


        Cat cat = new Cat() {
            @Override
            public String cats() {
                return "";
            }

            @Override
            public String dogs() {
                return "";
            }
        }  ;

        Dog dog = new Dog() {
            @Override
            public String cats() {
                return "";
            }
        };

        Area area = new Area(5.0,4.0,2.5){
            @Override
            double reactangleArea() {
                return super.reactangleArea();

            }

            @Override
            double squareaArea() {
                return super.squareaArea();
            }

            @Override
            double circleArea() {
                return super.circleArea();
            }
        } ;

    }


SubClass subClass= new SubClass() {
    @Override
    public void a_method() {
        super.a_method();
        System.out.println("This is normal method");
    }

    @Override
    public void a_methood() {
        super.a_methood();
        System.out.println(" This is abstract method ");
    }
}

        ;


// EX 3 ------


abstract static class Marks {

    protected int note1;
    protected int note2;
    protected  int note3;

    public Marks(int note1 , int note2, int note3) {
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    abstract double getPercentage();

}

class StudentA extends Marks {


    StudentA(int note1, int note2, int note3) {
        super(note1, note2, note3);
    }

    @Override
    double getPercentage() {
        return 75.5;
    }
}

class StudentB extends Marks{

    StudentB(int note1, int note2, int note3) {
        super(note1, note2, note3);
    }

    @Override
    double getPercentage() {
        return 85.9;
    }
}


// EX 4 -------


abstract class Abstract {

    public Abstract() {


        System.out.println("This is constructor of abstract class ");

    }
    void a_methood(){


        System.out.println("This is a normal method of abstract class ");
    }

    public void a_method() {

    }

}


class SubClass extends Abstract{
    public void a_method(){
        System.out.println("This is abstract method");
        //metoda stiu ca nu este bine , stiu ca ii fara body , trebuie declarata in clasa abstracta si trebuie suprascrisa in subclasa dar orice fac imi da eroare , numa asa imi merge
    }

}


// Ex 5 ---------


abstract class  Animal {
    protected String cats;
    protected String dogs;
    public abstract String cats();
    public abstract String dogs();
}
abstract   class Cat extends Animal {

    @Override
    public String cats() {
        return "Cats meow";

    }
}

abstract class Dog extends Animal{

    @Override
    public String dogs() {
        return "dogs bark";
    }
}

void main() {
}


// Ex 6 ---------

     abstract class Shape {

            abstract double reactangleArea();
            abstract double squareaArea() ;
            abstract double circleArea();

         private double reactangleArea = 5.0;
         private double squareaArea = 4.0;
         private double circleArea = 2.5;

           public Shape(double reactangleArea, double squareaArea, double circleArea){
               this.reactangleArea= reactangleArea;
               this.squareaArea = squareaArea;
               this.circleArea =circleArea ;

           }

     }

class Area extends Shape{

    public Area(double reactangleArea, double squareaArea, double circleArea) {
        super(reactangleArea, squareaArea, circleArea);
    }

    @Override
    double reactangleArea() {
        return 0;
    }

    @Override
    double squareaArea() {
        return 0;
    }

    @Override
    double circleArea() {
        return 0;
    }
}
