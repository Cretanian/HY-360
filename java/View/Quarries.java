/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import JavaFiles.View_Controller;

/**
 *
 * @author User
 */
public class Quarries extends javax.swing.JFrame {
    View_Controller controller;
    /**
     * Creates new form Quarries
     */
    public Quarries() {
        initComponents();
    }
    public Quarries(View_Controller controller){
        initComponents();
        this.controller = controller;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_title = new javax.swing.JPanel();
        l_quarries = new javax.swing.JLabel();
        p_content = new javax.swing.JPanel();
        b_max_min_mean_wage = new javax.swing.JButton();
        b_total_increase = new javax.swing.JButton();
        b_mean_increase = new javax.swing.JButton();
        b_employee_info = new javax.swing.JButton();
        b_payment_state = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_quarries.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        l_quarries.setText("Ερωτήσεις");
        l_quarries.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_quarries.setMaximumSize(new java.awt.Dimension(80, 40));
        l_quarries.setMinimumSize(new java.awt.Dimension(80, 40));

        javax.swing.GroupLayout p_titleLayout = new javax.swing.GroupLayout(p_title);
        p_title.setLayout(p_titleLayout);
        p_titleLayout.setHorizontalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_titleLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(l_quarries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_titleLayout.setVerticalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_quarries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_content.setBackground(java.awt.Color.lightGray);
        p_content.setForeground(java.awt.Color.blue);

        b_max_min_mean_wage.setBackground(new java.awt.Color(222, 222, 222));
        b_max_min_mean_wage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_max_min_mean_wage.setForeground(new java.awt.Color(0, 0, 0));
        b_max_min_mean_wage.setText("Μεγιστος, ελαχιστον και μεσος μισθος ανα κατηγορια προσωπικου");
        b_max_min_mean_wage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_max_min_mean_wage.setName(""); // NOI18N
        b_max_min_mean_wage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_max_min_mean_wageActionPerformed(evt);
            }
        });

        b_total_increase.setBackground(new java.awt.Color(222, 222, 222));
        b_total_increase.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_total_increase.setForeground(new java.awt.Color(0, 0, 0));
        b_total_increase.setText("Συνολικό ύψος μισθοδοσίας ανά κατηγορία προσωπικού");
        b_total_increase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_total_increase.setName(""); // NOI18N
        b_total_increase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_total_increaseActionPerformed(evt);
            }
        });

        b_mean_increase.setBackground(new java.awt.Color(222, 222, 222));
        b_mean_increase.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_mean_increase.setForeground(new java.awt.Color(0, 0, 0));
        b_mean_increase.setText("Μέση αύξηση μισθών και επιδομάτων ανά χρονική περίοδο");
        b_mean_increase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_mean_increase.setName(""); // NOI18N
        b_mean_increase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mean_increaseActionPerformed(evt);
            }
        });

        b_employee_info.setBackground(new java.awt.Color(222, 222, 222));
        b_employee_info.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_employee_info.setForeground(new java.awt.Color(0, 0, 0));
        b_employee_info.setText("Στοιχεία και μισθοδοσία συγκεκριμένου υπαλλήλου");
        b_employee_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_employee_info.setName(""); // NOI18N
        b_employee_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_employee_infoActionPerformed(evt);
            }
        });

        b_payment_state.setBackground(new java.awt.Color(222, 222, 222));
        b_payment_state.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_payment_state.setForeground(new java.awt.Color(0, 0, 0));
        b_payment_state.setText("Κατάσταση μισθοδοσίας ανά συγκεκριμένο χρονικο διαστημα");
        b_payment_state.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_payment_state.setName(""); // NOI18N
        b_payment_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_payment_stateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(222, 222, 222));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Αρχική Σελίδα");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_mean_increase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_employee_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_total_increase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_contentLayout.createSequentialGroup()
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_max_min_mean_wage, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_payment_state, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_payment_state, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_max_min_mean_wage, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_mean_increase, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_employee_info, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_total_increase, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_max_min_mean_wageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_max_min_mean_wageActionPerformed
        controller.maxMinMeanClicked();
    }//GEN-LAST:event_b_max_min_mean_wageActionPerformed

    private void b_payment_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_payment_stateActionPerformed
        controller.paymentStateClicked();
    }//GEN-LAST:event_b_payment_stateActionPerformed

    private void b_total_increaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_total_increaseActionPerformed
        controller.mean_height();
    }//GEN-LAST:event_b_total_increaseActionPerformed

    private void b_mean_increaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mean_increaseActionPerformed
        controller.meanIncreaseClicked();
    }//GEN-LAST:event_b_mean_increaseActionPerformed

    private void b_employee_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_employee_infoActionPerformed
        controller.employeePaymentClicked();
    }//GEN-LAST:event_b_employee_infoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.home();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_employee_info;
    private javax.swing.JButton b_max_min_mean_wage;
    private javax.swing.JButton b_mean_increase;
    private javax.swing.JButton b_payment_state;
    private javax.swing.JButton b_total_increase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l_quarries;
    private javax.swing.JPanel p_content;
    private javax.swing.JPanel p_title;
    // End of variables declaration//GEN-END:variables
}
