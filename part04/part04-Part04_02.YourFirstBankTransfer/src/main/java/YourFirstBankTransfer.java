
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        // Create two accounts
        Account matthews = new Account("Matthews account", 1000.0);
        Account myacc = new Account("My account", 0.0);
        
        // withdraw 100 from matthews
        matthews.withdrawal(100.0);
        // deposit 100 to my account
        myacc.deposit(100.0);
        // Print both accs
        System.out.println(matthews);
        System.out.println(myacc);
    }
}
