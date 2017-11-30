/*
Description: The program prompts the user to enter the Student ID, first and last name,
total Lab exercises points, total Project points and Final Exam points. The program then
calculates the student total points earned and the student's letter grade. The data will
be written to an external text file.
In the text file, each line is the student's data which makes up a single record (row).
The record will contain 6 fields separated by a "tab" delimiter: student ID, student first
name, last name, course, total points earned and letter grade.

Author: Harsh Vardhan
Date: November 08, 2017
 */

package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data studentInfo = new Data();

        studentInfo.writeData();
    }
}
