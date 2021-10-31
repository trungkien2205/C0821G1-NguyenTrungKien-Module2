package review_2.Service.impl;

import review_2.Common.ReadWriteFile;
import review_2.Common.Validation;
import review_2.Service.IInternService;
import review_2.model.InternCandidate;

import java.util.Scanner;

public class InternService implements IInternService {
    Scanner scanner = new Scanner(System.in);
    ReadWriteFile inte = new ReadWriteFile();

    @Override
    public void addNewIntern() {
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
        System.out.println("Enter majors");
        String majors = scanner.nextLine();
        System.out.println("Enter semester");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter University Name");
        String universityName = scanner.nextLine();
        InternCandidate intern = new InternCandidate(id, firstName, lastName, birthDay, address, phone, email, majors, semester, universityName);
        inte.write(intern, "src/review_2/Data/Intern.csv", true);
    }
}
