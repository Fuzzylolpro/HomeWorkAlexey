package Old;

public class ATM {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(123456, 525);
        CreditCard card2 = new CreditCard(654123, 127);
        CreditCard card3 = new CreditCard(123789, 252);
        int a = card1.currentAmount;
        card1.balans();
        card2.balans();


        card1.balans();


    }
}
