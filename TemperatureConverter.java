import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Display menu to the user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        
        // Get the user's choice
        int choice = scanner.nextInt();

        // Validate the choice
        while (choice != 1 && choice != 2) {
            System.out.print("Invalid option. Please choose 1 or 2: ");
            choice = scanner.nextInt();
        }

        // Prompt the user for the temperature value
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Perform the conversion based on user's choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is %.2f Fahrenheit.\n", temperature, fahrenheit);
        } else if (choice == 2) {
            // Convert Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is %.2f Celsius.\n", temperature, celsius);
        }

        // Close the scanner
        scanner.close();
    }
}

