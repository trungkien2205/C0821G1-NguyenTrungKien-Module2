package review_1.model;

public class InternCandidate extends Candidate{
    public static final int INTERN = 2;
    private String majors;
    private int semester;
    private String universityName;

    public InternCandidate(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public InternCandidate(int id, String firstName, String lastName, int birthDay, String address, int phone, String email, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public static int getINTERN() {
        return INTERN;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "InternCandidate{" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", birthDay=" +  this.getBirthDay()+
                ", address='" +  this.getAddress()+ '\'' +
                ", phone=" +  this.getPhone() +
                ", email='" + this.getEmail() + '\''+
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
