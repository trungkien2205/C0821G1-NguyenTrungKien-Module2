package _thi_module_2.Models;

public class PaymentAccount extends BankAccount{
    private String cardNumber;
    private String moneyInAccount;

    public PaymentAccount(String accountId, String accountCode, String accountName, String creationDate, String cardNumber, String moneyInAccount) {
        super(accountId, accountCode, accountName, creationDate);
        this.cardNumber = cardNumber;
        this.moneyInAccount = moneyInAccount;
    }

    public PaymentAccount(String[] strings, String cardNumber, String moneyInAccount) {
        super(strings);
        this.cardNumber = strings[4];
        this.moneyInAccount = strings[5];
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(String moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        return  super.toString()+ cardNumber + ',' + moneyInAccount;
    }
}
