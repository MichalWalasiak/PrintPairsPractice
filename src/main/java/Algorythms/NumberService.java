package Algorythms;

import java.util.Scanner;

public class NumberService {
    Scanner scanner = new Scanner(System.in);

    public String[] getNumbers() {
        return scanner.nextLine().split(" ");
    }
}
