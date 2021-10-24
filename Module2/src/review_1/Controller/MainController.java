package review_1.Controller;

import review_1.service.impl.CandidateService;
import review_1.service.ICandidateService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        ICandidateService iCandidateService = new CandidateService();
        iCandidateService.showAll();
        while (flag) {
            System.out.println("Candidate management system:");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern ");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Enter choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iCandidateService.addExperience();
                    break;
                case 2:
                    iCandidateService.addFresher();
                    break;
                case 3:
                    iCandidateService.addIntern();
                    break;
                case 4:
                    iCandidateService.search();
                    break;
                case 5:
                    flag =false;
                    break;
            }
        }
    }
}
