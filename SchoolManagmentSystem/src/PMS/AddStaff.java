package PMS;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AddStaff extends javax.swing.JFrame {

    //declaire sql varibles
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    int saveWithoutImage;
    int SaveWithoutMobile;
    int saveWithoutEmail;
    byte[] by = null;

    public AddStaff() {
        initComponents();
    }

    protected void reset() {
        staffID.setText("");
        staffGender.setSelectedIndex(0);
        staffFirstName.setText("");
        staffLastName.setText("");
        staffMobile.setText("");
        staffEmail.setText("");
        staffAddress.setText("");
        dateOfJoinStaffInfo.setText("");
        dateOfJoinStaffD.setSelectedIndex(0);
        dateOfJoinStaffM.setSelectedIndex(0);
        dateOfJoinStaffY.setSelectedIndex(0);
        staffSpecialization.setSelectedIndex(0);
        lImage.setIcon(null);
        imagePath.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FemaleMale = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staffID = new javax.swing.JTextField();
        staffFirstName = new javax.swing.JTextField();
        staffLastName = new javax.swing.JTextField();
        staffMobile = new javax.swing.JTextField();
        staffEmail = new javax.swing.JTextField();
        staffAddress = new javax.swing.JTextField();
        staffSpecialization = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        dateOfJoinStaffD = new javax.swing.JComboBox<>();
        dateOfJoinStaffM = new javax.swing.JComboBox<>();
        dateOfJoinStaffY = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        staffGender = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        dateOfJoinStaffInfo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lImage = new javax.swing.JLabel();
        imageBtn = new javax.swing.JButton();
        imagePath = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PMS - Add Staff");
        setLocation(new java.awt.Point(300, 40));
        setResizable(false);

        jLabel1.setText("Staff ID");

        jLabel2.setText("Gender");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Mobile");

        jLabel6.setText("E-Mail");

        jLabel7.setText("Address");

        jLabel8.setText("Date Of Join");

        jLabel9.setText("Position");

        staffSpecialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Reception", "Teacher" }));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        dateOfJoinStaffD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        dateOfJoinStaffM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        dateOfJoinStaffY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2016", "2017", "2018", "2019", "2020" }));
        dateOfJoinStaffY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfJoinStaffYActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        staffGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Female", "Male", "Other" }));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        dateOfJoinStaffInfo.setEditable(false);

        jLabel10.setText("Staff Info Date Of Join");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane1.setLayer(lImage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        imageBtn.setText("Edit Image");
        imageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Image URL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(staffFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(staffAddress)
                                .addComponent(staffEmail)
                                .addComponent(staffMobile)
                                .addComponent(staffLastName)
                                .addComponent(staffID))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateOfJoinStaffD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateOfJoinStaffM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dateOfJoinStaffY, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(staffGender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateOfJoinStaffInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(114, 114, 114))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(staffSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newBtn))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(addBtn))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(updateBtn))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchBtn)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(staffMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteBtn)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(imagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addGap(18, 18, 18)
                        .addComponent(imageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dateOfJoinStaffD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfJoinStaffM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfJoinStaffY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfJoinStaffInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(staffSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        

        if (staffID.getText().equals("") || staffFirstName.getText().equals("") || staffLastName.getText().equals("") || staffAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all required fields!");
            return;
        } else if (staffGender.getSelectedItem().equals("Choose")) {
            JOptionPane.showMessageDialog(null, "Please choose staff gender!");
            return;
        } else if (dateOfJoinStaffD.getSelectedItem().equals("Day") || dateOfJoinStaffM.getSelectedItem().equals("Month") || dateOfJoinStaffY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of join!");
            return;
        } else if (staffSpecialization.getSelectedItem().equals("Choose")) {
            JOptionPane.showConfirmDialog(null, "Please choose staff position!");
            return;
        } else if (staffMobile.getText().equals("") && staffEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter mobile no. or E-Mail?!");
            return;
        } else {

            try {
                con = Connect.connect();
                //checking if id is exist
                String checkId = "SELECT staff_id FROM staff WHERE staff_id='" + staffID.getText() + "'";

                pst = con.prepareStatement(checkId);
                result = pst.executeQuery();
                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "Staff ID not exists!");
                    return;
                }

                //updating staff info
                String update = "UPDATE staff SET image=?, gender='" + staffGender.getSelectedItem() + "', first_name='" + staffFirstName.getText() + "',last_name='" + staffLastName.getText() + "',mobile='" + staffMobile.getText() + "',email='" + staffEmail.getText() + "',address='" + staffAddress.getText() + "', date_of_join='" + dateOfJoinStaffD.getSelectedItem() + "-" + dateOfJoinStaffM.getSelectedItem() + "-" + dateOfJoinStaffY.getSelectedItem() + "',  position='" + staffSpecialization.getSelectedItem() + "',staff_id='" + staffID.getText() + "' WHERE staff_id='" + staffID.getText() + "' ";

                pst = con.prepareStatement(update);
                pst.setBytes(1, by);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Staff info updated!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddStaff.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        reset();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void dateOfJoinStaffYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfJoinStaffYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfJoinStaffYActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        if (staffID.getText().equals("") || staffFirstName.getText().equals("") || staffLastName.getText().equals("") || staffAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all requered fields!");
            return;
        } else if (staffGender.getSelectedItem().equals("Choose")) {
            JOptionPane.showMessageDialog(null, "Please choose staff gender!");
            return;
        } else if (dateOfJoinStaffD.getSelectedItem().equals("Day") || dateOfJoinStaffM.getSelectedItem().equals("Month") || dateOfJoinStaffY.getSelectedItem().equals("Year")) {
            JOptionPane.showMessageDialog(null, "Please enter date of join!");
            return;
        } else if (staffSpecialization.getSelectedItem().equals("Choose")) {
            JOptionPane.showConfirmDialog(null, "Please choose staff position!");
            return;
        } else if (staffMobile.getText().equals("") && staffEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter mobile no. or E-Mail?!");
            return;
        } else {
            try {
                //connect db
                con = Connect.connect();
                //checking if id is exist
                String checkId = "SELECT staff_id FROM staff WHERE staff_id='" + staffID.getText() + "'";

                pst = con.prepareStatement(checkId);
                result = pst.executeQuery();
                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "Staff ID already exist! Please choose another id!");
                    return;
                }

                //inserting data
                String add = "INSERT INTO staff(image,gender,first_name,last_name,mobile,email,address,date_of_join,position,staff_id) VALUES(?,'" + staffGender.getSelectedItem() + "','" + staffFirstName.getText() + "','" + staffLastName.getText() + "','" + staffMobile.getText() + "','" + staffEmail.getText() + "','" + staffAddress.getText() + "','" + dateOfJoinStaffD.getSelectedItem() + "-" + dateOfJoinStaffM.getSelectedItem() + "-" + dateOfJoinStaffY.getSelectedItem() + "',  '" + staffSpecialization.getSelectedItem() + "','" + staffID.getText() + "')";
                pst = con.prepareStatement(add);
                pst.setBytes(1, by);
                pst.execute();
                JOptionPane.showMessageDialog(null, "New staff added seccessfuly!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return;
            }
        }
        reset();
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DeleteStaff deleteStaff = new DeleteStaff();
        deleteStaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        reset();
    }//GEN-LAST:event_newBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();


    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        this.hide();
        StaffInfo staffInfo = new StaffInfo();
        staffInfo.setVisible(true);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void imageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBtnActionPerformed
        JFileChooser image = new JFileChooser();
        image.showOpenDialog(null);
        File file = image.getSelectedFile();
        String imagePath = file.getAbsolutePath();
        this.imagePath.setText(imagePath);

        try {
            File file2 = new File(imagePath);
            FileInputStream fis = new FileInputStream(file2);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] baytes = new byte[1024];
            for (int readno; (readno = fis.read(baytes)) != -1;) {
                baos.write(baytes, 0, readno);
            }
            by = baos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_imageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup FemaleMale;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    protected javax.swing.JComboBox<String> dateOfJoinStaffD;
    protected javax.swing.JTextField dateOfJoinStaffInfo;
    protected javax.swing.JComboBox<String> dateOfJoinStaffM;
    protected javax.swing.JComboBox<String> dateOfJoinStaffY;
    private javax.swing.JButton deleteBtn;
    protected javax.swing.JButton imageBtn;
    protected javax.swing.JTextField imagePath;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel lImage;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton searchBtn;
    protected javax.swing.JTextField staffAddress;
    protected javax.swing.JTextField staffEmail;
    protected javax.swing.JTextField staffFirstName;
    protected javax.swing.JComboBox<String> staffGender;
    protected javax.swing.JTextField staffID;
    protected javax.swing.JTextField staffLastName;
    protected javax.swing.JTextField staffMobile;
    protected javax.swing.JComboBox<String> staffSpecialization;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
