/*
Description: This java application updates the student data in the MySQL database.
The program will first prompt the user to enter the student ID, first and last name.
The program then prompt the user the update the student's total lab exercises points,
total project points and final exam points. The program will then re-calculate the
student total points earned and the student's letter grade. The update data will then
be written to the MySQL database.

Author: Harsh Vardhan
Date: November 14, 2017
 */
package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data studentInfo = new Data();

        studentInfo.updateData();
    }
}
