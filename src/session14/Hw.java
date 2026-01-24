package session14;



import javax.swing.*;
import java.util.*;


public class Hw {
    static void main(String[] args) {


        // ArrayList Ex 1-------


        String[] colors = {"Red", "Blue", "Yellow"};
        System.out.println(Arrays.toString(colors));

        // Ex 2 ------
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String element : list) {
            System.out.println(element);


            // Ex 3 -------


            String[] name = {"Delia ", "Iosif", "Adelin "};
            System.out.println(name[1]);


            // Ex 4 -------

            ArrayList<Integer> x = new ArrayList<>();
            x.add(10);
            x.add(20);
            x.add(30);
            System.out.println("x este : " + x.get(2));


            // Ex 5 -----------

            ArrayList<String> list1 = new ArrayList<>();
            list1.add("A");
            list1.set(0, "B");
            System.out.println(list1.set(0, "B"));


            // Ex 6 ---------

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("a");
            list2.add("b");
            list2.add("c");
            list2.add("d");

            list2.remove(2);

            System.out.println(list2);


            // Ex 7 ------

            ArrayList<String> listA = new ArrayList<>();
            listA.add("red");
            boolean found = listA.contains("blue");
            System.out.println(found);


            // Ex 8 ------

            String[] listb = {"C", "B", "D", "A"};
            Arrays.sort(listb);

            System.out.println(Arrays.toString(listb));


            // Ex 9--------


            ArrayList<String> listc = new ArrayList<>();
            listc.add("Red");
            listc.add("Blue");
            listc.add("orange");

            ArrayList<String> listd = new ArrayList<>(listc);
            System.out.println(listd);


        }

        //Ex10 ------------

        ArrayList<String> lista = new ArrayList<>();
        lista.add("red");
        list.add("black");
        lista.add("orange");
        Collections.shuffle(lista);
        System.out.println(lista);


        //Ex 11 -----------

        ArrayList<String> element = new ArrayList<>();
        element.add("a");
        element.add("b");
        Collections.reverse(element);
        System.out.println(element);

        // Ex 12 ---------

        ArrayList<String> element1 = new ArrayList<>();
        element1.add("Red");
        element1.add("Yellow");
        element1.add("Green");

        ArrayList<String> sublist = new ArrayList<>(element1.subList(0, 1));

        System.out.println("Sublist " + sublist);

        //Ex 13 -------

        ArrayList<String> elementA = new ArrayList<>();
        elementA.add("Red");
        elementA.add("Yellow");

        ArrayList<String> elementB = new ArrayList<>();
        elementB.add("Red");
        elementB.add("Green");

        if (elementA.equals(elementB)) {
            System.out.println("Elementele sunt egale ");
        } else {
            System.out.println("Elementele nu sunt egale ");
        }


        // Ex 14 -------

        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Thuesday");

        days.set(0, "Sunday");

        System.out.println(days);


        // Ex 15 --------

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Monday");
        listA.add("Thuesday");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Wensday");
        listB.add("Thursday");

        listA.addAll(listB);
        System.out.println(listA);


        // Ex 16 ------

        ArrayList<String> clone = new ArrayList<>();
        clone.add("A");
        clone.add("B");

        clone.clone();

        System.out.println(clone);


        //Ex 17 -------

        ArrayList<String> listC = new ArrayList<>();
        listC.add("a");
        listC.add("c");

        listC.removeAll(listC);
        System.out.println(listC);


        // ex 18 --------
        ArrayList<String> listb = new ArrayList<>();
        listb.add("2");
        listb.add("3");

        listb.isEmpty();
        System.out.println(listb.isEmpty());


        // Ex 19 -------


        ArrayList<String> listD = new ArrayList<>();
        listD.add("APPLE");
        listD.add("Cherry");

        System.out.println("Before trim ");
        System.out.println("size " + listD.size());


        // Ex 20 ---------

        ArrayList<String> listE = new ArrayList<>();
        listE.add("e");
        listE.add("i");
        listE.add("j");
        listE.ensureCapacity(2);
        System.out.println(listE);


        // LinkedList
        // Ex 1 -------


        List<String> list1 = new LinkedList<>();
        list1.add("Delia");
        list1.add("Iosif");
        list1.getLast();


        System.out.println(" " + list1.getLast());

        // Ex2 --------

        List<Integer> list3 = new LinkedList<>();
        list3.add(5);
        list3.add(6);
        list3.add(7);
        for (int index = 0; index < list3.size(); index++) {
            System.out.println(list3.get(index));
        }


        //Ex 3 --------

        List<Integer> list4 = new LinkedList<>();
        list4.add(6);
        list4.add(8);
        list4.add(10);

        int startPosition = 1;

        for (int index = startPosition; index < list4.size(); index++)

            System.out.println(list4.get(index));


        //Ex 4 ---------
        List<String> list5 = new LinkedList<>();

        list5.add("Delia");
        list5.add("Adelin");
        list5.add("Flavius");

        for (int index = list5.size() - 1; index >= 0; index--) {
            System.out.println(list5.get(index));
        }


        // Ex 5 ------


        list5.add(1, "Iosif");

        System.out.println(list5.get(1));


        // Ex 6 ---------

        list5.add(0, "Andra");
        System.out.println(list5.set(0, "Andra"));
        list5.add(2, "Eugen");
        System.out.println(list5.set(2, "Eugen"));


        // Ex 11 -------

        for (int index = 0; index < list5.size(); index++) {
            String elementt = list5.get(index);
            System.out.println("Element " + elementt + "Position" + index);
        }

    }



}