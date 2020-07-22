package Algorythms;

import java.util.Arrays;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public void printPairs(Integer[] numbers, int k) {
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

    public Integer[] parse(String[] input){
        int i = 0;
        Integer[] numbers = new Integer[input.length];
        try {
            for (String str : input) {
                numbers[i++] = Integer.parseInt(str);
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException("wrong format or empty input");
        }
        return numbers;
    }

    public String[] getNumbers() {
        String[] input = scanner.nextLine().split(",");
        return input;
    }
}
