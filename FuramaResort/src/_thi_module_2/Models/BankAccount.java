package _thi_module_2.Models;

public abstract class BankAccount {
    private String accountId;
    private String accountCode;
    private String accountName;
    private String creationDate;

    public BankAccount() {
    }

    public BankAccount(String accountId, String accountCode, String accountName, String creationDate) {
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.creationDate = creationDate;
    }

    public BankAccount(String[] strings){
        this.accountId=strings[0];
        this.accountCode=strings[1];
        this.accountName=strings[2];
        this.creationDate=strings[3];
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return  accountId + ',' + accountCode + ',' + accountName + ',' + creationDate + ',';
    }

}
