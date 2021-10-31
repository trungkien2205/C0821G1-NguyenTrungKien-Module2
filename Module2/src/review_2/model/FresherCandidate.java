package review_2.model;

public class FresherCandidate extends Candidate {
    private int graduationDate;
    private String graduationRank;
    private String education;
    public static final int FRESHER = 1;

    public FresherCandidate(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public FresherCandidate(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public FresherCandidate(String[] string){
        super(string);
        this.graduationDate= Integer.parseInt(string[7]);
        this.graduationRank=string[8];
        this.education=string[9];
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
        return super.toString() + "," + graduationDate + "," + graduationRank + '\'' + "," + education ;
    }
}
