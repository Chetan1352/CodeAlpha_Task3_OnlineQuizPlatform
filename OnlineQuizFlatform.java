/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task3;

import java.util.*;

/**
 *
 * @author Asus
 */
public class OnlineQuizFlatform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;  // Initial balance

        while (true) {
            System.out.println("Welcome to Simple Banking App");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited $" + depositAmount + " successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Withdrawn $" + withdrawalAmount + " successfully.");
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Simple Banking App. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option (1/2/3/4).");
            }
        }
    }
}


