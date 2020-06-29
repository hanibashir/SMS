package PMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hani
 */
public class AddStudentsByReception extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    int saveWithout;

    public AddStudentsByReception() {
        initComponents();
    }

    protected void reset() {
        studentId.setText("");
        studentGender.setSelectedIndex(0);
        studentFirstName.setText("");
        studentLastName.setText("");
        studentMobile.setText("");
        studentEmail.setText("");
        studentAddress.setText("");
        adminRemarks.setText("");
        receptionRemarks.setText("");
        teacherRemarks.setText("");
        studentBirthD.setSelectedIndex(0);
        studentBirthM.setSelectedIndex(0);
        studentBirthY.setSelectedIndex(0);
        studentDateOfJoinD.setSelectedIndex(0);
        studentDateOfJoinM.setSelectedIndex(0);
        studentDateOfJoinY.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studentGender = new javax.swing.JComboBox<>();
        studentFirstName = new javax.swing.JTextField();
        studentLastName = new javax.swing.JTextField();
        studentMobile = new javax.swing.JTextField();
        studentEmail = new javax.swing.JTextField();
        studentAddress = new javax.swing.JTextField();
        studentDateOfJoinD = new javax.swing.JComboBox<>();
        studentDateOfJoinM = new javax.swing.JComboBox<>();
        studentDateOfJoinY = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        studentBirthD = new javax.swing.JComboBox<>();
        studentBirthM = new javax.swing.JComboBox<>();
        studentBirthY = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        studentSaveBtn = new javax.swing.JButton();
        studentUpdateBtn = new javax.swing.JButton();
        studentNewBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receptionRemarks = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        studentSearchBtn = new javax.swing.JButton();
        studentCancelBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminRemarks = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        teacherRemarks = new javax.swing.JTextArea();
        dateOfBirthStudentInfo = new javax.swing.JTextField();
        dateOfJoinStudentInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PMS - Add Students");
        setLocation(new java.awt.Point(300, 40));
        setResizable(false);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Mobile");

        jLabel5.setText("E-Mail");

        jLabel6.setText("Address");

        jLabel7.setText("Date Of Join");

        studentGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Female", "Male" }));

        studentDateOfJoinD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        studentDateOfJoinM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        studentDateOfJoinY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jLabel8.setText("Date Of Birth");

        studentBirthD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        studentBirthM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        studentBirthY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1989", "1990", ".", ".", ".", "2010" }));

        jLabel9.setText("Student ID");

        studentSaveBtn.setText("Add");
        studentSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSaveBtnActionPerformed(evt);
            }
        });

        studentUpdateBtn.setText("Update");
        studentUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentUpdateBtnActionPerformed(evt);
            }
        });

        studentNewBtn.setText("New");
        studentNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNewBtnActionPerformed(evt);
            }
        });

        receptionRemarks.setColumns(20);
        receptionRemarks.setRows(5);
        jScrollPane2.setViewportView(receptionRemarks);

        jLabel11.setText("Add Remarks");

        studentSearchBtn.setText("Search");
        studentSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSearchBtnActionPerformed(evt);
            }
        });

        studentCancelBtn.setText("Cancel");
        studentCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCancelBtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Admin Remarks");

        adminRemarks.setEditable(false);
        adminRemarks.setColumns(20);
        adminRemarks.setRows(5);
        jScrollPane1.setViewportView(adminRemarks);

        jLabel12.setText("Teacher Remarks");

        teacherRemarks.setEditable(false);
        teacherRemarks.setColumns(20);
        teacherRemarks.setRows(5);
        jScrollPane3.setViewportView(teacherRemarks);

        dateOfBirthStudentInfo.setEditable(false);
        dateOfBirthStudentInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        dateOfJoinStudentInfo.setEditable(false);
        dateOfJoinStudentInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateOfBirthStudentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(dateOfJoinStudentInfo))
                        .addGap(295, 295, 295))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentEmail)
                            .addComponent(studentLastName)
                            .addComponent(studentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentId)
                            .addComponent(studentFirstName)
                            .addComponent(studentMobile)
                            .addComponent(studentAddress)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentDateOfJoinD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentBirthD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(studentDateOfJoinM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentBirthM, 0, 70, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(studentDateOfJoinY, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentBirthY, 0, 72, Short.MAX_VALUE))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentUpdateBtn))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(595, 595, 595)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(studentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNewBtn)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(studentGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentSaveBtn))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(studentFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentUpdateBtn))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(studentLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentSearchBtn))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(studentMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentCancelBtn))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(studentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(studentBirthD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentBirthM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentBirthY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfBirthStudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentDateOfJoinD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentDateOfJoinM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentDateOfJoinY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfJoinStudentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNewBtnActionPerformed
        reset();
    }//GEN-LAST:event_studentNewBtnActionPerformed

    private void studentUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentUpdateBtnActionPerformed

        if (studentId.getText().equals("") || studentFirstName.getText().equals("") || studentLastName.getText().equals("") || studentAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all required fields!");
            return;
        } else if (studentBirthD.getSelectedItem().equals("Day") || studentBirthM.getSelectedItem().equals("Month") || studentBirthY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of Birth!");
            return;
        } else if (studentDateOfJoinD.getSelectedItem().equals("Day") || studentDateOfJoinM.getSelectedItem().equals("Month") || studentDateOfJoinY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of join!");
            return;
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

                //updating Student info
                String update = "UPDATE students SET student_id='" + studentId.getText() + "', gender='" + studentGender.getSelectedItem() + "', first_name='" + studentFirstName.getText() + "',last_name='" + studentLastName.getText() + "',mobile='" + studentMobile.getText() + "',email='" + studentEmail.getText() + "',address='" + studentAddress.getText() + "', date_of_join='" + studentDateOfJoinD.getSelectedItem() + "-" + studentDateOfJoinM.getSelectedItem() + "-" + studentDateOfJoinY.getSelectedItem() + "',"
                        + "  date_of_join='" + studentBirthD.getSelectedItem() + "-" + studentBirthM.getSelectedItem() + "-" + studentBirthY.getSelectedItem() + "',reception_remarks='" + receptionRemarks.getText() + "' WHERE student_id='" + studentId.getText() + "' ";

                pst = con.prepareStatement(update);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Student info updated!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddStudentsByReception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        reset();
    }//GEN-LAST:event_studentUpdateBtnActionPerformed

    private void studentSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSaveBtnActionPerformed

        if (studentId.getText().equals("") || studentFirstName.getText().equals("") || studentLastName.getText().equals("") || studentAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all requered fields!");
            return;
        } else if (studentBirthD.getSelectedItem().equals("Day") || studentBirthM.getSelectedItem().equals("Month") || studentBirthY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of Birth!");
            return;
        } else if (studentDateOfJoinD.getSelectedItem().equals("Day") || studentDateOfJoinM.getSelectedItem().equals("Month") || studentDateOfJoinY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of join!");
            return;
        } else {

            try {
                //connect db
                con = Connect.connect();
                //checking if id is exist
                String checkId = "SELECT student_id FROM students WHERE student_id='" + studentId.getText() + "'";

                pst = con.prepareStatement(checkId);
                result = pst.executeQuery();
                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "Student ID already exist! Please choose another id!");
                    return;
                }

                //inserting data
                String addStudent = "INSERT INTO students(student_id,gender,first_name,last_name,mobile,email,address,date_of_birth,date_of_join,reception_remarks) VALUES('" + studentId.getText() + "','" + studentGender.getSelectedItem() + "','" + studentFirstName.getText() + "','" + studentLastName.getText() + "','" + studentMobile.getText() + "','" + studentEmail.getText() + "','" + studentAddress.getText() + "','" + studentBirthD.getSelectedItem() + "-" + studentBirthM.getSelectedItem() + "-" + studentBirthY.getSelectedItem() + "', '" + studentDateOfJoinD.getSelectedItem() + "-" + studentDateOfJoinM.getSelectedItem() + "-" + studentDateOfJoinY.getSelectedItem() + "','" + receptionRemarks.getText() + "' )";
                pst = con.prepareStatement(addStudent);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New student seccessfuly added!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddStudentsByReception.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        reset();
    }//GEN-LAST:event_studentSaveBtnActionPerformed

    private void studentSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSearchBtnActionPerformed
        this.dispose();
        SearchStudentsByReception studentsInfo = new SearchStudentsByReception();
        studentsInfo.setVisible(true);
    }//GEN-LAST:event_studentSearchBtnActionPerformed

    private void studentCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_studentCancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentsByReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentsByReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentsByReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentsByReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentsByReception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextArea adminRemarks;
    protected javax.swing.JTextField dateOfBirthStudentInfo;
    protected javax.swing.JTextField dateOfJoinStudentInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JTextArea receptionRemarks;
    protected javax.swing.JTextField studentAddress;
    protected javax.swing.JComboBox<String> studentBirthD;
    protected javax.swing.JComboBox<String> studentBirthM;
    protected javax.swing.JComboBox<String> studentBirthY;
    private javax.swing.JButton studentCancelBtn;
    protected javax.swing.JComboBox<String> studentDateOfJoinD;
    protected javax.swing.JComboBox<String> studentDateOfJoinM;
    protected javax.swing.JComboBox<String> studentDateOfJoinY;
    protected javax.swing.JTextField studentEmail;
    protected javax.swing.JTextField studentFirstName;
    protected javax.swing.JComboBox<String> studentGender;
    protected javax.swing.JTextField studentId;
    protected javax.swing.JTextField studentLastName;
    protected javax.swing.JTextField studentMobile;
    private javax.swing.JButton studentNewBtn;
    private javax.swing.JButton studentSaveBtn;
    private javax.swing.JButton studentSearchBtn;
    private javax.swing.JButton studentUpdateBtn;
    protected javax.swing.JTextArea teacherRemarks;
    // End of variables declaration//GEN-END:variables
}
