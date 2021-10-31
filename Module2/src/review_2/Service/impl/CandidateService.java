package review_2.Service.impl;

import review_2.Common.ReadWriteFile;
import review_2.Service.ICandidateService;
import review_2.model.Candidate;
import review_2.model.Experience;
import review_2.model.FresherCandidate;
import review_2.model.InternCandidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateService implements ICandidateService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void search() {
        ReadWriteFile read = new ReadWriteFile();
        List<String[]> list0 = read.read("src/review_2/Data/Experience.csv");
        List<String[]> list1 = read.read("src/review_2/Data/Fresher.csv");
        List<String[]> list2 = read.read("src/review_2/Data/Intern.csv");
        List<Experience> exp = new ArrayList<>();
        for (String[] string : list0) {
            Experience experience = new Experience(string);
            exp.add(experience);
        }
        System.out.println("========= EXPERIENCE CANDIDATE ========");
        for (Experience e : exp) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
        List<FresherCandidate> fresh = new ArrayList<>();
        for (String[] string : list1) {
            FresherCandidate freshCandidate = new FresherCandidate(string);
            fresh.add(freshCandidate);
        }
        System.out.println("========= FRESHER CANDIDATE ========");
        for (FresherCandidate f : fresh) {
            System.out.println(f.getFirstName() + " " + f.getLastName());
        }
        List<InternCandidate> intern = new ArrayList<>();
        for (String[] string : list2) {
            InternCandidate internCandidate = new InternCandidate(string);
            intern.add(internCandidate);
        }
        System.out.println("========= INTERN CANDIDATE ========");
        for (InternCandidate i : intern) {
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
        System.out.println("Input Candidate Name :");
        String name = scanner.nextLine();
        System.out.println("Input type of candidate :" + '\n'
                + "0. Experience " + '\n' +
                "1.Fresh" + '\n' +
                "2.Intern" + "\n" +
                "Enter your choice :");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 0:
                if (exp.size() == 0) {
                    System.out.println("empty!");
                } else {
                    for (int i = 0; i < exp.size(); i++) {
                        if (exp.get(i).getFirstName().equals(name) || exp.get(i).getLastName().equals(name)) {
                            System.out.println(exp.get(i).toString());
                        } else {
                            System.out.println("Not found!");
                        }
                    }
                }
                break;
            case 1:
                if (fresh.size() == 0) {
                    System.out.println("empty!");
                } else {
                    for (int i = 0; i < fresh.size(); i++) {
                        if (fresh.get(i).getFirstName().equals(name) || fresh.get(i).getLastName().equals(name)) {
                            System.out.println(fresh.get(i).toString());
                        } else {
                            System.out.println("Not found!");
                        }
                    }
                }
                break;
            case 2:
                if (intern.size() == 0) {
                    System.out.println("empty!");
                } else {
                    for (int i = 0; i < intern.size(); i++) {
                        if (intern.get(i).getFirstName().equals(name) || intern.get(i).getLastName().equals(name)) {
                            System.out.println(intern.get(i).toString());
                        } else {
                            System.out.println("Not found!");
                        }
                    }
                }
                break;
        }
    }

    public void showAll() {
        ReadWriteFile read = new ReadWriteFile();
        List<String[]> list0 = read.read("src/review_2/Data/Experience.csv");
        List<String[]> list1 = read.read("src/review_2/Data/Fresher.csv");
        List<String[]> list2 = read.read("src/review_2/Data/Intern.csv");
        List<Experience> exp = new ArrayList<>();
        for (String[] string : list0) {
            Experience experience = new Experience(string);
            exp.add(experience);
        }
        System.out.println("========= EXPERIENCE CANDIDATE ========");
        for (Experience e : exp) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }
        List<FresherCandidate> fresh = new ArrayList<>();
        for (String[] string : list1) {
            FresherCandidate freshCandidate = new FresherCandidate(string);
            fresh.add(freshCandidate);
        }
        System.out.println("========= FRESHER CANDIDATE ========");
        for (FresherCandidate f : fresh) {
            System.out.println(f.getFirstName() + " " + f.getLastName());
        }
        List<InternCandidate> intern = new ArrayList<>();
        for (String[] string : list2) {
            InternCandidate internCandidate = new InternCandidate(string);
            intern.add(internCandidate);
        }
        System.out.println("========= INTERN CANDIDATE ========");
        for (InternCandidate i : intern) {
            System.out.println(i.getFirstName() + " " + i.getLastName());
        }
    }


}

