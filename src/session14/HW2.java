package session14;

import java.util.*;
import java.util.TreeSet;


public class HW2 {

    static void main(String[] args) {


        // Ex 1 -----
        HashSet<String> set = new HashSet<>();
        set.add("Delia");
        set.add("Eugen");


        set.add("Flavius");
        System.out.println("HashSet after adding " + set);


        // Ex 2 -------

        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("orange");


        for (String fruit : set1) {
            System.out.println(fruit);
        }


        // Ex 3 -----------
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println(set2.size());


        // Ex 4 ------------
        HashSet<String> set3 = new HashSet<>();
        set3.add("a");
        set3.remove("a");
        System.out.println("HashSet contains" + set3);


        //Ex 5 --------
        HashSet<String> set4 = new HashSet<>();
        set4.add("A");
        set4.isEmpty();
        System.out.println(set4);


        // Ex 6 ----------

        HashSet<String> original = new HashSet<>();
        original.add("B");
        original.add("C");

        HashSet<String> copy = new HashSet<>(original);
        System.out.println("Original " + original);
        System.out.println("Copy " + copy);


        // Ex 7 ----------


        HashSet<String> set5 = new HashSet<>();
        set5.add("Delia");
        set5.add("Andra");
        set5.add("Zidaru");

        System.out.println(set5);

        String[] array = set.toArray(new String[0]);
        System.out.println(Arrays.toString(array));


        // Ex 8 ---------

        HashSet<String> set6 = new HashSet<>();
        set6.add("pen");
        set6.add("pencil");
        set6.add("eraser");

        System.out.println("HashSet");
        System.out.println(set6);


        Set<String> tree = new TreeSet<>(set6);

        System.out.println("TreeSet ");
        System.out.println(tree);


        // Ex 9 ----------

        HashSet<String> setA = new HashSet<>();
        setA.add("BANANA");

        HashSet<String> setB = new HashSet<>();
        setB.add("Blueberries");

        boolean same = setA.equals(setB);
        System.out.println(same);


        // Ex 10 ----------

        HashSet<String> seta = new HashSet<>();
        seta.add("Bannana");
        seta.add("Blueberries");
        seta.add("Stroberry");

        HashSet<String> setb = new HashSet<>();
        setb.add("Blueberries");
        setb.add("Kiwi");
        setb.add("Stroberry");

        seta.retainAll(setb);

        System.out.println("common elements " + seta);


        // TreeSet
        // Ex 1 ---------

        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Green");

        System.out.println(colors);


        // Ex 2 -------

        TreeSet<String> elements = new TreeSet<>();
        elements.add("a");
        elements.add("b");
        elements.add("c");

        System.out.println(elements);

        String keyFound = null;
        for (String e : elements) {
            System.out.println(e);


            // Ex 3 -------

            TreeSet<String> elementsA = new TreeSet<>();
            elementsA.add("Delia");
            elementsA.add("Andra");
            elementsA.add("Aurora");

            TreeSet<String> elementsB = new TreeSet<>();

            TreeSet<String> elementA = new TreeSet<>(elementsB);

            System.out.println(copy);


            // Ex 4 --------

            TreeSet<String> set7 = new TreeSet<>();
            set7.add("Liana");
            set7.add("Daniel");
            set7.add("Delia");


            System.out.println("Print original TreeSet" + set7);

            Set<String> descending = set7.descendingSet();

            System.out.println("TreeSet in reverse order " + descending);

            // Ex 5 --------

            TreeSet<String> set8 = new TreeSet<>();
            set8.add("Eugen");
            set8.add("Aurora");
            set8.add("Tabita");
            set8.add("Iosif");


            System.out.println(set8.getFirst());
            System.out.println(set8.getLast());


            // TreeMap ------
            //Ex 1 ------


            TreeMap<String, Integer> map = new TreeMap<>();
            map.put(" Apple ", 1);
            map.put("Banana", 2);
            map.put("Cherry", 3);


            System.out.println("TreeMap " + map);

            String keyToCheck = "Banana";
            System.out.println("Value associated with key " + keyToCheck + " " + map.get(keyToCheck));


            // Ex 2 ---------

            TreeMap<String, Integer> map1 = new TreeMap<>();

            map1.put("Delia", 29);
            map1.put("Andra ", 30);

            System.out.println(map1);

            map1.clone();
            System.out.println("Copy a tree map " + map1.clone());


            // Ex 3 -----------

            TreeMap<String, Integer> map3 = new TreeMap<>();
            map3.put("Banana ", 2);
            map3.put("Orange", 4);

            String KeyToFind = "Banana ";
            int valueFound = 2;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(KeyToFind)) {
                    valueFound = Integer.parseInt(entry.getKey());
                    break;
                }
            }

            System.out.println("Key associated with value " + KeyToFind + "is " + valueFound);


            // Ex 4 ---------
            TreeMap<String, Integer> map2 = new TreeMap<>();
            map2.put("Athos ", 2);
            map2.put("Blako ", 1);


            int valueFound1 = 1;
            keyFound = null;

            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                if (entry.getValue().equals(valueFound1)) ;
                keyFound = entry.getKey();
                break;

            }
        }

        if (keyFound != null) {
            String valueToFind = "";
            System.out.println("Key associated with value " + valueToFind + " is " + keyFound);
        } else {
            System.out.println("Value not found in the TreeMap");
        }


        // Ex 5 ------

        TreeMap<String, Integer> map4 = new TreeMap<>() ;
        map4.put("Apple" , 1) ;
        map4.put("Grapes" , 3 ) ;

        Set<String> keys = map4.keySet();

        System.out.println(map4.get("All keys in the TreeMap " +keys));

    }

}