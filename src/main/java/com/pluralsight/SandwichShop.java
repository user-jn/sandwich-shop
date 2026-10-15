package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose a sandwich size
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Choose an option: ");

        // Store the user's sandwich choice
        int option = scanner.nextInt();

        // new ask, asking if they want the sandwich loaded
        System.out.print("Would you like your sandwich loaded? (yes/no): ");
        String loaded = scanner.next();

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Variable to store the sandwich price
        double price;

        // Check which option the user selected
        if (option == 1) {

            // Option 1 is a regular sandwich
            price = 5.45;

            // Add $1.00 if regular sandwich is loaded
            if (loaded.equals("yes")) {
                price = price + 1.00;
            }

        } else {

            // Option 2 is a large sandwich
            price = 8.95;

            // Add $1.75 if large sandwich is loaded
            if (loaded.equals("yes")) {
                price = price + 1.75;
            }

        }

        // Check if the customer gets a discount
        if (age <= 17) {

            // 10% student discount
            price = price - (price * 0.10);

        } else if (age >= 65) {

            // 20% senior discount
            price = price - (price * 0.20);
        }

        // Display the final price
        System.out.printf("Your sandwich costs $%.2f%n", price);

        scanner.close();
    }
}
