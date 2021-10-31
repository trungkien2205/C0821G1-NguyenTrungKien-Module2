package review_2.Controller;

import review_2.Service.ICandidateService;
import review_2.Service.IExperienceService;
import review_2.Service.IFresherService;
import review_2.Service.IInternService;
import review_2.Service.impl.CandidateService;
import review_2.Service.impl.ExperienceService;
import review_2.Service.impl.FresherService;
import review_2.Service.impl.InternService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        IExperienceService iExperienceService = new ExperienceService();
        IFresherService iFresherService = new FresherService();
        IInternService iInternService = new InternService();
        ICandidateService iCandidateService = new CandidateService();
        while (flag) {
            System.out.println("Candidate management system:");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Intern ");
            System.out.println("4. Search");
            System.out.println("5. Show Candidate");
            System.out.println("6. Exit");
            System.out.println("Enter choice : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iExperienceService.addNewExperience();
                    break;
                case 2:
                    iFresherService.addNewFresher();
                    break;
                case 3:
                    iInternService.addNewIntern();
                    break;
                case 4:
                    iCandidateService.search();
                    break;
                case 5:
                    iCandidateService.showAll();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
