package thesimpleems_16nov;

import java.awt.Dimension;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
public class MainJFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
    public MyHashTable theHT;
    
    
    // CONSTRUCTORS
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false); // These two text fields show text when the user saves or loads the file, so they shouldn't be editable
        theHT = new MyHashTable(10); // Creates a new hash table with 10 buckets in it.
        
    }
    
    
    // METHODS   
    
    public MyHashTable getTheHT() {
        return theHT; // Getter method for retrieving the hash table.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton5.setText("Save all employees to file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Display all of the employees in the hash table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Add new employee");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressed_jButton3(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Load all employees from file");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Display info for a single employee");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setText("Save all employees to file");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setText("Remove employee");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setText("Edit info for a single employee");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setText("Employee Management System");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Course: ICS 4U0-C");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("By: Andrew Nicholas Ganea");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Submitted on: June 7, 2022 ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("For: Mr. Dutton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addComponent(jButton6)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        SeparateJFrame theSeparateJFrame = new SeparateJFrame();
        theSeparateJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        theSeparateJFrame.setMainHT(refVal);  // Have theSeparateJFrame mainHT point to the real HT.
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pressed_jButton3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressed_jButton3
        // TODO add your handling code here:
        AddNewEmployeeJFrame theANEJFrame = new AddNewEmployeeJFrame();
        theANEJFrame.setVisible(true);
        theANEJFrame.setPreferredSize(new Dimension(810, 1200)); // Set the dimensions of the window to a certain size.
        MyHashTable refVal = getTheHT();
        theANEJFrame.setMainHT(refVal);
    }//GEN-LAST:event_pressed_jButton3

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Unused method from removed button.
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // Here, I need code that reads the attribute values for the employee
        // data stored in a text file (by say using buffered reader) and adding
        // each of those employees to the hash table.
        try {
            Scanner sc = new Scanner(new FileReader("EmployeeStorage.txt")); // The Scanner opens the file called EmployeeStorage.txt, where the employees are stored.
            
            
            String line = null;
            String[] values;
            
            while(sc.hasNextLine()){ // This while loop goes through the text file until there is an empty line, signifying it has reached the end of the file.
                line = sc.nextLine();
                values = line.split("\\|"); // splits with | to differentiate between different attributes of the employee
                for(int i = 0; i < values.length; i++)  {
                    values[i] = values[i].replaceAll("!@!", "\\|");
                }
                try{
                    if(values[0].equals("FTE")){ // Reads through the specific fields if the Scanner sees the employee is an FTE.

                        int theEmpNum = Integer.parseInt(values[1]);
                        String theFirstName = values[2];
                        String theLastName = values[3];
                        String gender = values[4];
                        String workLoc = values[5];
                        
                        double deductRate = Double.parseDouble(values[6]); // These lines read data that the array got from the text file.

                        FTE theFTE;

                        double yearlySalary = Double.parseDouble(values[7]);
                        theFTE = new FTE(theEmpNum, theFirstName, theLastName,
                                    gender, workLoc, deductRate, yearlySalary);
                        theHT.addEmployee(theFTE); // These lines create a new FTE with the read information, and save it to the hash table.

                    }else if(values[0].equals("PTE")){ // The other case is if the employee stored is a PTE.

                        int theEmpNum = Integer.parseInt(values[1]);
                        String theFirstName = values[2];
                        String theLastName = values[3];
                        String gender = values[4];
                        String workLoc = values[5];
                        
                        double deductRate = Double.parseDouble(values[6]);

                        PTE thePTE;

                        double hourlyWage = Double.parseDouble(values[7]);
                        double hoursPerWeek = Double.parseDouble(values[8]);
                        double weeksPerYear = Double.parseDouble(values[9]);

                        thePTE = new PTE(theEmpNum, theFirstName, theLastName, gender,
                        workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                        theHT.addEmployee(thePTE); // These lines create a new PTE with the read information and save it to the hash table.
                                                
                    }
                    
                

                }catch(Exception e){
                    continue;
                }
            }
            jTextField1.setText("Successfully loaded hash table from file!"); // Updates a text file to give the user feedback that the functionality has been successfully carried out.
            TimeUnit.SECONDS.sleep(2);
            // jTextField2.setText(" ");
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found!");
        } catch (InterruptedException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DisplayEmployeeJFrame theDisplayEmployeeJFrame = new DisplayEmployeeJFrame();
        theDisplayEmployeeJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        theDisplayEmployeeJFrame.setMainHT(refVal);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         // TODO add your handling code here:
        
        // Here, I need code that walks through the entire hash table
        // and writes the attribute values for each employee to a
        // text file (by using say buffered writer).
        try {
                FileWriter writeToFile = new FileWriter("EmployeeStorage.txt", true); // This line specifies that the FileWriter will be writing to "EmployeeStorage.txt"
                
                for (int i = 0; i < theHT.buckets.length; i++) {
                    for (int j = 0; j < theHT.buckets[i].size(); j++) { // These lines go through the entire Hash table to get the information of each employee.
                        EmployeeInfo employeeBeingSaved = theHT.buckets[i].get(j);
                        
                        if (employeeBeingSaved instanceof FTE) { // This if statement checks if the employee is Full Time, and saves them accordingly
                            employeeBeingSaved.firstName = employeeBeingSaved.firstName.replaceAll("\\|", "!@!");
                            employeeBeingSaved.lastName = employeeBeingSaved.lastName.replaceAll("\\|", "!@!");
                            writeToFile.write("FTE|" + employeeBeingSaved.empNum + "|" + employeeBeingSaved.firstName + "|" + employeeBeingSaved.lastName + "|" +
                                employeeBeingSaved.gender + "|" + employeeBeingSaved.workLoc + "|" + employeeBeingSaved.deductRate + "|" + ((FTE) employeeBeingSaved).getYearlySalary() + "\n"); // THis is the line that actually prints out the employee in a textfile
                        }
                        else if(employeeBeingSaved instanceof PTE){ // This else if will only run if the employee is not an FTE, which means that it is a PTE.
                        employeeBeingSaved.firstName = employeeBeingSaved.firstName.replaceAll("\\|", "!@!");
                        employeeBeingSaved.lastName = employeeBeingSaved.lastName.replaceAll("\\|", "!@!");
                        writeToFile.write("PTE|" + employeeBeingSaved.empNum + "|" + employeeBeingSaved.firstName + "|" + employeeBeingSaved.lastName + "|" +
                                employeeBeingSaved.gender + "|" + employeeBeingSaved.workLoc + "|" + employeeBeingSaved.deductRate + "|" + ((PTE) employeeBeingSaved).getHourlyWage() +
                                "|" + ((PTE) employeeBeingSaved).getHoursPerWeek() + "|" + ((PTE) employeeBeingSaved).getWeeksPerYear() + "\n");
                    }
                        
                    }
                }
                jTextField2.setText("Successfully saved hash table to file!");
                writeToFile.flush(); // Writes all of the contents in the FileWriter into the text file and clears the stream
                writeToFile.close(); // Closes the stream, as all of the data has been written by now

            } catch (IOException e) {
                e.printStackTrace();
            } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        RemoveEmployeeJFrame theRemoveEmployeeJFrame = new RemoveEmployeeJFrame();
        theRemoveEmployeeJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        theRemoveEmployeeJFrame.setMainHT(refVal); // Opens a new jFrame that allows the user to remove an employee.
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        EditEmployeeJFrame theEditEmployeeJFrame = new EditEmployeeJFrame();
        theEditEmployeeJFrame.setVisible(true);
        MyHashTable refVal = getTheHT();
        theEditEmployeeJFrame.setMainHT(refVal); // Opens a new jFrame that allows the user to edit the data of an employee.
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
