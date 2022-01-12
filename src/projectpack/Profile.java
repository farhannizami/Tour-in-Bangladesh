package projectpack;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Profile extends javax.swing.JFrame {

    
    private int fromind, toind, cnt = 0;
    private HashMap<Integer, ArrayList<String>> touristplace;
    private HashMap<String, String> placename;
    private HashMap<Integer, ArrayList<String>> hotelname;
    private HashMap<customPair, ArrayList<String>> busname;
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
    }
    
    public Profile(HashMap<Integer, ArrayList<String>> tpname, HashMap<String, String> pname, HashMap<Integer, ArrayList<String>> hname, HashMap<customPair, ArrayList<String>> bname, int sti, int di) {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
        fromind = sti;
        toind = di;
        touristplace = tpname;
        hotelname = hname;
        busname = bname;
        placename = pname;
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
        jPanel3 = new javax.swing.JPanel();
        profiletotour = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        profiletobus = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        profiletohotel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 49, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(8, 49, 64));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        profiletotour.setBackground(new java.awt.Color(8, 49, 64));
        profiletotour.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        profiletotour.setForeground(new java.awt.Color(255, 255, 255));
        profiletotour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profiletotour.setText("Tourist Attractions");
        profiletotour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profiletotourMouseClicked(evt);
            }
        });
        jPanel3.add(profiletotour);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 40));

        jPanel4.setBackground(new java.awt.Color(8, 49, 64));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        profiletobus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        profiletobus.setForeground(new java.awt.Color(255, 255, 255));
        profiletobus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profiletobus.setText("Bus Routes");
        profiletobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profiletobusMouseClicked(evt);
            }
        });
        jPanel4.add(profiletobus);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 40));

        jPanel5.setBackground(new java.awt.Color(8, 49, 64));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        profiletohotel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        profiletohotel.setForeground(new java.awt.Color(255, 255, 255));
        profiletohotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profiletohotel.setText("Hotels");
        profiletohotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profiletohotelMouseClicked(evt);
            }
        });
        jPanel5.add(profiletohotel);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 40));

        jPanel6.setBackground(new java.awt.Color(8, 72, 87));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Profile");
        jPanel6.add(jLabel5);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpack/Images/icons8-back-arrow-30.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 430));

        jPanel2.setBackground(new java.awt.Color(58, 104, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome User");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 530, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpack/Images/dp.jpg"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 110, 120));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Email Address: ");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("Name: ");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 60, 20));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 120));

        logoutbtn.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        jPanel7.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 530, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame  = new JFrame();
        int n = JOptionPane.showConfirmDialog(frame,"Would you like to Logout?","An Inane Question",JOptionPane.YES_NO_OPTION);
        //System.out.println(n);
        if(n==0)
        {
            Login lg = new Login();
            lg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void profiletohotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profiletohotelMouseClicked
//       System.out.println(touristplace);
//        System.out.println(placename);
//        System.out.println(hotelname);
//        System.out.println(busname);
        Hotels ht = new Hotels(touristplace, placename, hotelname, busname, fromind, toind);
       ht.setVisible(true);
       dispose();
    }//GEN-LAST:event_profiletohotelMouseClicked

    private void profiletotourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profiletotourMouseClicked
        // TODO add your handling code here:
        
        TourPlaces tr = new TourPlaces(touristplace, placename, hotelname, busname, fromind, toind);
        tr.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_profiletotourMouseClicked

    private void profiletobusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profiletobusMouseClicked
        // TODO add your handling code here:
       BusRoutes br = new BusRoutes(touristplace, placename, hotelname, busname, fromind, toind);
       br.setVisible(true);
       dispose();
    }//GEN-LAST:event_profiletobusMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Destination_new dn = new Destination_new(fromind,toind);
        dn.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JLabel profiletobus;
    private javax.swing.JLabel profiletohotel;
    private javax.swing.JLabel profiletotour;
    // End of variables declaration//GEN-END:variables
}
