/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import EmployeeClasses.Contracted_Employee;
import JavaFiles.View_Controller;

/**
 *
 * @author User
 */
public class New_Contract extends javax.swing.JFrame {
    View_Controller controller; 
    
    public New_Contract(View_Controller controller) {
        initComponents();
        this.controller = controller;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_content = new javax.swing.JPanel();
        b_back = new javax.swing.JButton();
        b_search = new javax.swing.JButton();
        l_first_name1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tf_month2 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tf_year2 = new javax.swing.JTextPane();
        l_month = new javax.swing.JLabel();
        l_year = new javax.swing.JLabel();
        l_mark1 = new javax.swing.JLabel();
        l_mark4 = new javax.swing.JLabel();
        l_first_name2 = new javax.swing.JLabel();
        l_first_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_iban = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        tf_basic_salary = new javax.swing.JTextPane();
        l_basic_salary = new javax.swing.JLabel();

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

        l_first_name1.setBackground(new java.awt.Color(2, 2, 2));
        l_first_name1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_first_name1.setForeground(java.awt.Color.black);
        l_first_name1.setText("Έως:");
        l_first_name1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name1.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name1.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane7.setViewportView(tf_month2);

        jScrollPane8.setViewportView(tf_year2);

        l_month.setBackground(new java.awt.Color(2, 2, 2));
        l_month.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_month.setForeground(java.awt.Color.black);
        l_month.setText("MM");
        l_month.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_month.setMaximumSize(new java.awt.Dimension(80, 40));
        l_month.setMinimumSize(new java.awt.Dimension(80, 40));

        l_year.setBackground(new java.awt.Color(2, 2, 2));
        l_year.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_year.setForeground(java.awt.Color.black);
        l_year.setText("XX");
        l_year.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_year.setMaximumSize(new java.awt.Dimension(80, 40));
        l_year.setMinimumSize(new java.awt.Dimension(80, 40));

        l_mark1.setBackground(new java.awt.Color(2, 2, 2));
        l_mark1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_mark1.setForeground(java.awt.Color.black);
        l_mark1.setText("/");
        l_mark1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_mark1.setMaximumSize(new java.awt.Dimension(80, 40));
        l_mark1.setMinimumSize(new java.awt.Dimension(80, 40));

        l_mark4.setBackground(new java.awt.Color(2, 2, 2));
        l_mark4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_mark4.setForeground(java.awt.Color.black);
        l_mark4.setText("/");
        l_mark4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_mark4.setMaximumSize(new java.awt.Dimension(80, 40));
        l_mark4.setMinimumSize(new java.awt.Dimension(80, 40));

        l_first_name2.setBackground(new java.awt.Color(2, 2, 2));
        l_first_name2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_first_name2.setForeground(java.awt.Color.black);
        l_first_name2.setText("Νέα σύμβαση έως:");
        l_first_name2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name2.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name2.setMinimumSize(new java.awt.Dimension(80, 40));

        l_first_name.setBackground(new java.awt.Color(2, 2, 2));
        l_first_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_first_name.setForeground(java.awt.Color.black);
        l_first_name.setText("IBAN:");
        l_first_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane1.setViewportView(tf_iban);

        jScrollPane13.setViewportView(tf_basic_salary);

        l_basic_salary.setBackground(new java.awt.Color(2, 2, 2));
        l_basic_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_basic_salary.setForeground(java.awt.Color.black);
        l_basic_salary.setText("Βασικός μισθός:");
        l_basic_salary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_basic_salary.setMaximumSize(new java.awt.Dimension(80, 40));
        l_basic_salary.setMinimumSize(new java.awt.Dimension(80, 40));

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_back))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addComponent(l_first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_contentLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(l_mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(p_contentLayout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(l_mark4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(p_contentLayout.createSequentialGroup()
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_first_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_basic_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_first_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_first_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_basic_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(l_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_mark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_first_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_mark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        Contracted_Employee to = new Contracted_Employee();
        
        to.iban = tf_iban.getText();
        to.salary.amount = Integer.parseInt(tf_basic_salary.getText());
        to.end_month = Integer.parseInt(tf_month2.getText());
        to.end_year = Integer.parseInt(tf_year2.getText());
        
        controller.new_contractClicked(to);

        return;
    }//GEN-LAST:event_b_searchActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        controller.home();
    }//GEN-LAST:event_b_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel l_basic_salary;
    private javax.swing.JLabel l_first_name;
    private javax.swing.JLabel l_first_name1;
    private javax.swing.JLabel l_first_name2;
    private javax.swing.JLabel l_mark1;
    private javax.swing.JLabel l_mark4;
    private javax.swing.JLabel l_month;
    private javax.swing.JLabel l_year;
    private javax.swing.JPanel p_content;
    private javax.swing.JTextPane tf_basic_salary;
    private javax.swing.JTextPane tf_iban;
    private javax.swing.JTextPane tf_month2;
    private javax.swing.JTextPane tf_year2;
    // End of variables declaration//GEN-END:variables

}
