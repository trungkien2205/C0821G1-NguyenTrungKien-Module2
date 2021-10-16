package review.service;

public interface IStudentService {
    void showAll();

    void addNewStudent();

    void editStudent(int id);

    void remove(int index);

    void checkStudent();
}
