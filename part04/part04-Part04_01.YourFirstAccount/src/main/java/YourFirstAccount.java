
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account nichoAcc = new Account("Nicholas Savings Acc", 100.0);
        
        // Deposit 20.0
        nichoAcc.deposit(20.0);
        
        // Print the balance
        System.out.println(nichoAcc);
    }
}
