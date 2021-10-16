package review.service.impl;

import review.model.Student;
import review.service.IStudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {

    Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "KienNT", "Da Nang", 10));
        studentList.add(new Student(2, "KienNT", "Ha Noi", 9));
        studentList.add(new Student(3, "KienNT", "Ho Chi Minh", 8));
    }

    @Override
    public void showAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Mời bạn nhập vị trí ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ ");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, address, point);
        studentList.add(index, student);
        System.out.println("Thêm mới sinh viên thành công!");
    }

    @Override
    public void editStudent(int id) {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExisted = true;
                System.out.println("Mời bạn nhập tên muốn sửa");
                String name = scanner.nextLine();
                studentList.get(i).setName(name);
                System.out.println("Mời bạn nhập địa chỉ muốn sửa");
                String address = scanner.nextLine();
                studentList.get(i).setAddress(address);
                System.out.println("Mời bạn nhập điểm");
                int point = Integer.parseInt(scanner.nextLine());
                studentList.get(i).setPoint(point);
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d Không tồn tại.\n", id);
        } else {
            showAll();
        }
    }

    @Override
    public void remove(int index) {
        studentList.remove(index);
    }

    @Override
    public void checkStudent() {
        System.out.println("Nhập id sinh viên");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for(int i=0;i<studentList.size();i++){
            if (id==studentList.get(i).getId()){
                check=true;
                System.out.println("id đã tồn tại");
                System.out.println(studentList.get(i).toString());
                break;
            }
        }
        if (!check) {
            System.out.printf("id = %d Không tồn tại.\n", id);
        }
    }

    public void sortStudentByPoint() {
        Collections.sort(studentList, new SortStudentByPoint());
        showAll();
    }

}