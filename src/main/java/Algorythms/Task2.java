package Algorythms;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    private int pairsCounter = 0;

    public void findPairs (Integer[] input, int sum, Map<Integer, Integer> pairs) {

        for (final Integer mapKey : input) {
            if (mapKey <= sum && mapKey >= 0) {
                if (pairs.containsKey(mapKey)) {
                    pairs.replace(mapKey, pairs.get(mapKey) + 1);
                } else {
                    pairs.put(mapKey, 1);
                }
            }
        }

        for (Integer mapKey = 0, j = sum; mapKey <= j; mapKey++) {
            Integer leftCount = pairs.getOrDefault(mapKey, 0);
            Integer rightCount = pairs.getOrDefault(j, 0);
            int CountSum = leftCount * rightCount;

            if (mapKey + j == sum && mapKey.equals(j)) {
                for (int l = 0; l < leftCount - 1; l++) {
                    System.out.println(mapKey + " " + j);
                    pairsCounter++;
                }
            } else {
                for (int k = 0; k < CountSum; k++) {
                    System.out.println(mapKey + " " + j);
                    pairsCounter++;
                }
            }
            j--;
        }
        if (pairsCounter == 0){
            throw new IllegalArgumentException("no pairs in set that equals to given sum");
        }
    }

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        ParseService parseService = new ParseService();
        Task2 task2 = new Task2();

        int sum = 13;

        String[] input = numberService.getNumbers();
        Integer[] numbers = parseService.parse(input);
        Map<Integer, Integer> pairs = new HashMap<>();

        task2.findPairs(numbers, sum, pairs);
    }
}
