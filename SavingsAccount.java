/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monaelkhalat
 */
public class SavingsAccount extends BankAccount implements Transactions {
    
    public SavingsAccount(){
        balance = 0;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InterruptedException{
        balance -= amount;
    }
    
    public double getBalance(){
        return balance;
    }
    
    private double balance; 
}
