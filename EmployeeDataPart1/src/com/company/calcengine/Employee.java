package com.company.calcengine;

import java.util.Scanner;

public class Employee {
    String fName, lName, employeeID, department, phone, emailAddress;

    Employee() {
        // declare the scanner object that will be used to input the employee's first name
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        fName = input1.nextLine();  // assign the input value to the variable

        // declare the scanner object that will be used to input the employee's last name
        Scanner input2 = new Scanner(System.in); // assign the input value to the variable= new Scanner(System.in);
        System.out.print("Enter Last Name: ");
        lName = input2.nextLine();  // assign the input value to the variable

        // declare the scanner object that will be used to input the employee's ID
        Scanner input3 = new Scanner(System.in); // assign the input value to the variable= new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        employeeID = input3.nextLine();  // assign the input value to the variable

        // declare the scanner object that will be used to input the employee's department
        Scanner input4 = new Scanner(System.in); // assign the input value to the variable= new Scanner(System.in);
        System.out.print("Enter Department: ");
        department = input4.nextLine();  // assign the input value to the variable

        // declare the scanner object that will be used to input the employee's phone
        Scanner input5 = new Scanner(System.in); // assign the input value to the variable= new Scanner(System.in);
        System.out.print("Enter Telephone Number: ");
        phone = input5.nextLine();  // assign the input value to the variable

        // declare the scanner object that will be used to input the employee's email address
        Scanner input6 = new Scanner(System.in); // assign the input value to the variable= new Scanner(System.in);
        System.out.print("Enter Employee Email Address: ");
        emailAddress = input6.nextLine(); // assign the input value to the variable

        // close the scanner input objects
        input1.close();
        input2.close();
        input3.close();
        input4.close();
        input5.close();
        input6.close();
    }
}
