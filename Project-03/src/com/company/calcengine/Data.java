package com.company.calcengine;
import java.sql.*;

public class Data extends Grade{
    void updateData(){
        String url = "jdbc:mySQL://localhost:3306/lmc_student_schema?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "AAAbbb444$";

        String query1 = "select studentID from student where studentID= ?";

        String query2 = "update student set totalPoints= ?, letterGrade= ? where studentID= ?";

        Connection connection = null;
        PreparedStatement myStatement1 = null;
        PreparedStatement myStatement2 = null;

        try {
            System.out.println("Connecting to the MySQL database...");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("MySQL Database connected!");
            System.out.println();

            getData();
            totalPoints = calcTotalPoints();
            letterGrade = calcGrade();
            displayData();

            myStatement1 = connection.prepareStatement(query1);

            myStatement1.setString(1, id);

            ResultSet data = myStatement1.executeQuery();

            if (data.next()){
                myStatement2 = connection.prepareStatement(query2);

                myStatement2.setInt(1, totalPoints);
                myStatement2.setString(2, letterGrade);
                myStatement2.setString(3, id);

                myStatement2.executeUpdate();
                System.out.println();
                System.out.println("Data has been updated to the database");

                myStatement2.close();
            } else {
                System.out.println();
                System.out.println("Student NOT found. Data has not been updated in the database");
            }
            myStatement1.close();
            System.out.println("Closing the connection.");
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }
}
