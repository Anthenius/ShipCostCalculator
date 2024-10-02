import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;

        // Input the price of the item
        System.out.print("Enter the price of the item: ");

        // Validate input
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the buffer

            // Calculate shipping cost
            if (itemPrice >= 100) {
                shippingCost = 0; // Free shipping
            } else {
                shippingCost = itemPrice * 0.02; // 2% of the price
            }

            // Calculate total price
            double totalPrice = itemPrice + shippingCost;

            // Output the shipping cost and total price
            System.out.printf("Shipping cost: $%.2f\n", shippingCost);
            System.out.printf("Total price: $%.2f\n", totalPrice);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
            in.nextLine(); // Clear the invalid input
        }

        in.close(); // Close the scanner
    }
}
