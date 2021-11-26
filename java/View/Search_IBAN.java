/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import EmployeeClasses.*;
import JavaFiles.View_Controller;

/**
 *
 * @author Zack
 */
public class Search_IBAN extends javax.swing.JFrame {
    public enum State{ ALTER, FIRE, PROMOTE, NEW_CONTRACT, FIND_PAYMENT}; public State state;
    View_Controller controller;

    public Search_IBAN() {
        initComponents();
    }
    public Search_IBAN(View_Controller controller){
        initComponents();
        this.controller = controller;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_content = new javax.swing.JPanel();
        b_back = new javax.swing.JButton();
        l_first_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_iban = new javax.swing.JTextPane();
        b_search = new javax.swing.JButton();
        l_role = new javax.swing.JLabel();
        cb_employee_type = new javax.swing.JComboBox<>();
        l_role1 = new javax.swing.JLabel();
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
        l_first_name.setText("IBAN:");
        l_first_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane1.setViewportView(tf_iban);

        b_search.setBackground(new java.awt.Color(222, 222, 222));
        b_search.setForeground(new java.awt.Color(0, 0, 0));
        b_search.setText("Αναζήτηση");
        b_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_search.setName(""); // NOI18N
        b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchActionPerformed(evt);
            }
        });

        l_role.setBackground(new java.awt.Color(2, 2, 2));
        l_role.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_role.setForeground(java.awt.Color.black);
        l_role.setText("Είδος εργαζομένου:");
        l_role.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_role.setMaximumSize(new java.awt.Dimension(80, 40));
        l_role.setMinimumSize(new java.awt.Dimension(80, 40));

        cb_employee_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent", "Contracted" }));

        l_role1.setBackground(new java.awt.Color(2, 2, 2));
        l_role1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_role1.setForeground(java.awt.Color.black);
        l_role1.setText("Ρόλος:");
        l_role1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_role1.setMaximumSize(new java.awt.Dimension(80, 40));
        l_role1.setMinimumSize(new java.awt.Dimension(80, 40));

        cb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrative", "Educative" }));

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_contentLayout.createSequentialGroup()
                        .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_contentLayout.createSequentialGroup()
                        .addComponent(l_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_employee_type, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addComponent(l_role1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_back)))
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_first_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_employee_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_role, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_role, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_role1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(294, 294, 294))
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
                .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Triggers when: Αναζητηση is clicked
    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        String iban;
        iban = tf_iban.getText();
        String type, role;
        type = cb_employee_type.getSelectedItem().toString();
        role = cb_role.getSelectedItem().toString();
        
        Employee employee;
        
        if(type.equals("Permanent"))
            employee = new Permanent_Employee();
        else{
            employee = new Contracted_Employee();
        }
        
        if(role.equals("Administrative"))
            employee.role = Employee.Role.ADMINISTRATIVE;
        else
            employee.role = Employee.Role.EDUCATIVE;
        
        employee.iban = iban;
        
        controller.searchIBanClicked(state, employee);
        
        return;
    }//GEN-LAST:event_b_searchActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        controller.home();
    }//GEN-LAST:event_b_backActionPerformed

    public void prepareForChange(){
        cb_employee_type.setVisible(false); l_role.setVisible(false);
        cb_role.setVisible(false); l_role1.setVisible(false);
    }
    public void hideEmployeeSelection(){
        cb_employee_type.setVisible(false); l_role.setVisible(false);
        cb_role.setVisible(false); l_role1.setVisible(false);
    }
    
    public void typeSetSelected(int index){
        cb_employee_type.setSelectedIndex(index);
    }
    public void typeSetEnabled(boolean option){
        cb_employee_type.enable(option);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_search;
    private javax.swing.JComboBox<String> cb_employee_type;
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_first_name;
    private javax.swing.JLabel l_role;
    private javax.swing.JLabel l_role1;
    private javax.swing.JPanel p_content;
    private javax.swing.JTextPane tf_iban;
    // End of variables declaration//GEN-END:variables
}

