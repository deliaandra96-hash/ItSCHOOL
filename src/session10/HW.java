package session10;

public class HW {
    static void main(String[] args) {
        Animal a1 = new Animal("Dog", "Ham");
        System.out.println(a1.sound);
        a1.makeSound();
        Amimal1 genericAnimal = new Amimal1();
        genericAnimal.sound();
        Dog dog = new Dog();
        dog.sound();
        Animal2 Animal = new Animal2();
        genericAnimal.sound();
        Cat cat = new Cat();
        cat.sound();
        Anima3 anima3 = new Anima3();
        genericAnimal.sound();
        Wolf wolf = new Wolf();
        wolf.sound();
        dog.sound();
        cat.sound();
        wolf.sound();


    }

    public static class Animal {

        String animal;
        String sound;

        public Animal(String animal, String sound) {
            this.animal = animal;
            this.sound = sound;
        }

        public void makeSound() {
            System.out.println("Animal make sound " +sound);
        }
    }

    // eX 2 ------

    static class Amimal1 {
        public void sound(){
            System.out.println("animal make sound ");
        }
    }

    static class Dog extends Amimal1{
        @Override
        public void sound() {
            super.sound();
            System.out.println("bark");
        }
    }


    //Ex 3 -------

    static class Animal2 {
        public void sound(){
            System.out.println("Animal make sound ");


        }
    }
    static class Cat extends Animal2{
        @Override
        public void sound(){
            super.sound();
            System.out.println("meow");
        }
    }


    // Ex4 -----
     public static class Anima3{
        public void sound(){
            System.out.println("Animal make sound ");

        }
    }
     static class Wolf extends Anima3{
        @Override
         public void sound(){
            super.sound();
            System.out.println("how");
        }
     }


    //ex 5 ------

    class TestAnimal {
        static void main(String[] args) {
            Dog dog = new Dog();
            dog.sound();
            Cat cat = new Cat();
            cat.sound();
            Wolf wolf = new Wolf();
            wolf.sound();

        }
    }

}





