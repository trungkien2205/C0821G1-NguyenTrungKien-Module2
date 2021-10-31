package review_2.Service.impl;

import review_2.Common.Validation;
import review_2.Common.ReadWriteFile;
import review_2.Service.IFresherService;
import review_2.model.FresherCandidate;

import java.util.Scanner;

public class FresherService implements IFresherService {
    Scanner scanner = new Scanner(System.in);
    ReadWriteFile fresh = new ReadWriteFile();

    @Override
    public void addNewFresher() {
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
        String graduationRank = Validation.choiceGraduationRank();
        System.out.println("Enter education");
        String education = scanner.nextLine();
        System.out.println("Enter graduationDate");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        FresherCandidate fresher = new FresherCandidate(id, firstName, lastName, birthDay, address, phone, email, graduationDate, graduationRank, education);
        fresh.write(fresher, "src/review_2/Data/Fresher.csv", true);
    }
}
