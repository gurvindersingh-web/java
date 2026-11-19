package basic.syntax;

import java.util.Scanner;

public final class CompoundInterestCalculator {

    private CompoundInterestCalculator() {
    }

    public static double calculate(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("principal, rate, and years must not be negative");
        }

        double amount = principal;
        for (int year = 0; year < years; year++) {
            amount *= 1 + rate / 100;
        }
        return amount - principal;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double principal = scanner.nextDouble();
            double rate = scanner.nextDouble();
            int years = scanner.nextInt();
            System.out.println(calculate(principal, rate, years));
        }
    }
}
