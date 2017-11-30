package com.company.calcengine;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Student {
    public String id, lastName, firstName, letterGrade;
    public int numStudents, labPoints, projectPoints, finalExamPoints, totalPoints;

    public final static String COURSE = "COMSC-051 Java Programming Part 1";
    public final static String COLLEGE = "Los Medanos College";

    public void getNumberStudents(){
        try {
            Scanner inputNum = new Scanner(System.in);
            System.out.print("Enter the number of students in the class: ");
            numStudents = inputNum.nextInt();
            System.out.println();
        } catch (Exception e){
            System.out.println("Invalid data entered");
        }
    }

    public void getData(){
        Scanner inputID= new Scanner(System.in);
        System.out.print("Enter the Student ID: ");
        id = inputID.nextLine();

        Scanner inputLastName= new Scanner(System.in);
        System.out.print("Enter the Last Name: ");
        lastName = inputLastName.nextLine();

        Scanner inputFirstName= new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        firstName = inputFirstName.nextLine();

        Scanner  inputLabPoints= new Scanner(System.in);
        System.out.print("Enter the Total Points for Lab Exerices (Max Points: 750): ");
        labPoints = inputLabPoints.nextInt();

        Scanner inputProjectPoints= new Scanner(System.in);
        System.out.print("Enter the Points for Projects: (Max Points: 150):");
        projectPoints = inputProjectPoints.nextInt();

        Scanner inputFinalExam= new Scanner(System.in);
        System.out.print("Enter the Points for Final Exam: (Max Points: 100): ");
        finalExamPoints = inputFinalExam.nextInt();
    }
}
