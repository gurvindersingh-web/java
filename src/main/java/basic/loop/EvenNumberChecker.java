package basic.loop;

import java.util.Scanner;

public final class EvenNumberChecker {

    private EvenNumberChecker() {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                System.out.println(isEven(scanner.nextInt()));
            }
        }
    }
}
