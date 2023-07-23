package hu.ak_akademia.oop.fizzbuzz_high;


import java.util.Scanner;

public class NumberRequest {
    public int numberRequestMethod() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Add meg a felső határt ( %d ≤ N ≤ %d )\n", Constants.getMinValue(), Constants.getMaxValue());
            int userNumber;
            do {
                System.out.print("N = ");
                userNumber = scanner.nextInt();

            } while (userNumber < Constants.getMinValue() || Constants.getMaxValue() < userNumber);
            return userNumber;
        }
    }
}