/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hani
 */
public class SearchStudents extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet result = null;

    public SearchStudents() {
        initComponents();
    }

    protected void reset() {
        studentId.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        searchStudentSearchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchStudentTable = new javax.swing.JTable();
        searchStudentNewBtn = new javax.swing.JButton();
        searchStudentCancelBtn = new javax.swing.JButton();
        showAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PMS - Search Students");
        setLocation(new java.awt.Point(100, 40));

        jLabel1.setText("Student ID");

        searchStudentSearchBtn.setText("Search");
        searchStudentSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentSearchBtnActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        searchStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Mobile", "E-Mail", "Address"
            }
        ));
        searchStudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchStudentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchStudentTable);

        searchStudentNewBtn.setText("New");

        searchStudentCancelBtn.setText("Cancel");
        searchStudentCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentCancelBtnActionPerformed(evt);
            }
        });

        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(searchStudentSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(showAll)
                        .addGap(18, 18, 18)
                        .addComponent(searchStudentNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchStudentCancelBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchStudentSearchBtn)
                    .addComponent(searchStudentNewBtn)
                    .addComponent(searchStudentCancelBtn)
                    .addComponent(showAll))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchStudentCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentCancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_searchStudentCancelBtnActionPerformed

    private void searchStudentSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentSearchBtnActionPerformed

        if (studentId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please put student ID!");
        } else {

            try {
                con = Connect.connect();
                //checking if id is exist
                String checkId = "SELECT student_id FROM students WHERE student_id='" + studentId.getText() + "'";

                pst = con.prepareStatement(checkId);
                result = pst.executeQuery();
                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "Student ID not exists!");
                    return;
                }

                //showing Student info
                String studentInfo = "SELECT * FROM students WHERE student_id='" + studentId.getText() + "' ";
                pst = con.prepareStatement(studentInfo);
                result = pst.executeQuery();
                searchStudentTable.setModel(DbUtils.resultSetToTableModel(result));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }

        }
        reset();


    }//GEN-LAST:event_searchStudentSearchBtnActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void searchStudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchStudentTableMouseClicked

        int r = searchStudentTable.getSelectedRow();
        String n = searchStudentTable.getModel().getValueAt(r, 0).toString();

        try {
            //connect db
            con = Connect.connect();
            String getTableData = "SELECT * FROM students WHERE student_id='" + n + "' ";
            pst = con.prepareStatement(getTableData);
            result = pst.executeQuery();

            if (result.next()) {
                this.dispose();
                AddStudents student = new AddStudents();
                student.setVisible(true);

                String id = result.getString("student_id");
                student.studentId.setText(id);

                String gender = result.getString("gender");
                student.studentGender.setSelectedItem(gender);

                String firstName = result.getString("first_name");
                student.studentFirstName.setText(firstName);

                String lastName = result.getString("last_name");
                student.studentLastName.setText(lastName);

                String mobile = result.getString("mobile");
                student.studentMobile.setText(mobile);

                String email = result.getString("email");
                student.studentEmail.setText(email);

                String address = result.getString("address");
                student.studentAddress.setText(address);

                String dateOfBirth = result.getString("date_of_birth");
                student.dateOfBirthStudentInfo.setText(dateOfBirth);

                String dateOfJoin = result.getString("date_of_join");
                student.dateOfJoinStudentInfo.setText(dateOfJoin);

                String adminRemarks = result.getString("admin_remarks");
                student.adminRemarks.setText(adminRemarks);

                String receptionRemarks = result.getString("reception_remarks");
                student.receptionRemarks.setText(receptionRemarks);

                String teacherRemarks = result.getString("teacher_remarks");
                student.teacherRemarks.setText(teacherRemarks);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_searchStudentTableMouseClicked

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed

        try {
            con = Connect.connect();
            //showing Student info
            String studentInfo = "SELECT * FROM students ";
            pst = con.prepareStatement(studentInfo);
            result = pst.executeQuery();
            searchStudentTable.setModel(DbUtils.resultSetToTableModel(result));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchStudents.class.getName()).log(Level.SEVERE, null, ex);
        }

        reset();
    }//GEN-LAST:event_showAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchStudentCancelBtn;
    private javax.swing.JButton searchStudentNewBtn;
    private javax.swing.JButton searchStudentSearchBtn;
    private javax.swing.JTable searchStudentTable;
    private javax.swing.JButton showAll;
    protected javax.swing.JTextField studentId;
    // End of variables declaration//GEN-END:variables
}
