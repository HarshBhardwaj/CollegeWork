/*
Description: This program prompts the user to input employee
information and then store the data into a text file - employee.txt
Author: Harsh Vardhan
Date: November 04, 2017
 */

package com.company.calcengine;

public class Main {

    public static void main(String[] args) {
        Data employeeInfo = new Data();

        employeeInfo.writeData();

        System.out.println();
        System.out.println("Data has been written to employee.txt file successfully");
    }
}
