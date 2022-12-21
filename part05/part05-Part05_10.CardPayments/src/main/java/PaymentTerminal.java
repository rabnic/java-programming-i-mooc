
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 2.50;
        if (payment >= cost) {
            double change = payment - cost;
            this.money += cost;
            // increment affordably meals sold and return the change
            this.affordableMeals++;
            return change;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        double cost = 2.50;
        boolean paymentSuccessful = card.takeMoney(cost);
        // if payment successful increment meals count
        if(paymentSuccessful){
            this.affordableMeals++;
        }
        return paymentSuccessful;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double cost = 4.30;
        if (payment >= cost) {
            double change = payment - cost;
            this.money += cost;
            // increment heartily meals sold and return the change
            this.heartyMeals++;
            return change;
        }
        return payment;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        double cost = 4.30;
        boolean paymentSuccessful = card.takeMoney(cost);
        // if payment successful increment meals count
        if(paymentSuccessful){
            this.heartyMeals++;
        }
        return paymentSuccessful;
    }
    
    public void addMoneyToCard(PaymentCard card, double amount) {
        if (amount >= 0) {
            this.money += amount;
            card.addMoney(amount);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
