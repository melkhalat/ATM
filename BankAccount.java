/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monaelkhalat
 */
import java.util.*;

public class BankAccount {

    public BankAccount() {
        accountNumber = 0;
        pin = 0;
    }

    public BankAccount(long anAccountNumber, int aPin) {
        accountNumber = (int) anAccountNumber;
        pin = aPin;
    }

    public void accountLogin() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your 10-digit account number (excluding spaces): ");
        accountNumber = (int) in.nextLong();

        System.out.println("Please enter your 4-digit pin (excluding spaces): ");
        pin = in.nextInt();
    }

    public void display() throws InterruptedException {
        Scanner in = new Scanner(System.in);

        System.out.println("Please select an option from the menu below: ");
        System.out.println("[1] Checking Account");
        System.out.println("[2] Savings Account");
        System.out.println("[3] Exit");
        int input = in.nextInt();

        boolean done = false;
        while (!done) {
            switch (input) {
                case 1:
                    CheckingAccount c = new CheckingAccount();

                    System.out.println("Current Balance: " + c.getBalance());
                    System.out.println("What would you like to do?");
                    System.out.println("[1] Withdraw");
                    System.out.println("[2] Deposit");
                    System.out.println("[3] Exit");
                    input = in.nextInt();

                    if (input == 1) {
                        System.out.println("Please enter the amount you would like to withdraw: ");
                        double amount = in.nextInt();
                        c.withdraw(amount);
                        System.out.println("Would you like to perform another transaction? If so, choose an account. Otherwise, select exit.");
                        System.out.println("[1] Checking Account");
                        System.out.println("[2] Savings Account");
                        System.out.println("[3] Exit");
                        input = in.nextInt();
                    } else if (input == 2) {
                        System.out.println("Please enter the amount you would like to deposit: ");
                        double amount = in.nextInt();
                        c.deposit(amount);
                        System.out.println("Would you like to perform another transaction? If so, choose an account. Otherwise, select exit.");
                        System.out.println("[1] Checking Account");
                        System.out.println("[2] Savings Account");
                        System.out.println("[3] Exit");
                        input = in.nextInt();
                    } else if (input == 3) {
                        System.out.println("Thank you for using this ATM and have a nice day!");
                        done = true;
                    }

                    break;

                case 2:

                    SavingsAccount s = new SavingsAccount();

                    System.out.println("Current Balance: " + s.getBalance());
                    System.out.println("What would you like to do?");
                    System.out.println("[1] Withdraw");
                    System.out.println("[2] Deposit");
                    System.out.println("[3] Exit");
                    input = in.nextInt();

                    switch (input) {
                        case 1: {
                            System.out.println("Please enter the amount you would like to withdraw: ");
                            double amount = in.nextInt();
                            s.withdraw(amount);
                            System.out.println("Would you like to perform another transaction? If so, choose an account. Otherwise, select exit.");
                            System.out.println("[1] Checking Account");
                            System.out.println("[2] Savings Account");
                            System.out.println("[3] Exit");
                            input = in.nextInt();
                            break;
                        }
                        case 2: {
                            System.out.println("Please enter the amount you would like to deposit: ");
                            double amount = in.nextInt();
                            s.deposit(amount);
                            System.out.println("Would you like to perform another transaction? If so, choose an account. Otherwise, select exit.");
                            System.out.println("[1] Checking Account");
                            System.out.println("[2] Savings Account");
                            System.out.println("[3] Exit");
                            input = in.nextInt();
                            break;
                        }
                        case 3:
                            System.out.println("Thank you for using this ATM and have a nice day!");
                            done = true;
                            break;
                        default:
                            break;
                    }

                    break;

                case 3:

                    if (input == 3) {
                        System.out.println("Thank you for using this ATM and have a nice day!");

                    }
                    break;
            }

        }
    }

    private int accountNumber;
    private int pin;

}
