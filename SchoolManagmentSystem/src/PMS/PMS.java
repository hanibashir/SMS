package PMS;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PMS {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connect.connect();
        
        ResultSet rs;
        try {
            rs = Connect.displayData();
            if (rs.next()) {
                new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error Happened!");
            }

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
