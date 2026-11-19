package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Choose your pick up date: ");
        String date=scanner.nextLine();

        System.out.println("How many days would you like to rent your car?");
        int days=scanner.nextInt();

        System.out.println("Would you like an electronic toll tag starting from $3.95?");
        String toll=scanner.nextLine();
        scanner.nextLine();

        System.out.println("Would you like a roadside assistance at $3.95/day");
        String assistant=scanner.nextLine();

        System.out.println("How old are you?");
        int age=scanner.nextInt();
        scanner.nextLine();


        double rentalCar = 29.99;
        double dailyTotal = rentalCar;

        if (age < 25) {
            dailyTotal += rentalCar * 0.30;
        }

        if (toll.equalsIgnoreCase("yes")) {
            dailyTotal += 3.95;
        }

        if (assistant.equalsIgnoreCase("yes")) {
            dailyTotal += 3.95;
        }

        double total = dailyTotal * days;

        System.out.println("Pickup date: " + date);
        System.out.printf("Your total is $%.2f%n", total);
    }


}
