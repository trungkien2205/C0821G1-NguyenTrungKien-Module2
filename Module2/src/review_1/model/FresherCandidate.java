package review_1.model;

public class FresherCandidate extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String education;
    public static final int FRESHER = 1;

    public FresherCandidate(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public FresherCandidate(int id, String firstName, String lastName, int birthDay, String address, int phone, String email, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public static int getFRESHER() {
        return FRESHER;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "FresherCandidate{" +
            "id=" + this.getId() +
                    ", firstName='" + this.getFirstName() + '\'' +
                    ", lastName='" + this.getLastName() + '\'' +
                    ", birthDay=" +  this.getBirthDay()+
                    ", address='" +  this.getAddress()+ '\'' +
                    ", phone=" +  this.getPhone() +
                    ", email='" + this.getEmail() + '\''+
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
