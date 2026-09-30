import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = new double[10];

        try {
            System.out.println("Enter 10 real numbers (positive or negative):");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                Scanner scanner = new Scanner(reader.readLine());
                if (scanner.hasNextDouble()) {
                    numbers[i] = scanner.nextDouble();
                } else {
                    System.out.println("Invalid input. Defaulting to 0.0.");
                    numbers[i] = 0.0;
                }
                scanner.close();
            }

            double positiveSum = 0;
            int positiveCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    positiveSum += numbers[i];
                    positiveCount++;
                }
            }
            double positiveAverage = (positiveCount > 0) ? (positiveSum / positiveCount) : 0.0;

            int negativeCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    negativeCount++;
                }
            }

            double minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }

            System.out.println("\n--- Results ---");
            System.out.println("Sum of positive numbers: " + positiveSum);
            System.out.println("Average of positive numbers: " + positiveAverage);
            System.out.println("Total count of negative numbers: " + negativeCount);
            System.out.println("Minimum value in the array: " + minValue);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
