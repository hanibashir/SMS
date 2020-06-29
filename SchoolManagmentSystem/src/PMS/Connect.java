package PMS;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {

    private static Connection conn = null;
    private static Statement st, createStaff, createUsers, createStudents;
    private static ResultSet rs;

    public static Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:PMS.sqlite");

        //creating staff table
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM sqlite_master WHERE type='table' AND name='staff' ");
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "Staff table created!", "Building Database", JOptionPane.INFORMATION_MESSAGE);
            createStaff = conn.createStatement();
            createStaff.execute("CREATE TABLE staff"
                    + "(staff_id integer,"
                    + "gender varchar(80),"
                    + "first_name varchar(80),"
                    + "last_name varchar(80),"
                    + "mobile varchar(80),"
                    + "email varchar(80),"
                    + "address varchar(80),"
                    + "date_of_join varchar(80),"
                    + "position varchar(80),"
                    + "image longblob,"
                    + "primary key (staff_id));");
        }
        //creating users table
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM sqlite_master WHERE type='table' AND name='users' ");
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "Users table created!", "Building Database", JOptionPane.INFORMATION_MESSAGE);
            createUsers = conn.createStatement();
            createUsers.execute("CREATE TABLE users"
                    + "(username varchar(80),"
                    + "userpass varchar(80),"
                    + "position varchar(80),"
                    + "primary key (username));");
        }
        //creating staff table
        st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM sqlite_master WHERE type='table' AND name='students' ");
        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "Students table created!", "Building Database", JOptionPane.INFORMATION_MESSAGE);
            createStudents = conn.createStatement();
            createStudents.execute("CREATE TABLE students"
                    + "(student_id integer,"
                    + "gender varchar(80),"
                    + "first_name varchar(80),"
                    + "last_name varchar(80),"
                    + "mobile varchar(80),"
                    + "email varchar(80),"
                    + "address varchar(80),"
                    + "date_of_birth varchar(80),"
                    + "date_of_join varchar(80),"
                    + "admin_remarks varchar(700),"
                    + "reception_remarks varchar(700),"
                    + "teacher_remarks varchar(700),"
                    + "primary key (student_id));");
            //inserting admin data
            JOptionPane.showMessageDialog(null, "Inserting admin data!", "Building Database", JOptionPane.INFORMATION_MESSAGE);
            PreparedStatement prep = conn.prepareStatement("INSERT INTO users VALUES(?,?,?);");
            prep.setString(1, "Admin"); //username
            prep.setString(2, "123456");//pass
            prep.setString(3, "Admin");//position
            prep.execute();

            JOptionPane.showMessageDialog(null, "You are ready to go! " + "\n" + "Username: Admin, Password: 123456, Position: Admin" + "\n" + "Please read README file", "Ready", JOptionPane.INFORMATION_MESSAGE);
        }
        return null;

    }

    public static ResultSet displayData() throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM users");
        return rs;

    }

}
