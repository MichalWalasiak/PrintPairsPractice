package Algorythms;

import java.util.Arrays;

public class PrintPairs {

    public static void printPairs(Integer[] numbers, int requiredSum) {
        if (numbers.length < 2) {
            return;
        }
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            int k = numbers.length - 1;
            for(int j = i; j < numbers.length - 1; j++) {
                int sum = numbers[i] + numbers[k];
                if (sum == requiredSum) {
                    System.out.printf("%d %d %n", numbers[i],
                            numbers[k]);
                }
                k -= 1;
            }
        }
    }

    public static void main(String[] args) {

        int sum = 13;
        System.out.println("please insert numbers separated with comma");

        Service service = new Service();
        String[] input = service.getNumbers();
        Integer[] numbers = service.parse(input);
        printPairs(numbers, sum);
    }
}
