package models;

public abstract class Person {
    private String fullName;
    private String birthDay;
    private String gender;
    private String iDCard;
    private String phoneNumber;
    private String email;

    public Person(String fullName, String birthDay, String gender, String iDCard, String phoneNumber, String email) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.gender = gender;
        this.iDCard = iDCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(String[] strings) {
        this.fullName = strings[0];
        this.birthDay = strings[1];
        this.gender = strings[2];
        this.iDCard = strings[3];
        this.phoneNumber = strings[4];
        this.email = strings[5];
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getiDCard() {
        return iDCard;
    }

    public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return fullName + ',' + birthDay + "," + gender + "," + iDCard + "," +
                phoneNumber + "," + email;
    }

    public String showInformation(){
        return "fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", iDCard='" + iDCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'';
    }
}
