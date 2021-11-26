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
public class Home extends javax.swing.JFrame {
    View_Controller controller;
    
    public Home() {
        initComponents();
    }
    public Home(View_Controller controller){
        initComponents();
        this.controller = controller;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_content = new javax.swing.JPanel();
        b_actions = new javax.swing.JButton();
        b_querries = new javax.swing.JButton();
        p_title = new javax.swing.JPanel();
        l_home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_content.setBackground(java.awt.Color.lightGray);

        b_actions.setBackground(new java.awt.Color(222, 222, 222));
        b_actions.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        b_actions.setForeground(new java.awt.Color(0, 0, 0));
        b_actions.setText("Διαδικασίες");
        b_actions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_actions.setName(""); // NOI18N
        b_actions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_actionsActionPerformed(evt);
            }
        });

        b_querries.setBackground(new java.awt.Color(222, 222, 222));
        b_querries.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        b_querries.setForeground(new java.awt.Color(0, 0, 0));
        b_querries.setText("Ερωτήσεις");
        b_querries.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_querries.setName(""); // NOI18N
        b_querries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_querriesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_actions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_querries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_actions, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_querries, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l_home.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        l_home.setText("Μισθοδοσία Πανεπιστημίου Κρήτης");

        javax.swing.GroupLayout p_titleLayout = new javax.swing.GroupLayout(p_title);
        p_title.setLayout(p_titleLayout);
        p_titleLayout.setHorizontalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_titleLayout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(l_home)
                .addGap(234, 234, 234))
        );
        p_titleLayout.setVerticalGroup(
            p_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_titleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(l_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_actionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_actionsActionPerformed
        controller.actionsClicked();
    }//GEN-LAST:event_b_actionsActionPerformed

    private void b_querriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_querriesActionPerformed
        controller.querriesClicked();
    }//GEN-LAST:event_b_querriesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_actions;
    private javax.swing.JButton b_querries;
    private javax.swing.JLabel l_home;
    private javax.swing.JPanel p_content;
    private javax.swing.JPanel p_title;
    // End of variables declaration//GEN-END:variables
}
