package review.Controller;

import review.service.IStudentService;
import review.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IStudentService iStudentService = new StudentService();
        while(true){
            System.out.println("Hệ thống quản lí sinh viên");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sủa thông tin sinh viên ");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Kiểm tra sinh viên");
            System.out.println("6. Sắp xếp sinh viên ");
            System.out.println("Mời nhập lựa chọn : ");
            int choice= Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    iStudentService.showAll();
                    break;
                case 2:
                    iStudentService.addNewStudent();
                    break;
                case 3:
                    System.out.println("Mời bạn nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    iStudentService.editStudent(id);
                    break;
                case 4:
                    System.out.println("Nhập vị trí cần xóa ");
                    int index = Integer.parseInt(scanner.nextLine());
                    iStudentService.remove(index);
                    break;
                case 5:
                    iStudentService.checkStudent();
                    break;
                case 6:
                    ((StudentService) iStudentService).sortStudentByPoint();
                    break;
            }
        }

    }
}
