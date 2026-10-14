package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Create Scanner so we can read what the user types
        Scanner scanner = new Scanner(System.in);

        // Ask the user what size sandwich they want
        System.out.println("Sandwich Sizes:");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Enter sandwich size (1 or 2): ");

        // Store the user's sandwich choice
        int sandwichSize = scanner.nextInt();

        // Ask the user for their age
        System.out.print("Enter your age: ");

        // Store the user's age
        int age = scanner.nextInt();

        // Create a variable to hold the sandwich price
        double price = 0;

        // Check which sandwich size the user selected
        if (sandwichSize == 1) {

            // Regular sandwich costs $5.45
            price = 5.45;

        } else if (sandwichSize == 2) {

            // Large sandwich costs $8.95
            price = 8.95;
        }



    }

}
