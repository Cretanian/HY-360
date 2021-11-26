/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import JavaFiles.View_Controller;
import SalaryClasses.Salary;

/**
 * @author Zack
 */
public class Alter_Payments extends javax.swing.JFrame {
    enum Payments{ ADMINISTRATIVE, EDUTIVE, LIBRARY, RESEARCH};
    Payments payemnt;
    
    View_Controller controller;
    
    public Alter_Payments() {
        initComponents();
    }
    public Alter_Payments(View_Controller controller) {
        initComponents();
        this.controller = controller;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_fill_in = new javax.swing.JLabel();
        p_content = new javax.swing.JPanel();
        b_back = new javax.swing.JButton();
        l_first_name = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_amount = new javax.swing.JTextPane();
        b_done = new javax.swing.JButton();
        l_amount = new javax.swing.JLabel();
        l_payment = new javax.swing.JLabel();
        cb_payment = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_fill_in.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_fill_in.setText("Αλλαγή βασικών μισθών και επιδομάτων:");
        l_fill_in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_fill_in.setMaximumSize(new java.awt.Dimension(80, 40));
        l_fill_in.setMinimumSize(new java.awt.Dimension(80, 40));

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

        jScrollPane3.setViewportView(tf_amount);

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

        l_amount.setBackground(new java.awt.Color(2, 2, 2));
        l_amount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l_amount.setForeground(java.awt.Color.black);
        l_amount.setText("Ποσό:");
        l_amount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_amount.setMaximumSize(new java.awt.Dimension(80, 40));
        l_amount.setMinimumSize(new java.awt.Dimension(80, 40));

        l_payment.setBackground(new java.awt.Color(2, 2, 2));
        l_payment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        l_payment.setForeground(java.awt.Color.black);
        l_payment.setText("Πληρωμή:");
        l_payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_payment.setMaximumSize(new java.awt.Dimension(80, 40));
        l_payment.setMinimumSize(new java.awt.Dimension(80, 40));

        cb_payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Μισθός Διοικιτικού", "Μισθός Διδακτικού", "Επίδομα Έρευνας", "Επίδομα Βιβλιοθήκης\\" }));
            cb_payment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cb_paymentActionPerformed(evt);
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
                        .addComponent(l_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(42, 42, 42)
                    .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(p_contentLayout.createSequentialGroup()
                            .addComponent(b_done, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(16, Short.MAX_VALUE))
            );
            p_contentLayout.setVerticalGroup(
                p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p_contentLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_done, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(l_fill_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(l_fill_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void b_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_doneActionPerformed
        int selection = cb_payment.getSelectedIndex();
        int amount = Integer.parseInt(tf_amount.getText());
        amount = amount;
        
        
        controller.alterPayments(amount ,selection);
        return;
    }//GEN-LAST:event_b_doneActionPerformed

    private void cb_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_paymentActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        controller.home();
    }//GEN-LAST:event_b_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_done;
    private javax.swing.JComboBox<String> cb_payment;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l_amount;
    private javax.swing.JLabel l_fill_in;
    private javax.swing.JLabel l_first_name;
    private javax.swing.JLabel l_payment;
    private javax.swing.JPanel p_content;
    private javax.swing.JTextPane tf_amount;
    // End of variables declaration//GEN-END:variables
}
