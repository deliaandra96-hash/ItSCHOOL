package session14;

import java.util.*;

public class ShoppingCart {


    private List<List<String>> shoppingHistory = new ArrayList<>();


    public void addShoppingCart(List<String> cart) {
        shoppingHistory.add(cart);
    }


    public List<String> getTopKFrequentItems(int k) {


        Map<String, Integer> frequencyMap = new HashMap<>();

        for (List<String> cart : shoppingHistory) {
            for (String product : cart) {
                frequencyMap.put(product,
                        frequencyMap.getOrDefault(product, 0) + 1);
            }
        }


        List<Map.Entry<String, Integer>> sorted =
                new ArrayList<>(frequencyMap.entrySet());

        sorted.sort((a, b) -> b.getValue() - a.getValue());

        List<String> result = new ArrayList<>();
        int thresholdFrequency = -1;

        for (Map.Entry<String, Integer> entry : sorted) {
            if (result.size() < k) {
                result.add(entry.getKey());
                thresholdFrequency = entry.getValue();
            } else if (entry.getValue() == thresholdFrequency) {
                result.add(entry.getKey()); // include ties
            } else {
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addShoppingCart(Arrays.asList("A", "B", "C"));
        cart.addShoppingCart(Arrays.asList("A", "B"));
        cart.addShoppingCart(Arrays.asList("A", "D"));

        System.out.println(cart.getTopKFrequentItems(2));
    }
}
