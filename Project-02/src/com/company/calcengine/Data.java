package com.company.calcengine;
import java.sql.*;

public class Data extends Grade{
    void writeData(){
        String url = "jdbc:mySQL://localhost:3306/studentGrade_schema?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "AAAbbb444$";

        String query = "insert into student (studentID, lastName, firstName, course, labPoints, projectPoints, finalExamPoints, totalPoints, letterGrade)"+ "values(?,?,?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement myStatement = null;

        try {
            getNumberStudents();

            System.out.println("Connecting to the My SQL database...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("My SQL Database connected!");
            System.out.println();

            for (int i = 0; i < numStudents; i++ ){
                getData();
                totalPoints = calcTotalPoints();
                letterGrade = calcGrade();
                displayData();

                myStatement = connection.prepareStatement(query);

                myStatement.setString(1, id);
                myStatement.setString(2, lastName);
                myStatement.setString(3, firstName);
                myStatement.setString(4, COURSE);
                myStatement.setInt(5, labPoints);
                myStatement.setInt(6, projectPoints);
                myStatement.setInt(7, finalExamPoints);
                myStatement.setInt(8, totalPoints);
                myStatement.setString(9, letterGrade);

                myStatement.executeUpdate();
                System.out.println();
                System.out.println("Data has been saved to database");
                System.out.println();
            }

            myStatement.close();
            System.out.println("Closing the connection.");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }
}
