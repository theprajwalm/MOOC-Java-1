public class PaymentCard{
    private double balance;

    //constructor
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably(){
        if (balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily(){
        if (balance >= 4.60){
        this.balance -= 4.60;
        }
    }

    public void addMoney(double amount){
        if(amount > 0){
        this.balance += amount;
        }

        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}