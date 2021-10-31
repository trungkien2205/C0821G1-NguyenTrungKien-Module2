package review_2.model;

public abstract class Candidate {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String address;
    private String phone;
    private String email;

    public Candidate() {
    }

    public Candidate(int id, String firstName, String lastName, String birthDay, String address, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Candidate(String[] string){
        this.id= Integer.parseInt(string[0]);
        this.firstName=string[1];
        this.lastName=string[2];
        this.birthDay=string[3];
        this.address=string[4];
        this.phone=string[5];
        this.email=string[6];
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  id + "," + firstName + "," + lastName + "," + birthDay + "," + address + '\'' + "," + phone + "," + email ;
    }
}
