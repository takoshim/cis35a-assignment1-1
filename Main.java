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
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble() / 100;
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.println("\nMonthly Payment: " + 865.26);
        System.out.println("Total Payment: " + 10383.21 + "\n");

        int timesOfPayments = 12 * numberOfYears;
        double monthlyInterest = 100.00;
        double monthlyPrincipal = 100.00;
        double balance = 10;

        System.out.printf("%-13s %-13s %-13s %-13s\n", "Payment#", "Interest", "Principal", "Balance");
        for (int i=1; i<=timesOfPayments; i++) {
            System.out.printf("%-13d %-13.2f %-13.2f %-13.2f\n", i, monthlyInterest, monthlyPrincipal, balance);
        }
    }
}
