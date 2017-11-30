/*
Description: The program reads the data from an external file (studentdata.txt file) and
then display the read data results on the console.
In the text file, each line is the student's data which makes up a single record (row).
The record will contain 6 fields separated by a "tab" delimiter: student ID, student
firest name, last name, course, total points earned and letter grade.

Author: Harsh Vardhan
Date: November 09, 2017
 */

package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data studentInfo = new Data();

        studentInfo.readData();
    }
}
