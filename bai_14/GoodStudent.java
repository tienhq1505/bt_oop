package bai_14;

import java.time.LocalDate;
import java.util.Scanner;

public class GoodStudent extends Student {
    private double gpa;
    private String bestRewardName;

    public GoodStudent(String fullname, LocalDate doB, int sex, String phoneNumber, String universityName,
            String gradeLevel, double gpa, String bestRewardName) {
        super(fullname, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public void inputGoodStudent() {

        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("gpa: ");
        gpa = Integer.parseInt(sc.nextLine());
        System.out.print("Best Reward Name: ");
        bestRewardName = sc.nextLine();
    }

    @Override
    public void ShowMyInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDoB());
        System.out.println("Sex: " + getSex());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("University Name: " + getUniversityName());
        System.out.println("Grade Level: " + getGradeLevel());
        System.out.println("GPA: " + gpa);
        System.out.println("Reward: " + bestRewardName);
    }

}
