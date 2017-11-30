package com.company.calcengine;

public class Grade extends Student {
    public int calcTotalPoints(){
        totalPoints = labPoints + projectPoints + finalExamPoints;
        return totalPoints;
    }

    public String calcGrade(){
        if (totalPoints>=900) {
            return letterGrade="A";
        } else if(totalPoints >=800 && totalPoints <900) {
            return letterGrade="B";
        } else if (totalPoints >=700 && totalPoints <800) {
            return letterGrade="C";
        } else if (totalPoints >=600  && totalPoints<700){
            return letterGrade="D";
        } else {
            return letterGrade="F";
        }
    }

    public void displayData(){
        System.out.println();
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("College: " + COLLEGE);
        System.out.println("Course: "  + COURSE);

        System.out.println("Total Points: " + totalPoints);
        System.out.println("Course Grade: " + letterGrade);
    }
}
