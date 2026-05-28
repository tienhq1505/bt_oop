package bai_14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    // thêm sinh viên
    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> recruit(int number) {

        List<GoodStudent> goodStudents = new ArrayList<>();
        List<NormalStudent> normalStudents = new ArrayList<>();

        for (Student s : students) {

            if (s instanceof GoodStudent) {

                goodStudents.add(
                        (GoodStudent) s);

            } else if (s instanceof NormalStudent) {

                normalStudents.add(
                        (NormalStudent) s);
            }
        }
        // học từ AI
        // goodStudents.sort(

        // Comparator
        // .comparing(
        // GoodStudent::getGpa)
        // .reversed()
        // .thenComparing(
        // Student::getFullName)
        // );
        for (int i = 0; i < goodStudents.size() - 1; i++) {
            for (int j = 0; j < goodStudents.size() - 1 - i; j++) {
                GoodStudent a = goodStudents.get(j);
                GoodStudent b = goodStudents.get(j + 1);

                int cmp = Double.compare(a.getGpa(), b.getGpa());// Double.compare so sánh 2 double

                if (cmp == 0) {
                    cmp = a.getFullName().compareTo(b.getFullName());// Hàm compareTo() so sánh từng ký tự một từ trái
                                                                     // sang phải
                }
                if (cmp < 0) {
                    goodStudents.set(j, b);
                    goodStudents.set(j + 1, a);
                }
            }
        }
        List<Student> result = new ArrayList<>();
        for (GoodStudent g : goodStudents) {
            if (result.size() < number) {
                result.add(g);
            }
        }
        for (NormalStudent n : normalStudents) {
            if (result.size() < number) {
                result.add(n);
            }
        }
        return result;
    }

    public void sortAndDisplay() {
        students.sort(Comparator.comparing(Student::getFullName).reversed().thenComparing(Student::getPhoneNumber));
        for (Student s : students) {
            System.out.println("Full Name: " + s.getFullName());
            System.out.println("Phone Number: " + s.getPhoneNumber());
        }
    }
}
