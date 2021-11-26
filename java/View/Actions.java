/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import JavaFiles.View_Controller;

/**
 *
 * @author Zack
 */
public class Actions extends javax.swing.JFrame {
    View_Controller controller;
    
    public Actions() {
        initComponents();
    }
    public Actions(View_Controller controller){
        initComponents();
        this.controller = controller;
    }           
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_title = new javax.swing.JPanel();
        l_actions = new javax.swing.JLabel();
        p_content = new javax.swing.JPanel();
        b_hire_contracted = new javax.swing.JButton();
        b_hire_permanent = new javax.swing.JButton();
        b_update_employee = new javax.swing.JButton();
        b_alter_salary_allowance = new javax.swing.JButton();
        b_fire_employee = new javax.swing.JButton();
        b_promotion = new javax.swing.JButton();
        b_pay_employees = new javax.swing.JButton();
        b_newContract = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_actions.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        l_actions.setText("Διαδικασίες");
        l_actions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_actions.setMaximumSize(new java.awt.Dimension(80, 40));
        l_actions.setMinimumSize(new java.awt.Dimension(80, 40));

        javax.swing.GroupLayout p_titleLayout = new javax.swing.GroupLayout(p_title);
        p_title.setLayout(p_titleLayout);
        p_titleLayout.setHorizontalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_titleLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(l_actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_titleLayout.setVerticalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_content.setBackground(java.awt.Color.lightGray);
        p_content.setForeground(java.awt.Color.blue);

        b_hire_contracted.setBackground(new java.awt.Color(222, 222, 222));
        b_hire_contracted.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_hire_contracted.setForeground(new java.awt.Color(0, 0, 0));
        b_hire_contracted.setText("Πρόσληψη συμβασιούχου εργαζομένου");
        b_hire_contracted.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_hire_contracted.setName(""); // NOI18N
        b_hire_contracted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hire_contractedActionPerformed(evt);
            }
        });

        b_hire_permanent.setBackground(new java.awt.Color(222, 222, 222));
        b_hire_permanent.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_hire_permanent.setForeground(new java.awt.Color(0, 0, 0));
        b_hire_permanent.setText("Πρόσληψη μόνιμου εργαζομένου");
        b_hire_permanent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_hire_permanent.setName(""); // NOI18N
        b_hire_permanent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hire_permanentActionPerformed(evt);
            }
        });

        b_update_employee.setBackground(new java.awt.Color(222, 222, 222));
        b_update_employee.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_update_employee.setForeground(new java.awt.Color(0, 0, 0));
        b_update_employee.setText("Αλλαγή δεδομένων εργαζομένου");
        b_update_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_update_employee.setName(""); // NOI18N
        b_update_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_update_employeeActionPerformed(evt);
            }
        });

        b_alter_salary_allowance.setBackground(new java.awt.Color(222, 222, 222));
        b_alter_salary_allowance.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_alter_salary_allowance.setForeground(new java.awt.Color(0, 0, 0));
        b_alter_salary_allowance.setText("Αλλαγή βασικών μισθών και επιδομάτων");
        b_alter_salary_allowance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_alter_salary_allowance.setName(""); // NOI18N
        b_alter_salary_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alter_salary_allowanceActionPerformed(evt);
            }
        });

        b_fire_employee.setBackground(new java.awt.Color(222, 222, 222));
        b_fire_employee.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_fire_employee.setForeground(new java.awt.Color(0, 0, 0));
        b_fire_employee.setText("Απόλυση εργαζομένου");
        b_fire_employee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_fire_employee.setName(""); // NOI18N
        b_fire_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fire_employeeActionPerformed(evt);
            }
        });

        b_promotion.setBackground(new java.awt.Color(222, 222, 222));
        b_promotion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_promotion.setForeground(new java.awt.Color(0, 0, 0));
        b_promotion.setText("Προαγωγή συμβασιούχου εργαζομένου");
        b_promotion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_promotion.setName(""); // NOI18N
        b_promotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_promotionActionPerformed(evt);
            }
        });

        b_pay_employees.setBackground(new java.awt.Color(222, 222, 222));
        b_pay_employees.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_pay_employees.setForeground(new java.awt.Color(0, 0, 0));
        b_pay_employees.setText("Πληρωμή εργαζομένων");
        b_pay_employees.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_pay_employees.setName(""); // NOI18N
        b_pay_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pay_employeesActionPerformed(evt);
            }
        });

        b_newContract.setBackground(new java.awt.Color(222, 222, 222));
        b_newContract.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b_newContract.setForeground(new java.awt.Color(0, 0, 0));
        b_newContract.setText("Σύναψη νέου συμβολαίου");
        b_newContract.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_newContract.setName(""); // NOI18N
        b_newContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_newContractActionPerformed(evt);
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
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_contentLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(b_hire_permanent, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_hire_contracted, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_contentLayout.createSequentialGroup()
                                .addComponent(b_update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_alter_salary_allowance, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p_contentLayout.createSequentialGroup()
                                .addComponent(b_fire_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_promotion, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_newContract, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_pay_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_hire_contracted, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_hire_permanent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_alter_salary_allowance, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_update_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_promotion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_fire_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_pay_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_newContract, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Trigers when: Προσληψη is clicked
    private void b_hire_permanentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hire_permanentActionPerformed
        System.out.println("Hire Clicked");
        controller.hirePermanentClicked();
    }//GEN-LAST:event_b_hire_permanentActionPerformed

    //Trigers when: Συμβαση is clicked
    private void b_hire_contractedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hire_contractedActionPerformed
        controller.hireContractedClicked();
    }//GEN-LAST:event_b_hire_contractedActionPerformed

    //Trigers when: Αλλαγη δεδομενων is clicked.
    private void b_update_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_update_employeeActionPerformed
        controller.alterEmployeeDataClicked();
    }//GEN-LAST:event_b_update_employeeActionPerformed

    //Trigers when: Αλλαγη μισθων και επιδοματων is clicked.
    private void b_alter_salary_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alter_salary_allowanceActionPerformed
        controller.alterPaymentsClicked();
    }//GEN-LAST:event_b_alter_salary_allowanceActionPerformed
    
    //Trigers when: Απολυση εργαζομενου is clicked.
    private void b_fire_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fire_employeeActionPerformed
        controller.fireEmployeeClicked();
    }//GEN-LAST:event_b_fire_employeeActionPerformed

    //Trigers when: Προαγωγη συμβασιουχου is clicked.
    private void b_promotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_promotionActionPerformed
        controller.promoteContractedClicked();
    }//GEN-LAST:event_b_promotionActionPerformed

    private void b_newContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_newContractActionPerformed
        controller.setNewContractClicked();
    }//GEN-LAST:event_b_newContractActionPerformed

    private void b_pay_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_pay_employeesActionPerformed
        controller.payEmployeesClicked();
    // TODO add your handling code here:
    }//GEN-LAST:event_b_pay_employeesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.home();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alter_salary_allowance;
    private javax.swing.JButton b_fire_employee;
    private javax.swing.JButton b_hire_contracted;
    private javax.swing.JButton b_hire_permanent;
    private javax.swing.JButton b_newContract;
    private javax.swing.JButton b_pay_employees;
    private javax.swing.JButton b_promotion;
    private javax.swing.JButton b_update_employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l_actions;
    private javax.swing.JPanel p_content;
    private javax.swing.JPanel p_title;
    // End of variables declaration//GEN-END:variables
}
