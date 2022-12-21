/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class PaymentCard {
    
    private double balance;
    private static final double maxBalance = 150.0;
    private static final double minBalance = 0;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        if (this.balance - 2.6 >= minBalance) {
            this.balance -= 2.60;            
        }
    }
    
    public void eatHeartily() {
        if (this.balance - 4.6 >= minBalance) {
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        if (this.balance + amount > maxBalance) {
            this.balance = maxBalance;
        } else {
            this.balance += amount;
        }
    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

     
}
