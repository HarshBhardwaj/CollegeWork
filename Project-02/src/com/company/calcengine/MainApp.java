/*
Description: The program prompts the user to enter the student ID, firs and last name, total Lab exercises points,
total Project points and Final Eam points.
The program then calculates the student total points earned and the student's letter grade. The data will then be
written to a My SQL Database. The java application will insert the record into the table in the MY SQL Database.
Author: Harsh Vardhan
Date: November 13, 2017
 */
package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data studentInfo = new Data();

        studentInfo.writeData();
    }
}
