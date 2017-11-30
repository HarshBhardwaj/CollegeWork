package com.company.calcengine;
import java.sql.*;

public class Data {
    void readData(){
        String url = "jdbc:mySQL://localhost:3306/student_schema";
        String username = "root";
        String password = "AAAbbb444$";

        String query = "select studentID, lastName, firstName, course, totalPoints, letterGrade from student";

        Connection connection = null;
        Statement myStatement = null;

        try {
            System.out.println("Connecting to the My SQL database...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("My SQL Database connected!");
            System.out.println();

            myStatement = connection.createStatement();

            ResultSet data = myStatement.executeQuery(query);

            while (data.next()){
                System.out.print("Student ID: "+ data.getString(1));
                System.out.print(" ");
                System.out.print("Name: "+ data.getString(3)+" "+ data.getString(2));
                System.out.println(" ");
                System.out.print("Total Points: "+ data.getString(5));
                System.out.print(" ");
                System.out.println("Grade: "+ data.getString(6));
                System.out.println(" ");
            }
            myStatement.close();
            System.out.println("Closing the connection.");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }
}
