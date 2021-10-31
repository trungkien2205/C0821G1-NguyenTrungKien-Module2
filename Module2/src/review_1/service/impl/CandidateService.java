package review_1.service.impl;

import review_1.model.Candidate;
import review_1.model.Experience;
import review_1.model.FresherCandidate;
import review_1.model.InternCandidate;
import review_1.service.ICandidateService;
import review_1.Common.Validation;

import java.util.ArrayList;
import java.util.Scanner;


public class CandidateService implements ICandidateService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Candidate> candidateList = new ArrayList<>();

    static {
        candidateList.add(new Experience(1, "kien", "Nguyen", 1234, "dn", 1231231234, "abc", 123, "abc"));
        candidateList.add(new FresherCandidate(2, "nguyen", "kien", 3456, "hn", 1231231231, "abcd", 123, "abc", "abc"));
    }


    @Override
    public void addExperience() {
        System.out.println("Enter Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name :");
        String lastName = scanner.nextLine();
        System.out.println("Enter address :");
        String address = scanner.nextLine();
        int birthDay = Validation.inputBirthDay();
        String email = Validation.inputEmail();
        int phone = Validation.inputPhone();
        int exPlnyear = Validation.checkExpInYear();
        System.out.println("Enter Pro Skill :");
        String proSkill = scanner.nextLine();
        System.out.println("Do you want to continue (Y/N) ?");
        String confirm = scanner.nextLine();
        if (confirm.equals("Y")) {
            candidateList.add(new Experience(id, firstName, lastName, birthDay, address, phone, email, exPlnyear, proSkill));
            System.out.println("Completed");
        } else {
            showAll();
        }
    }

    @Override
    public void showAll() {
        for (Candidate candidate : candidateList) {
            System.out.println(candidate.toString());
        }
    }

    @Override
    public void addFresher() {
        System.out.println("Enter Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name :");
        String lastName = scanner.nextLine();
        System.out.println("Enter address :");
        String address = scanner.nextLine();
        int birthDay = Validation.inputBirthDay();
        String email = Validation.inputEmail();
        int phone = Validation.inputPhone();
        String graduationRank = Validation.choiceGraduationRank();
        System.out.println("Enter education");
        String education = scanner.nextLine();
        System.out.println("Enter graduationDate");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Do you want to continue (Y/N) ?");
        String confirm = scanner.nextLine();
        if (confirm.equals("Y")) {
            candidateList.add(new FresherCandidate(id, firstName, lastName, birthDay, address, phone, email, graduationDate, graduationRank, education));
            System.out.println("Completed");
        } else {
            showAll();
        }

    }

    @Override
    public void addIntern() {
        System.out.println("Enter Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name :");
        String lastName = scanner.nextLine();
        System.out.println("Enter address :");
        String address = scanner.nextLine();
        int birthDay = Validation.inputBirthDay();
        String email = Validation.inputEmail();
        int phone = Validation.inputPhone();
        System.out.println("Enter majors");
        String majors = scanner.nextLine();
        System.out.println("Enter semester");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter University Name");
        String universityName = scanner.nextLine();
        System.out.println("Do you want to continue (Y/N) ?");
        String confirm = scanner.nextLine();
        if (confirm.equals("Y")) {
            candidateList.add(new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, majors, semester, universityName));
            System.out.println("Completed");
        } else {
            showAll();
        }
    }

    @Override
    public void search() {
        showAll();
        System.out.println("Enter First Name or Last Name");
        String name = scanner.nextLine();
        System.out.println("Enter type of candidate;");
        int type = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < candidateList.size(); i++) {
            if (candidateList.get(i).getFirstName().equals(name)) {
                System.out.println(candidateList.get(i));
            } else if (candidateList.get(i).getLastName().equals(name)) {
                System.out.println(candidateList.get(i));
            }
        }

    }
}