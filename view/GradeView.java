package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.SubjectDTO;
import model.UserDTO;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오");


        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        System.out.println("학생 이름: ");
        UserDTO student = new UserBuilder()
                .name(sc.next())
                .build();
        SubjectDTO subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0, 100))
                .english(util.createRandomInteger(0, 100))
                .math(util.createRandomInteger(0, 100))
                .build();

        int totalScore = grade.getTotalScore();
        double average = grade.findAverage();

        System.out.printf(" ============= 성적표 ==============\n" +
                        " Name : %s \n" +
                        " Korean : %s \n" +
                        " English : %s \n" +
                        " Math : %s \n" +
                        " Total : %s \n" +
                        " Average : %s",
                subjects.getKorean(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore,
                average);
    }
}