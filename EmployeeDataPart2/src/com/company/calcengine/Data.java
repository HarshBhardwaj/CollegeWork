package com.company.calcengine;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Data {
    void readData(){
        File filename = new File("employee.txt");

        try {
            FileReader fr = new FileReader(filename);

            BufferedReader br = new BufferedReader(fr);

            //Store the read data into the String variables
            String fName = br.readLine();
            String lName=  br.readLine();
            String employeeID = br.readLine();
            String department = br.readLine();
            String phone = br.readLine();
            String emailAddress = br.readLine();

            //display the read data results on the console
            System.out.println("First Name: " + fName );
            System.out.println("Last Name: " + lName );
            System.out.println("Employee ID: " + employeeID );
            System.out.println("Department: " + department );
            System.out.println("Telephone Number: " + phone );
            System.out.println("Email Address: " + emailAddress );

            //Close the employee.txt file
            br.close();

        } catch (FileNotFoundException e){
            System.out.println("File not found: " + filename.toString());
        } catch (IOException e){
            System.out.println("Unable to read file: " + filename.toString());
        }
    }
}
