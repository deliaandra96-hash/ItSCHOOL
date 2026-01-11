package session11;

import Session9.Person;

public class Animal {
    public void makeSound(){
        System.out.println("animal makes sounds");
    }
    public void sleep() {
        System.out.println("animal sleeps");

    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog make sound");

    }
    @Override
    public void sleep(){
        System.out.println("dog sleep");
    }
    public void fetch(){
        System.out.println("dog get the ball");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cats Miau");
    }
    @Override
    public void sleep(){
        System.out.println("cats sleep");
    }
    public void Scratch(){
        System.out.println("cats make big scratches");
    }
}

class AnimalTest{
    static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal.sleep();
     //   myAnimal.fetch();
        System.out.println(myAnimal.getClass().getSimpleName());


        try{
            Cat cat = (Cat) myAnimal;
            cat.makeSound();
        }catch (ClassCastException exception){
            System.out.println(" Eroare la cast dintre un caine si o pisica " +exception);
        }


        Animal animal = new Cat();
        Cat cat = (Cat) animal ;
        cat.makeSound();
        cat.sleep();
        cat.Scratch();

        System.out.println(cat instanceof Cat);
        System.out.println(animal instanceof Cat);
        System.out.println(myAnimal instanceof Dog);
    }

}