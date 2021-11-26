/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Employee_Payment_Table extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Payment
     */
    public Employee_Payment_Table() {
        initComponents();
    }

     public void fillTable(ResultSet rs){
        DefaultTableModel model = (DefaultTableModel) table.getModel();     
        String[] entry;
        System.out.println("mosi mosi?");
        
        try{
            while(rs.next()){
                System.out.println("important mosi mosi2?!");
                int i = 0;
                entry = new String[13];

                entry[0]    = rs.getString("Employee_ID");
                entry[1]    = rs.getString("first_name");
                entry[2]    = rs.getString("last_name");
                entry[3]    = rs.getString("iban");
                entry[4]    = rs.getString("phone_number");
                entry[5]    = rs.getString("married");
                entry[6]    = rs.getString("basic_salary");
                entry[7]    = rs.getString("family_bonus+'(%)'");
                entry[8]    = rs.getString("research_bonus");
                entry[9]    = rs.getString("library_bonus");
                entry[10]   = rs.getString("total_amount");
                entry[11] = rs.getString("month");
                entry[12]   = rs.getString("year");
                
                model.addRow(entry);
            }
        }
        catch(Exception e){
            System.out.println("Fill table: " + e);
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_close = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_close.setText("Close");
        b_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_closeActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "IBAN", "Phone Number", "Married", "Basic Salary", "Family Bonus", "Research Bonus", "Library Bonus", "Total Amounte", "Month", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_close)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_close;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
