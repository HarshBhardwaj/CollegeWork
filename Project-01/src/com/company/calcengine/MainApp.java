/*
Description: This program reads the student data from the MySQL database
and display the query results on the console.
Author: Harsh Vardhan
Date: November 12, 2017
 */
package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data studentInfo = new Data();

        studentInfo.readData();
    }
}
