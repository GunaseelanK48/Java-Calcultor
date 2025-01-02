import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice(1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid input.");
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Result: " + result);
            }
        }

        System.out.println("Thank you for using the Calculator!");
        scanner.close();
    }
}
