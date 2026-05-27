package bai_15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public abstract class Student {
    private String fullName;
    private LocalDate doB;
    private int sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public Student(String fullName, LocalDate doB, int sex, String phoneNumber, String universityName,
            String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public abstract void ShowMyInfo();

    protected void input() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Full Name: ");
            fullName = sc.nextLine();
        } while (fullName.isEmpty() || fullName.length() < 10 || fullName.length() > 50);
        System.out.println("Date of Birth: ");

        do {
            System.out.print("Date of Birth (dd/MM/yyyy): ");
            String date = sc.nextLine().trim();
            try {
                doB = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Sai định dạng! Nhập lại.");
                doB = null;
            }
        } while (doB == null);

        do {
            System.out.print("Gender (1: nam, 2: nữ): ");
            try {
                sex = Integer.parseInt(sc.nextLine().trim());
                if (sex != 1 && sex != 2)
                    System.out.println("Chỉ nhập 1 hoặc 2!");
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        } while (sex != 1 && sex != 2);

        String[] validPrefixes = { "09", "08", "03", "07", "05" };

        do {
            System.out.print("Phone number: ");
            phoneNumber = sc.nextLine().trim();

            boolean validPrefix = false;
            for (String prefix : validPrefixes) {
                if (phoneNumber.startsWith(prefix)) {
                    validPrefix = true;
                    break;
                }
            }

            if (!validPrefix) {
                System.out.println("Số điện thoại không hợp lệ!");
            }
        } while (phoneNumber.isEmpty());

        System.out.print("University Name: ");
        universityName = sc.nextLine();

        System.out.print("Grade Level: ");
        gradeLevel = sc.nextLine();
    }
}
