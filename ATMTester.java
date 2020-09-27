/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monaelkhalat
 */
public class ATMTester {

    public static void main(String[] args) throws InterruptedException {

        BankAccount customerAccount = new BankAccount();

        customerAccount.accountLogin();

        customerAccount.display();

        System.out.println(customerAccount);

    }

}
