import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (as of an example, update as needed)
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        double gbpToInr = 103.0;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Choose an option to convert:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.print("\nEnter your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Thank you for using the Currency Converter!");
                break;
            }

            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();
            double convertedAmount = 0;

            switch (choice) {
                case 1:
                    convertedAmount = amount * usdToInr;
                    System.out.printf("%.2f USD = %.2f INR\n", amount, convertedAmount);
                    break;
                case 2:
                    convertedAmount = amount * eurToInr;
                    System.out.printf("%.2f EUR = %.2f INR\n", amount, convertedAmount);
                    break;
                case 3:
                    convertedAmount = amount * gbpToInr;
                    System.out.printf("%.2f GBP = %.2f INR\n", amount, convertedAmount);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}