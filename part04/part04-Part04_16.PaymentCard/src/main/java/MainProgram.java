
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
//Paul eats heartily
        paulCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
//Matt eats affordably
        mattsCard.eatAffordably();
        System.out.println("Matt: " + mattsCard);
////The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
//Paul tops up 20 euros
        paulCard.addMoney(20);
        System.out.println("Paul: " + paulCard);
//Matt eats heartily
        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);
//The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
//Paul eats affordably
        paulCard.eatAffordably();
//Paul eats affordably
        paulCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
//Matt tops up 50 euros
        mattsCard.addMoney(50);
        System.out.println("Matt: " + mattsCard);
//The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
//
//Paul: The card has a balance of 15.4 euros
//Matt: The card has a balance of 27.4 euros
//Paul: The card has a balance of 35.4 euros
//Matt: The card has a balance of 22.799999999999997 euros
//Paul: The card has a balance of 30.199999999999996 euros
//Matt: The card has a balance of 72.8 euros
    }
}
