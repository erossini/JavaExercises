package parallelExamples;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    static void main() {
        System.out.println("Count prime number");
        System.out.println("------------------\n");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a positive integer: ");
            String input = scanner.nextLine().trim();

            // Validate  input
            if (!input.matches("\\d+")) {
                System.out.println("Invalid input. Please enter a positive integer only.");
                return;
            }

            // Convert to BigInteger
            BigInteger number = new BigInteger(input);
            System.out.println("Enter certainly level (e.g. 10, 20, 50): ");
            if(!scanner.hasNextInt()) {
                System.out.println("Invalid certainty value. Must be an integer.");
                return;
            }
            int certainty = scanner.nextInt();

            System.out.println("\n\nCalculate prime numbers without parallel");

            long cnt = pi(new Long(String.valueOf(number)), certainty);

            // Start Timer
            long startTimer = System.nanoTime();

            // check probable primality
            System.out.printf("Total prime numbers: %s\n", cnt);

            // End timer
            long endTimer = System.nanoTime();
            long duration = endTimer - startTimer;
            System.out.println("Execution time: " + duration + " nanoseconds");

            System.out.println("\nCalculate prime numbers with parallel");

            // Start Timer
            startTimer = System.nanoTime();

            // check probable primality
            System.out.printf("Total prime numbers: %s\n", cnt);

            // End timer
            endTimer = System.nanoTime();
            duration = endTimer - startTimer;
            System.out.println("Execution time: " + duration + " nanoseconds");
        } catch  (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a positive integer only.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }

    static long pi(Long n, int certainty) {
        return LongStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(certainty))
                .count();
    }

    static long pi2(Long n, int certainty) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(certainty))
                .count();
    }
}
