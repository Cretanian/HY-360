/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import EmployeeClasses.*;
import JavaFiles.Date;
import JavaFiles.View_Controller;
import JavaFiles.Date;

/**
 *
 * @author User
 */
public class Contracted_Format extends javax.swing.JFrame {
    public enum State{ HIRE, ALTER }; public State state;
    View_Controller controller;
    Contracted_Employee employee;
    Contracted_Employee new_employee;
    
    /**
     * Creates new form Contracted_Format
     */
    public Contracted_Format() {
        initComponents();
    }
    public  Contracted_Format(View_Controller controller){
        initComponents();
        this.controller = controller;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_content = new javax.swing.JPanel();
        l_first_name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_first_name = new javax.swing.JTextPane();
        l_last_name = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_last_name = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_bank_name = new javax.swing.JTextPane();
        l_bank_name = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_iban = new javax.swing.JTextPane();
        l_iban = new javax.swing.JLabel();
        l_birthday = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_birthday = new javax.swing.JTextPane();
        l_address = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextPane();
        l_phone_number = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tf_phone_number = new javax.swing.JTextPane();
        l_married = new javax.swing.JLabel();
        l_department = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tf_department = new javax.swing.JTextPane();
        cb_role = new javax.swing.JComboBox<>();
        l_role = new javax.swing.JLabel();
        cb_married = new javax.swing.JCheckBox();
        b_hire = new javax.swing.JButton();
        l_end_month = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tf_end_month = new javax.swing.JTextPane();
        l_end_year = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tf_end_year = new javax.swing.JTextPane();
        l_children_age = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tf_children_age = new javax.swing.JTextPane();
        l_basic_salary = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tf_basic_salary = new javax.swing.JTextPane();
        b_back = new javax.swing.JButton();
        l_fill_in = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_content.setBackground(java.awt.Color.lightGray);
        p_content.setForeground(java.awt.Color.blue);

        l_first_name.setBackground(new java.awt.Color(2, 2, 2));
        l_first_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_first_name.setForeground(java.awt.Color.black);
        l_first_name.setText("Όνομα");
        l_first_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_first_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_first_name.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane1.setViewportView(tf_first_name);

        l_last_name.setBackground(new java.awt.Color(2, 2, 2));
        l_last_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_last_name.setForeground(java.awt.Color.black);
        l_last_name.setText("Επώνυμο:");
        l_last_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_last_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_last_name.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane2.setViewportView(tf_last_name);

        jScrollPane3.setViewportView(tf_bank_name);

        l_bank_name.setBackground(new java.awt.Color(2, 2, 2));
        l_bank_name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_bank_name.setForeground(java.awt.Color.black);
        l_bank_name.setText("Τραπεζα:");
        l_bank_name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_bank_name.setMaximumSize(new java.awt.Dimension(80, 40));
        l_bank_name.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane4.setViewportView(tf_iban);

        l_iban.setBackground(new java.awt.Color(2, 2, 2));
        l_iban.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_iban.setForeground(java.awt.Color.black);
        l_iban.setText("iBan:");
        l_iban.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_iban.setMaximumSize(new java.awt.Dimension(80, 40));
        l_iban.setMinimumSize(new java.awt.Dimension(80, 40));

        l_birthday.setBackground(new java.awt.Color(2, 2, 2));
        l_birthday.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_birthday.setForeground(java.awt.Color.black);
        l_birthday.setText("Ημερομηνίας γέννησης");
        l_birthday.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_birthday.setMaximumSize(new java.awt.Dimension(80, 40));
        l_birthday.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane5.setViewportView(tf_birthday);

        l_address.setBackground(new java.awt.Color(2, 2, 2));
        l_address.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_address.setForeground(java.awt.Color.black);
        l_address.setText("Διεύθυνηση:");
        l_address.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_address.setMaximumSize(new java.awt.Dimension(80, 40));
        l_address.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane6.setViewportView(tf_address);

        l_phone_number.setBackground(new java.awt.Color(2, 2, 2));
        l_phone_number.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_phone_number.setForeground(java.awt.Color.black);
        l_phone_number.setText("Αριθμός τηλεφώνου:");
        l_phone_number.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_phone_number.setMaximumSize(new java.awt.Dimension(80, 40));
        l_phone_number.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane7.setViewportView(tf_phone_number);

        l_married.setBackground(new java.awt.Color(2, 2, 2));
        l_married.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_married.setForeground(java.awt.Color.black);
        l_married.setText("Έγγαμος:");
        l_married.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_married.setMaximumSize(new java.awt.Dimension(80, 40));
        l_married.setMinimumSize(new java.awt.Dimension(80, 40));

        l_department.setBackground(new java.awt.Color(2, 2, 2));
        l_department.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_department.setForeground(java.awt.Color.black);
        l_department.setText("Τμήμα:");
        l_department.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_department.setMaximumSize(new java.awt.Dimension(80, 40));
        l_department.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane9.setViewportView(tf_department);

        cb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrative", "Educative" }));

        l_role.setBackground(new java.awt.Color(2, 2, 2));
        l_role.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_role.setForeground(java.awt.Color.black);
        l_role.setText("Ρόλος:");
        l_role.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_role.setMaximumSize(new java.awt.Dimension(80, 40));
        l_role.setMinimumSize(new java.awt.Dimension(80, 40));

        b_hire.setBackground(new java.awt.Color(222, 222, 222));
        b_hire.setForeground(new java.awt.Color(0, 0, 0));
        b_hire.setText("ΟΚ");
        b_hire.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_hire.setName(""); // NOI18N
        b_hire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hireActionPerformed(evt);
            }
        });

        l_end_month.setBackground(new java.awt.Color(2, 2, 2));
        l_end_month.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_end_month.setForeground(java.awt.Color.black);
        l_end_month.setText("Μήνας λήξης:");
        l_end_month.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_end_month.setMaximumSize(new java.awt.Dimension(80, 40));
        l_end_month.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane10.setViewportView(tf_end_month);

        l_end_year.setBackground(new java.awt.Color(2, 2, 2));
        l_end_year.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_end_year.setForeground(java.awt.Color.black);
        l_end_year.setText("Χρονιά λήξης:");
        l_end_year.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_end_year.setMaximumSize(new java.awt.Dimension(80, 40));
        l_end_year.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane11.setViewportView(tf_end_year);

        l_children_age.setBackground(new java.awt.Color(2, 2, 2));
        l_children_age.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_children_age.setForeground(java.awt.Color.black);
        l_children_age.setText("Ηλικία παιδιών:");
        l_children_age.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_children_age.setMaximumSize(new java.awt.Dimension(80, 40));
        l_children_age.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane12.setViewportView(tf_children_age);

        l_basic_salary.setBackground(new java.awt.Color(2, 2, 2));
        l_basic_salary.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_basic_salary.setForeground(java.awt.Color.black);
        l_basic_salary.setText("Βασικός μισθός:");
        l_basic_salary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_basic_salary.setMaximumSize(new java.awt.Dimension(80, 40));
        l_basic_salary.setMinimumSize(new java.awt.Dimension(80, 40));

        jScrollPane13.setViewportView(tf_basic_salary);

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

        javax.swing.GroupLayout p_contentLayout = new javax.swing.GroupLayout(p_content);
        p_content.setLayout(p_contentLayout);
        p_contentLayout.setHorizontalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_end_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_children_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_basic_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_contentLayout.createSequentialGroup()
                            .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                            .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_contentLayout.createSequentialGroup()
                            .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_married, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb_role, javax.swing.GroupLayout.Alignment.TRAILING, 0, 233, Short.MAX_VALUE)
                                .addComponent(cb_married, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(p_contentLayout.createSequentialGroup()
                            .addComponent(l_end_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_hire, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_back)
                .addContainerGap())
        );
        p_contentLayout.setVerticalGroup(
            p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_contentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_bank_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_married)
                    .addComponent(l_married, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_end_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_end_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_children_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_basic_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(p_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_hire, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        l_fill_in.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l_fill_in.setText("Συμπληρώστε την παρακάτω φόρμα:");
        l_fill_in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        l_fill_in.setMaximumSize(new java.awt.Dimension(80, 40));
        l_fill_in.setMinimumSize(new java.awt.Dimension(80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_fill_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_fill_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    public void setEmployee(Contracted_Employee employee){
        this.employee = employee;
    }
    
    
    public void setEmployeeFields(Contracted_Employee employee){
        this.employee = employee;
        
        tf_first_name.setText(employee.first_name);
        tf_last_name.setText(employee.last_name);
        tf_bank_name.setText(employee.bank_name);
        tf_iban.setText(employee.iban);
        tf_birthday.setText(employee.birthday);
        tf_address.setText(employee.address);
        tf_phone_number.setText(employee.phone_number);
        if(employee.married == 1)
            cb_married.setSelected(true);
        else
            cb_married.setSelected(false);
        tf_department.setText(employee.department);
        if(employee.role == Employee.Role.ADMINISTRATIVE)
            cb_role.setSelectedIndex(0);
        else
            cb_role.setSelectedIndex(1);
        tf_children_age.setText(employee.childrens_age);       
    }
    
    public void fillEmployee(){
        if(new_employee == null)
            new_employee = new Contracted_Employee();
        
        if(!tf_end_month.getText().equals("") || !tf_end_month.getText().equals("")){
            ((Contracted_Employee)new_employee).end_month = Integer.parseInt(tf_end_month.getText());
            ((Contracted_Employee)new_employee).end_year =  Integer.parseInt(tf_end_year.getText());
        }
        new_employee.first_name = tf_first_name.getText();
        new_employee.last_name = tf_last_name.getText();
        new_employee.bank_name = tf_bank_name.getText();
        new_employee.iban = tf_iban.getText();
        new_employee.birthday = tf_birthday.getText();
        new_employee.address = tf_address.getText();
        new_employee.phone_number = tf_phone_number.getText();
        if(cb_married.isSelected())
            new_employee.married = 1;
        else
            new_employee.married = 0;
        new_employee.department = tf_department.getText();
        new_employee.childrens_age = tf_children_age.getText();
        
        if(cb_role.getSelectedItem() == "Administrative")
            new_employee.role = Employee.Role.ADMINISTRATIVE;
        else if(cb_role.getSelectedItem() == "Educative")
            new_employee.role = Employee.Role.EDUCATIVE;
        
        if(!tf_basic_salary.getText().equals(""))
        new_employee.salary.amount = Integer.parseInt(tf_basic_salary.getText());
        new_employee.start_month = new Date().month;
        new_employee.start_year = new Date().year;
    }

    
            
    public void prepareForChange(){
        tf_iban.setEnabled(false);
        tf_basic_salary.setEnabled(false);
        tf_end_month.setEnabled(false);
        tf_end_year.setEnabled(false);
    }
    
    /**
     * Transfers data from form to View_Controller via Employee class.
     * 
     */
    private void b_hireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hireActionPerformed
        if(state == State.HIRE){
            employee = new Contracted_Employee();
        }
        
        fillEmployee();
        
        if(state == State.HIRE)
            controller.hireEmployee(new_employee);
        else if(state == State.ALTER)
            controller.changeEmployeeLast(employee, new_employee);
        
        return;
    }//GEN-LAST:event_b_hireActionPerformed

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
                controller.home();

    }//GEN-LAST:event_b_backActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_hire;
    private javax.swing.JCheckBox cb_married;
    private javax.swing.JComboBox<String> cb_role;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel l_address;
    private javax.swing.JLabel l_bank_name;
    private javax.swing.JLabel l_basic_salary;
    private javax.swing.JLabel l_birthday;
    private javax.swing.JLabel l_children_age;
    private javax.swing.JLabel l_department;
    private javax.swing.JLabel l_end_month;
    private javax.swing.JLabel l_end_year;
    private javax.swing.JLabel l_fill_in;
    private javax.swing.JLabel l_first_name;
    private javax.swing.JLabel l_iban;
    private javax.swing.JLabel l_last_name;
    private javax.swing.JLabel l_married;
    private javax.swing.JLabel l_phone_number;
    private javax.swing.JLabel l_role;
    private javax.swing.JPanel p_content;
    private javax.swing.JTextPane tf_address;
    private javax.swing.JTextPane tf_bank_name;
    private javax.swing.JTextPane tf_basic_salary;
    private javax.swing.JTextPane tf_birthday;
    private javax.swing.JTextPane tf_children_age;
    private javax.swing.JTextPane tf_department;
    private javax.swing.JTextPane tf_end_month;
    private javax.swing.JTextPane tf_end_year;
    private javax.swing.JTextPane tf_first_name;
    private javax.swing.JTextPane tf_iban;
    private javax.swing.JTextPane tf_last_name;
    private javax.swing.JTextPane tf_phone_number;
    // End of variables declaration//GEN-END:variables
}
