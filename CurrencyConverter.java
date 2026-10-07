package currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       CURRENCY CONVERTER");
        System.out.println("=================================");

        System.out.println("1. USD to PKR");
        System.out.println("2. PKR to USD");
        System.out.println("3. EUR to PKR");
        System.out.println("4. PKR to EUR");

        System.out.print("Choose an option (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        double result;

        // Example exchange rates
        double usdToPkr = 280.0;
        double eurToPkr = 325.0;

        switch (choice) {

            case 1:
                result = amount * usdToPkr;
                System.out.println(amount + " USD = " + result + " PKR");
                break;

            case 2:
                result = amount / usdToPkr;
                System.out.println(amount + " PKR = " + result + " USD");
                break;

            case 3:
                result = amount * eurToPkr;
                System.out.println(amount + " EUR = " + result + " PKR");
                break;

            case 4:
                result = amount / eurToPkr;
                System.out.println(amount + " PKR = " + result + " EUR");
                break;

            default:
                System.out.println("Invalid choice!");

        }

        input.close();
    }
}