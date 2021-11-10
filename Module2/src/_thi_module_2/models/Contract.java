package models;

public class Contract {
    private String contractId;
    private String bookingId;
    private String deposit;
    private String moneyTotal;
    private String customerId;

    public Contract(String contractId, String bookingId, String deposit, String moneyTotal, String customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.moneyTotal = moneyTotal;
        this.customerId = customerId;
    }

    public Contract(String[] strings){
        this.contractId = strings[0];
        this.bookingId = strings[1];
        this.deposit = strings[2];
        this.moneyTotal = strings[3];
        this.customerId = strings[4];
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(String moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return contractId + ',' + bookingId + ',' + deposit + ','  + moneyTotal + ','  + customerId;
    }
}
