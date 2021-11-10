package models;

public class Customer extends Person {
    private String customerId;
    private String customerType;
    private String address;

    public Customer(String fullName, String birthDay, String gender, String iDCard, String phoneNumber, String email, String customerId, String customerType, String address) {
        super(fullName, birthDay, gender, iDCard, phoneNumber, email);
        this.customerId = customerId;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String[] strings) {
        super(strings);
        this.customerId = strings[6];
        this.customerType = strings[7];
        this.address = strings[8];
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "," + customerId + "," + customerType + "," + address;
    }

    @Override
    public String showInformation() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                super.showInformation() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
