package review_2.model;

public class Experience extends Candidate {
    public static final int EXPERIENCE = 0;
    private int exPlnYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, String birthDay, String address, String phone, String email, int exPlnYear, String proSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.exPlnYear = exPlnYear;
        this.proSkill = proSkill;
    }
    public Experience(String[] string){
        super(string);
        this.exPlnYear= Integer.parseInt(string[7]);
        this.proSkill=string[8];
    }
    public static int getEXPERIENCE() {
        return EXPERIENCE;
    }

    public int getExPlnYear() {
        return exPlnYear;
    }

    public void setExPlnYear(int exPlnYear) {
        this.exPlnYear = exPlnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "," + exPlnYear + "," + proSkill;
    }

}
