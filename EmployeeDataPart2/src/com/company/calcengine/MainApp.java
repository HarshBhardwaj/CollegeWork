/*
Description: This program reads the data from the eomployee.txt file
and display the read data results to the console.

Author: Harsh Vardhan
Date: November 06, 2017
 */
package com.company.calcengine;

public class MainApp {

    public static void main(String[] args) {
        Data employeeInfo = new Data();

        //Call the object's method - readData
        employeeInfo.readData();

        // display to output console
        System.out.println();
        System.out.println("Data has been read from the employee.txt file successfully");
    }
}
