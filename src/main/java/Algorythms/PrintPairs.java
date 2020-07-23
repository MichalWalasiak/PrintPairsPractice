package Algorythms;

import java.util.Arrays;

public class PrintPairs {

    public static void printPairs(Integer[] numbers, int k) {
        if (numbers.length < 2) {
            return;
        }
        Arrays.sort(numbers);

        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == k) {
                System.out.printf("%d %d %n", numbers[i],
                        numbers[j]);
                i += 1;
                j -= 1;

            } else if (sum < k) {
                i += 1;

            } else {
                j -= 1;
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
