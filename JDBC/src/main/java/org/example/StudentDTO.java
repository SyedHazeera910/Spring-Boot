package org.example;

import java.sql.*;

public class StudentDTO {

    // 1. INSERT
    public void insert(Student s) throws SQLException {
        String sql = "insert into student(name, gender, register, email, date_of_birth) values(?, ?, ?, ?, ?)";
        Connection con = DBConnection.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, s.getName());
        st.setInt(2, s.getGender());
        st.setInt(3, s.getRegister());
        st.setString(4, s.getEmail());
        st.setString(5, s.getDate_of_birth());
        st.execute();
        System.out.println("Inserted Successfully!");
        con.close();
    }

    // 2. DELETE
    public void delete(int register) throws SQLException {
        String sql = "delete from student where register=?";
        Connection con = DBConnection.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, register);
        int rows = st.executeUpdate();
        if (rows >= 1)
            System.out.println("Deleted Successfully!");
        else
            System.out.println("No such record found!");
        con.close();
    }

    // 3. FIND BY REGISTER
    public void find(int register) throws SQLException {
        String sql = "select * from student where register=?";
        Connection con = DBConnection.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, register);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            System.out.println("Serial No: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Gender: " + rs.getInt(3));
            System.out.println("Register: " + rs.getInt(4));
            System.out.println("Email: " + rs.getString(5));
            System.out.println("Date of Birth: " + rs.getString(6));
        } else {
            System.out.println("No record found!");
        }
        con.close();
    }

    // 4. FIND ALL
    public void findAll() throws SQLException {
        String sql = "select * from student";
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println("SNO  NAME  GENDER  REGISTER  EMAIL  DOB");
        System.out.println("----------------------------------------");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getInt(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println();
        }
        con.close();
    }
}
