package Algorythms;

import java.util.HashMap;
import java.util.Map;

public class PrintPairs {

    public static Map<Integer, Integer> findPairs (Integer[] input, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (final Integer anInt : input) {
            if (anInt <= sum && anInt >= 0) {
                if (map.containsKey(anInt)) {
                    map.replace(anInt, map.get(anInt) + 1);
                } else {
                    map.put(anInt, 1);
                }
            }
        }

        for (Integer i = 0, j = sum; i < j; i++) {
            Integer leftCount = map.getOrDefault(i,0);
            Integer rightCount = map.getOrDefault(j, 0);
            int CountSum = leftCount * rightCount;

            if (i + j == sum){
                for (int k = 0 ; k < CountSum; k++){
                    System.out.println(i + " " + j);
                }
                j--;
            }
        }
        return map;
    }

    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        ParseService parseService = new ParseService();

        int sum = 100;
        String[] input = numberService.getNumbers();
        Integer[] numbers = parseService.parse(input);

        findPairs(numbers, sum);
   }
}
