/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import EmployeeClasses.Employee;
import EmployeeClasses.Permanent_Employee;
import JavaFiles.View_Controller;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Max_min_mean extends javax.swing.JFrame {
    View_Controller controller;
    /**
     * Creates new form Max_min_mean
     */
    public Max_min_mean(View_Controller controller) {
        initComponents();
        this.controller = controller;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_content = new javax.swing.JPanel();
        b_back = new javax.swing.JButton();
        l_first_name = new javax.swing.JLabel();
        b_done = new javax.swing.JButton();
        l_payment = new javax.swing.JLabel();
        cb_payment_type = new javax.swing.JComboBox<>();
        l_payment1 = new javax.swing.JLabel();
        cb_role = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_content.setBackground(java.awt.Color.lightGray);
        p_content.setForeground(java.awt.Color.blue);

        b_back.setBackground(new java.awt.Color(222, 222, 222));
        b_back.setForeground(new java.awt.Color(0, 0, 0));
        b_back.setText("Ακύρωση");
        b_back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_back.setName(""); // NOI18N
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        l_first_name.setBackground(new java.awt.Color(2, 2, 2));
        l_first_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_first_name.setForeground(java.awt.Color.black);
        l_first_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name.setMinimumSize(new java.awt.Dimension(80, 40));

        b_done.setBackground(new java.awt.Color(222, 222, 222));
        b_done.setForeground(new java.awt.Color(0, 0, 0));
        b_done.setText("ΟΚ");
        b_done.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_done.setName(""); // NOI18N
        b_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_doneActionPerformed(evt);
            }
        });

        l_payment.setBackground(new java.awt.Color(2, 2, 2));
        l_payment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l_payment.setForeground(java.awt.Color.black);
        l_payment.setText("Είδος μισθού:");
        l_payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_payment.setMaximumSize(new java.awt.Dimension(80, 40));
        l_payment.setMinimumSize(new java.awt.Dimension(80, 40));

        cb_payment_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Μέγιστος", "Ελάχιστος", "Μέσος" }));
        cb_payment_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_payment_typeActionPerformed(evt);
            }
        });

        l_payment1.setBackground(new java.awt.Color(2, 2, 2));
        l_payment1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l_payment1.setForeground(java.awt.Color.black);
        l_payment1.setText("Κατηγορία:");
        l_payment1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_payment1.setMaximumSize(new java.awt.Dimension(80, 40));
        l_payment1.setMinimumSize(new java.awt.Dimension(80, 40));

        cb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διοικιτικός", "Διδακτικός" }));
        cb_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_roleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_payment1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_payment_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_done, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_payment_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_payment1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_done, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_doneActionPerformed
        Employee employee = new Permanent_Employee();
        if(cb_role.getSelectedIndex() == 0)
            employee.role = Employee.Role.ADMINISTRATIVE;
        else
            employee.role = Employee.Role.EDUCATIVE;
        
        try {
            controller.maxMinMeanSeach(employee, cb_payment_type.getSelectedIndex());
        } catch (SQLException ex) {
            Logger.getLogger(Max_min_mean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    }//GEN-LAST:event_b_doneActionPerformed

    private void cb_payment_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_payment_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_payment_typeActionPerformed

    private void cb_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_roleActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        controller.home();
    }//GEN-LAST:event_b_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_done;
    private javax.swing.JComboBox<String> cb_payment_type;
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JLabel l_first_name;
    private javax.swing.JLabel l_payment;
    private javax.swing.JLabel l_payment1;
    private javax.swing.JPanel p_content;
    // End of variables declaration//GEN-END:variables
}
