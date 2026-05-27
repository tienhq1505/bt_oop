package bai_14;

import java.time.LocalDate;
import java.util.Scanner;

public class NormalStudent extends Student {
    private int englishScore;
    private double entryTestScore;

    public NormalStudent(String fullname, LocalDate doB, int sex, String phoneNumber, String universityName,
            String gradeLevel, int englishScore, double entryTestScore) {
        super(fullname, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public void inputNormalStudent() {

        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("English Score: ");
        englishScore = Integer.parseInt(sc.nextLine());
        System.out.print("Entry Test Score: ");
        entryTestScore = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void ShowMyInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDoB());
        System.out.println("Sex: " + getSex());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("University Name: " + getUniversityName());
        System.out.println("Grade Level: " + getGradeLevel());
        System.out.println("English Score: " + englishScore);
        System.out.println("Entry Test Score: " + entryTestScore);
    }
}
