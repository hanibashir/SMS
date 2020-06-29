package PMS;

/**
 *
 * @author Hani
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        admin = new javax.swing.JMenu();
        staffMenuItem = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        usersMenuItem = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        studentsMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        searchPassword = new javax.swing.JMenuItem();
        changePassword = new javax.swing.JMenuItem();
        reception = new javax.swing.JMenu();
        studentForReceptionMenuItem = new javax.swing.JMenuItem();
        searchReception = new javax.swing.JMenuItem();
        changePassReception = new javax.swing.JMenuItem();
        teachers = new javax.swing.JMenu();
        studentsTeachers = new javax.swing.JMenuItem();
        changePassTeachers = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perjuf Manage System - Home");
        setBackground(new java.awt.Color(0, 51, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(500, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(219, 255, 199));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PMS/asmara.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        admin.setText("Admin");

        staffMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        staffMenuItem.setText("Add Staff");
        staffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffMenuItemActionPerformed(evt);
            }
        });
        admin.add(staffMenuItem);

        jMenuItem6.setText("Search Staff");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        admin.add(jMenuItem6);

        jMenuItem3.setText("Delete Staff");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        admin.add(jMenuItem3);

        usersMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        usersMenuItem.setText("Add Users");
        usersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersMenuItemActionPerformed(evt);
            }
        });
        admin.add(usersMenuItem);

        jMenuItem5.setText("Delete Users");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        admin.add(jMenuItem5);

        studentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        studentsMenuItem.setText("Add Students");
        studentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsMenuItemActionPerformed(evt);
            }
        });
        admin.add(studentsMenuItem);

        jMenuItem1.setText("Search Students");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        admin.add(jMenuItem1);

        jMenuItem2.setText("Delete Students");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        admin.add(jMenuItem2);

        searchPassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        searchPassword.setText("Search Password");
        searchPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPasswordActionPerformed(evt);
            }
        });
        admin.add(searchPassword);

        changePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        admin.add(changePassword);

        jMenuBar1.add(admin);

        reception.setText("Reception");

        studentForReceptionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        studentForReceptionMenuItem.setText("Add Students");
        studentForReceptionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentForReceptionMenuItemActionPerformed(evt);
            }
        });
        reception.add(studentForReceptionMenuItem);

        searchReception.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        searchReception.setText("Search Students");
        searchReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReceptionActionPerformed(evt);
            }
        });
        reception.add(searchReception);

        changePassReception.setText("Change Password");
        changePassReception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassReceptionActionPerformed(evt);
            }
        });
        reception.add(changePassReception);

        jMenuBar1.add(reception);

        teachers.setText("Teachers");

        studentsTeachers.setText("Search Student");
        studentsTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsTeachersActionPerformed(evt);
            }
        });
        teachers.add(studentsTeachers);

        changePassTeachers.setText("Change Password");
        changePassTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassTeachersActionPerformed(evt);
            }
        });
        teachers.add(changePassTeachers);

        jMenuBar1.add(teachers);

        about.setText("About");

        helpMenuItem.setText("Help");
        helpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuItemActionPerformed(evt);
            }
        });
        about.add(helpMenuItem);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePassTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassTeachersActionPerformed
        ChangePassword changePasswordTeachers = new ChangePassword();
        changePasswordTeachers.setVisible(true);
    }//GEN-LAST:event_changePassTeachersActionPerformed

    private void usersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersMenuItemActionPerformed
        AddUsers user = new AddUsers();
        user.setVisible(true);
    }//GEN-LAST:event_usersMenuItemActionPerformed

    private void staffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffMenuItemActionPerformed
        AddStaff staff = new AddStaff();
        staff.setVisible(true);
    }//GEN-LAST:event_staffMenuItemActionPerformed

    private void studentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsMenuItemActionPerformed
        AddStudents student = new AddStudents();
        student.setVisible(true);
    }//GEN-LAST:event_studentsMenuItemActionPerformed

    private void searchPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPasswordActionPerformed
        SearchUserPassword search = new SearchUserPassword();
        search.setVisible(true);
    }//GEN-LAST:event_searchPasswordActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        ChangePassword ChangePassword = new ChangePassword();
        ChangePassword.setVisible(true);
    }//GEN-LAST:event_changePasswordActionPerformed

    private void studentForReceptionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentForReceptionMenuItemActionPerformed
        AddStudentsByReception addStudents = new AddStudentsByReception();
        addStudents.setVisible(true);
    }//GEN-LAST:event_studentForReceptionMenuItemActionPerformed

    private void changePassReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassReceptionActionPerformed
        ChangePassword changePasswordReception = new ChangePassword();
        changePasswordReception.setVisible(true);
    }//GEN-LAST:event_changePassReceptionActionPerformed

    private void searchReceptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReceptionActionPerformed
        SearchStudentsByReception search = new SearchStudentsByReception();
        search.setVisible(true);
    }//GEN-LAST:event_searchReceptionActionPerformed

    private void studentsTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsTeachersActionPerformed
        SearchStudentsByTeacher search = new SearchStudentsByTeacher();
        search.setVisible(true);
    }//GEN-LAST:event_studentsTeachersActionPerformed

    private void helpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuItemActionPerformed

        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_helpMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SearchStudents searchStudents = new SearchStudents();
        searchStudents.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        DeleteStaff deleteStaff = new DeleteStaff();
        deleteStaff.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        DeleteUser deleteUser = new DeleteUser();
        deleteUser.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        DeleteStudent deleteStudent = new DeleteStudent();
        deleteStudent.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        StaffInfo searchStaff = new StaffInfo();
        searchStaff.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setEnabled(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenu about;
    protected javax.swing.JMenu admin;
    private javax.swing.JMenuItem changePassReception;
    private javax.swing.JMenuItem changePassTeachers;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JMenu reception;
    private javax.swing.JMenuItem searchPassword;
    private javax.swing.JMenuItem searchReception;
    private javax.swing.JMenuItem staffMenuItem;
    private javax.swing.JMenuItem studentForReceptionMenuItem;
    private javax.swing.JMenuItem studentsMenuItem;
    private javax.swing.JMenuItem studentsTeachers;
    protected javax.swing.JMenu teachers;
    private javax.swing.JMenuItem usersMenuItem;
    // End of variables declaration//GEN-END:variables
}
