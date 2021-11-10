package _thi_module_2.Models;

public class SavingAccount extends BankAccount{
    private String savingMoney;
    private String savingDate;
    private String interestRate;
    private String period;

    public SavingAccount(String accountId, String accountCode, String accountName, String creationDate, String savingMoney, String savingDate, String interestRate, String period) {
        super(accountId, accountCode, accountName, creationDate);
        this.savingMoney = savingMoney;
        this.savingDate = savingDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SavingAccount(String[] strings, String savingMoney, String savingDate, String interestRate, String period) {
        super(strings);
        this.savingMoney = strings[4];
        this.savingDate = strings[5];
        this.interestRate = strings[6];
        this.period = strings[7];
    }

    public String getSavingMoney() {
        return savingMoney;
    }

    public void setSavingMoney(String savingMoney) {
        this.savingMoney = savingMoney;
    }

    public String getSavingDate() {
        return savingDate;
    }

    public void setSavingDate(String savingDate) {
        this.savingDate = savingDate;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return super.toString() + savingMoney + ',' + savingDate + ',' + interestRate + ',' + period;
    }
}
