package com.company.calcengine;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Data {
    void readData(){
        File filename = new File("studentdata.txt");

        try {
            FileReader fr = new FileReader(filename);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null){
                String[] readLine = line.split("\t");

                String id = readLine[0].trim();
                String firstName = readLine[1].trim();
                String lastName=   readLine[2].trim();
                String course = readLine[3].trim();
                int totalPoints = Integer.parseInt(readLine[4].trim());
                String letterGrade = readLine[5].trim();

                System.out.print("Student ID: " +  id + "\t");
                System.out.print("Student Name: " +  firstName + " " + lastName + "\n");
                System.out.print("Course: " + course + "\t");
                System.out.print("Total Points: " + totalPoints + "\t") ;
                System.out.print("Course Grade: " + letterGrade);
                System.out.println();
                System.out.println();
            }
            br.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + filename.toString());
        } catch (IOException e){
            System.out.println("Unable to read file: " + filename.toString());
        }
    }
}
