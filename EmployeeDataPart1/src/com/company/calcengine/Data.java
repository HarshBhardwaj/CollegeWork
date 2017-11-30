package com.company.calcengine;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Data extends Employee{
    void writeData(){
        File filename = new File("employee.txt");

        //Error Handling if can not write to file
        try {
            FileWriter fw = new FileWriter(filename);

            BufferedWriter br = new BufferedWriter(fw);

            //Write the data to the employee.txt file
            br.write(fName);
            br.newLine();
            br.write(lName);
            br.newLine();
            br.write(employeeID);
            br.newLine();
            br.write(department);
            br.newLine();
            br.write(phone);
            br.newLine();
            br.write(emailAddress);

            //Close the employee.txt file
            br.close();
        } catch (IOException e){
            System.out.println("Unable to write to file " + filename.toString());
        }
    }
}
