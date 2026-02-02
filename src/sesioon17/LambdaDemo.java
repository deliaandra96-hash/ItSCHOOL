package sesioon17;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface IntSum {
    int sum(int a, int b);

}

@FunctionalInterface
interface IntMultiply {
    int multiply(int a, int b);
}


public class LambdaDemo {
    static void main(String[] args) {
        IntSum resultSum = (a, b) -> a + b;
        System.out.println(resultSum.sum(1, 2));


        IntMultiply resultMultiply = (a, b) -> a * b;
        System.out.println(resultMultiply.multiply(2, 3));
    }

}


@FunctionalInterface
interface Calculator {
    int computer(int a, int b);
}


class CalculateDemo {
    static void main(String[] args) {
        Calculator sum = (int a, int b) -> a + b;
        Calculator multy = (int a, int b) -> a * b;
        Calculator div = (int a, int b) -> a / b;

        System.out.println("sum " + sum.computer(2, 3));
        System.out.println("multy" + multy.computer(2, 3));
        System.out.println("div" + div.computer(6, 3));
    }

}
@FunctionalInterface
interface  GreetingService{
    void greet(String msg);

}


class GreetingServicePractice{
    static void main(String[] args) {

        GreetingService anonymGreeting = new GreetingService() {
            @Override
            public void greet(String msg) {
                System.out.println("Hello from  " +msg);
            }
        };

        GreetingService lambdaGreeting = msg -> System.out.println("Heloo from " +msg);

        anonymGreeting.greet("anonym class");
        lambdaGreeting.greet("Lambda expression");

    }
}



class LambdaStandardExample{
    static void main(String[] args) {

        Runnable noParam = () -> System.out.println("Hello from runnable");
        noParam.run();

        Consumer<String> oneParam = msg -> System.out.println("hello from : " +msg);
        oneParam.accept("From consumer");


        List<String> names = new ArrayList<>(List.of("Marcel"));

        Predicate<List> predicate =  a -> a.isEmpty();
        
        System.out.println(predicate.test(names));


    }
}





