/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Update_Details.java
 *
 * Created on Feb 24, 2019, 2:48:48 AM
 */

package traffic_mgmt;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Update_Details extends javax.swing.JFrame {

    /** Creates new form Update_Details */
    public Update_Details() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
public Update_Details(String para)
{
initComponents();
l1.setText(para);
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/crs.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(790, 10, 50, 40);

        jButton3.setForeground(new java.awt.Color(102, 102, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/Mini.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(720, 10, 50, 40);
        jPanel1.add(t1);
        t1.setBounds(500, 280, 210, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Update Future Details.....");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 17, 250, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel2.setText("Company Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 400, 194, 29);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setText("Vehicle reg. no. :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 280, 193, 29);

        jButton1.setText("Sumbit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 520, 110, 50);

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A-12 Amazon", "A-32 MIcrosoft" }));
        jPanel1.add(c1);
        c1.setBounds(500, 400, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/tool.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -4, 850, 70);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 26));
        jLabel5.setText("For Parking");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 190, 140, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 26));
        jLabel6.setText("Update Your Next Month Details");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 160, 370, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel7.setText("UNIQUE ID: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 90, 110, 22);

        l1.setFont(new java.awt.Font("Arial", 0, 18));
        l1.setText("T322138979");
        jPanel1.add(l1);
        l1.setBounds(140, 80, 130, 40);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 520, 90, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic_mgmt/WhatsApp Image 2019-02-23 at 3.45.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 60, 850, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = l1.getText();
        String b = t1.getText();
        String c = c1.getSelectedItem().toString();
        try{
            Class.forName("java.sql.Driver");
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost/traffic","root","help");
            Statement stmt = con.createStatement();
            String sql = "UPDATE register SET veh_no = '"+b+"' , compa = '"+c+"' WHERE uni_id = '"+a+"';";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Details Sumbit Succesfully");
        } catch(Exception e ) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(ICONIFIED);        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);        // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String uni = l1.getText();
        Profile nw = new Profile(uni);
        nw.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

}
