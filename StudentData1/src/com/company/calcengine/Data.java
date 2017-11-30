package com.company.calcengine;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Data extends Grade{
    void writeData(){
        Scanner inputNum= new Scanner(System.in);
        System.out.print("Enter the number of students in the class: ");
        int numStudents = inputNum.nextInt();  // assign the input value to the variable
        System.out.println();

        File filename = new File("studentdata.txt");

        try {
            FileWriter fw = new FileWriter(filename);

            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < numStudents; i++){
                getData();
                totalPoints = calcTotalPoints();
                letterGrade = calcGrade();
                displayData();

                bw.write(id +"\t"+lastName+"\t"+firstName + "\t"+ COURSE + "\t"+ totalPoints + "\t" + letterGrade );
                bw.newLine();

                System.out.println();
                System.out.println("Data has been saved to studentdata.txt file");
                System.out.println();
            }

            bw.close();
        } catch (IOException e){
            System.out.println("Unable to write to the file: " + filename.toString());
        }

        inputNum.close();
    }
}
