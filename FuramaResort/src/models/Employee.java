package models;

public class Employee extends Person{
    private String employeeId;
    private String level;
    private String position;
    private String wage;

    public Employee(String fullName, String birthDay, String gender, String iDCard, String phoneNumber, String email, String employeeId, String level, String position, String wage) {
        super(fullName, birthDay, gender, iDCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public Employee(String[] strings) {
        super(strings);
        this.employeeId = strings[6];
        this.level = strings[7];
        this.position = strings[8];
        this.wage = strings[9];
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }


    @Override
    public String toString() {
        return super.toString() + "," + employeeId + "," + level + "," + position +","+wage;
    }

    @Override
    public String showInformation() {
        return "employee: employeeId = " + employeeId + ","+ super.showInformation() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
