public class CreditCard {
    int accountNumber;
    int currentAmount;

    public CreditCard(int accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    int withdrawMoney() {
        return currentAmount - 25;

    }

    void balans() {
        System.out.println("Номер счета " + accountNumber);
        System.out.println("Остаток на счете " + currentAmount);

    }


}
