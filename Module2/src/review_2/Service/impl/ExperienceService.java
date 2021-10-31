package review_2.Service.impl;

import review_2.Common.Validation;
import review_2.Common.ReadWriteFile;
import review_2.Service.IExperienceService;
import review_2.model.Experience;

import java.util.Scanner;

public class ExperienceService implements IExperienceService {
    Scanner scanner = new Scanner(System.in);
    ReadWriteFile exper = new ReadWriteFile();

    @Override
    public void addNewExperience() {
        System.out.println("Enter Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name :");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name :");
        String lastName = scanner.nextLine();
        System.out.println("Enter address :");
        String address = scanner.nextLine();
        String birthDay = Validation.inputBirthDay();
        String email = Validation.inputEmail();
        String phone = Validation.inputPhone();
        int exPlnyear = Validation.checkExpInYear();
        System.out.println("Enter Pro Skill :");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(id, firstName, lastName, birthDay, address, phone, email, exPlnyear, proSkill);
        exper.write(experience, "src/review_2/Data/Experience.csv", true);
    }
}
