/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Debt {
    
    private double balance;
    private double rate;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.rate = initialInterestRate;
    }
    
    public void waitOneYear() {
        this.balance *= this.rate;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }
    
}
