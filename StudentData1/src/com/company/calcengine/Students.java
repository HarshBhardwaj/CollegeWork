package com.company.calcengine;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Students {
    public String id, lastName, firstName, letterGrade;
    public int labPoints, projectPoints, finaExamPoints, totalPoints;

    public final static String COURSE= "COMSC-051 Java Programming Part 1";
    public final static String COLLEGE= "Los Medanos College";

    //Prompt the user to enter student's data
    public void getData(){
        // declare the scanner object used to input the student's ID from the console
        Scanner inputID= new Scanner(System.in);
        System.out.print("Enter the Students ID: ");
        id = inputID.nextLine();

        // declare the scanner object used to input the student's last name from the console
        Scanner inputLastName= new Scanner(System.in);
        System.out.print("Enter the Last Name: ");
        lastName = inputLastName.nextLine();

        // declare the scanner object used to input the student's first name from the console
        Scanner inputFirstName= new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        firstName = inputFirstName.nextLine();

        // declare the scanner object used to input the lab exercises points earned from the console
        Scanner  inputLabPoints= new Scanner(System.in);
        System.out.print("Enter the Total Points for Lab Exerices (Max Points: 750): ");
        labPoints = inputLabPoints.nextInt();

        // declare the scanner object  used to input the project points earned from the console
        Scanner inputProjectPoints= new Scanner(System.in);
        System.out.print("Enter the Points for Projects: (Max Points: 150): ");
        projectPoints = inputProjectPoints.nextInt();

        // declare the scanner object used to input the final exam points earned from the console
        Scanner inputFinalExam= new Scanner(System.in);
        System.out.print("Enter the Points for Final Exam: (Max Points: 100): ");
        finaExamPoints = inputFinalExam.nextInt();
    }
}
