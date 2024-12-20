package org.example;

import java.util.Scanner;

public class ATM_Simulation {

    private static double balance = 1000.00;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do {

            System.out.println("\nATM Menu:");

            System.out.println("1. Check Balance");

            System.out.println("2. Deposit");

            System.out.println("3. Withdraw");

            System.out.println("4. Exit");

            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:

                    checkBalance();

                    break;

                case 2:

                    deposit(scanner);

                    break;

                case 3:

                    withdraw(scanner);

                    break;

                case 4:

                    System.out.println("Thank you for using the ATM!");

                    break;

                default:

                    System.out.println("Invalid option! Please try again.");
            }

        } while (option != 4);

        scanner.close();
    }

    public static void checkBalance() {

        System.out.println("Your balance is: $" + balance);
    }

    public static void deposit(Scanner scanner) {

        System.out.print("Enter amount to deposit: ");

        double amount = scanner.nextDouble();

        if (amount > 0) {

            balance += amount;

            System.out.println("Deposited: $" + amount);

        } else {

            System.out.println("Invalid amount!");
        }
    }

    public static void withdraw(Scanner scanner) {

        System.out.print("Enter amount to withdraw: ");

        double amount = scanner.nextDouble();

        if (amount <= balance && amount > 0) {

            balance -= amount;

            System.out.println("Withdrew: $" + amount);
        } else {

            System.out.println("Invalid amount or insufficient balance!");
        }
    }
}
