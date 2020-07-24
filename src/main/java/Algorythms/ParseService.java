package Algorythms;

public class ParseService {

    public Integer[] parse(String[] input) {
        int i = 0;
        Integer[] numbers = new Integer[input.length];

        for (String str : input) {
            numbers[i++] = Integer.parseInt(str);
        }
        return numbers;
    }
}
