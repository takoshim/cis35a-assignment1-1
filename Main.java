/*********************************
 * Your Name: Takeo Shimazu
 * Class and Section: Sp22 CIS D036A 01Y, 64Z Java Programming
 * Assignment Number: 1 Part 1
 * Due Date: Apr 20, 2022
 * Date Submitted: Apr 13, 2022
 *******************************/
package com.takeo;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompts user to enter the amount of the loan
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        // Prompts user to enter number of years for the loan
        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();

        // Prompts user to enter annual interest rate
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble() / 100;

        // Calculates monthly interest rate & total times of payments
        double monthlyInterestRate = annualInterestRate / 12;
        int timesOfPayments = numberOfYears * 12;

        //Calculates monthly payment amount
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(monthlyInterestRate + 1, timesOfPayments)) / (Math.pow(monthlyInterestRate + 1, timesOfPayments) - 1);
               monthlyPayment = (loanAmount * i *                   Math.pow(i                   + 1, n              )) / (Math.pow(i                   + 1, n              ) - 1);

        // Outputs monthly payment & total payment
        System.out.printf("\nMonthly Payment: %.2f",monthlyPayment);
        System.out.printf("\nTotal Payment: %.2f\n\n", (monthlyPayment * timesOfPayments));

        // Sets the balance to the initial amount
        double balance = loanAmount;

        // Outputs the header line
        System.out.printf("%-13s %-13s %-13s %-13s\n", "Payment#", "Interest", "Principal", "Balance");

        // Loop for each payment
        for (int i=1; i<=timesOfPayments; i++) {
            System.out.printf("%-13d %-13.2f %-13.2f %-13.2f\n",
                    i,
                    balance * monthlyInterestRate,
                    monthlyPayment - (balance * monthlyInterestRate),
                    balance -= monthlyPayment);
        }
    }
}
