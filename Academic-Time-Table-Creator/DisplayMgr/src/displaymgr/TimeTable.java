/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaymgr;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class TimeTable extends javax.swing.JFrame {
    private DisplayManager mgr;
    
    /**
     * Creates new form Welcome
     */
    public TimeTable(DisplayManager mymgr) {
        this.mgr=mymgr;
        initComponents();
         addRowTable();
    }

    private TimeTable() {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
    }
   
    public class User{
        public String Tslots;
        public String Rno;
        public String Iname;
        public String Cname;
        public String Day;
     public User(String D,String T,String R,String I,String C){
         this.Tslots = T;
         this.Rno = R;
         this.Iname = I;
         this.Cname = C;
         this.Day = D;
     }  
    }

    
    
    public ArrayList listUser(){
       ArrayList<User> list = new ArrayList<User>();
       
       User u1 = new User("Tuesday","9:20-10:10","3.4","MD","CS-503");
       User u2 = new User("Tuesday","10:10-11:00","3.4","SHM","CS-501");
       User u3 = new User("Tuesday","11:00-11:50","3.4","KB","CS-502");
       User u4 = new User("Tuesday","11:50-12:40","3.4","SNS","CS-503");
       User u5 = new User("Tuesday","12:40-1:30","BREAK","BREAK","BREAK");
       User u6 = new User("Tuesday","1:30-4:00","Zone1","SS","C1->CS-591");
       User u7 = new User("Tuesday","1:30-4:00","5.1","AKDS","C2->CS-593");
       User u21 = new User("Wednesday","9:20-10:10","3.4","MD","CS-503");
       User u22 = new User("Wednesday","10:10-11:00","3.4","SHM","CS-501");
       User u23 = new User("Wednesday","11:00-11:50","3.4","KB","CS-502");
       User u24 = new User("Wednesday","11:50-12:40","3.4","SNS","CS-503");
       User u25 = new User("Wednesday","12:40-1:30","BREAK","BREAK","BREAK");
       User u26 = new User("Wednesday","1:30-4:00","Zone2","SNR","C1->CS-594D");
       User u27 = new User("Wednesday","1:30-4:00","Zone1","SS","C2->CS-591 ");
       User u31 = new User("Thursday","9:20-10:10","3.4","MD","CS-503");
       User u32 = new User("Thursday","10:10-11:00","3.4","SHM","CS-501");
       User u33 = new User("Thursday","11:00-11:50","3.4","KB","CS-502");
       User u34 = new User("Thursday","11:50-12:40","3.4","SNS","CS-503");
       User u35 = new User("Thursday","12:40-1:30","BREAK","BREAK","BREAK");
       User u36 = new User("Thursday","1:30-4:00","Zone1","SS","C1->CS-591");
       User u37 = new User("Thursday","1:30-4:00","5.1","AKDS","C2->CS-593");
       User u41 = new User("Friday","9:20-10:10","3.4","MD","CS-503");
       User u42 = new User("Friday","10:10-11:00","3.4","SHM","CS-501");
       User u43 = new User("Friday","11:00-11:50","3.4","KB","CS-502");
       User u44 = new User("Friday","11:50-12:40","3.4","SNS","CS-503");
       User u45 = new User("Friday","12:40-1:30","BREAK","BREAK","BREAK");
       User u46 = new User("Friday","1:30-4:00","Zone1","SS","C1->CS-591");
       User u47 = new User("Friday","1:30-4:00","5.1","AKDS","C2->CS-593");
       User u51 = new User("Saturday","9:20-10:10","3.4","MD","CS-503");
       User u52 = new User("Saturday","10:10-11:00","3.4","SHM","CS-501");
       User u53 = new User("Saturday","11:00-11:50","3.4","KB","CS-502");
       User u54 = new User("Saturday","11:50-12:40","3.4","SNS","CS-503");
       User u55 = new User("Saturday","12:40-1:30","BREAK","BREAK","BREAK");
       User u56 = new User("Saturday","1:30-4:00","Zone1","SS","C1->CS-591");
       User u57 = new User("Saturday","1:30-4:00","5.1","AKDS","C2->CS-593");
       
       list.add(u1);
       list.add(u2);
       list.add(u3);
       list.add(u4);
       list.add(u5);
       list.add(u6);
       list.add(u7);
       list.add(u21);
       list.add(u22);
       list.add(u23);
       list.add(u24);
       list.add(u25);
       list.add(u26);
       list.add(u27);
       list.add(u31);
       list.add(u32);
       list.add(u33);
       list.add(u34);
       list.add(u35);
       list.add(u36);
       list.add(u37);
       list.add(u41);
       list.add(u42);
       list.add(u43);
       list.add(u44);
       list.add(u45);
       list.add(u46);
       list.add(u47);
       list.add(u51);
       list.add(u52);
       list.add(u53);
       list.add(u54);
       list.add(u55);
       list.add(u56);
       list.add(u57);
       return list;
    }
    public void addRowTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        ArrayList<User> list = listUser();
        Object rowData[] =new Object[5];
        
        for(int i=0;i<list.size();i++)
        {
            rowData[0] = list.get(i).Day;
            rowData[1] = list.get(i).Tslots;
            rowData[2] = list.get(i).Rno;
            rowData[3] = list.get(i).Iname;
            rowData[4] = list.get(i).Cname;
            model.addRow(rowData);
        }
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "TimeSlots", "Rooms", "Instructors", "Courses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Export");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("View Another");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       mgr.showScreen4();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mgr.showScreen2();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mgr.ExportFile();        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
