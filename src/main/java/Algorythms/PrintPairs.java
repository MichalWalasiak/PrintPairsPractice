package Algorythms;

public class PrintPairs {

    public static void main(String[] args) {

        int sum = 13;
        System.out.println("please insert numbers separated with comma");

        Service service = new Service();
        String[] input = service.getNumbers();
        Integer[] numbers = service.parse(input);
        service.printPairs(numbers, sum);
    }
}
