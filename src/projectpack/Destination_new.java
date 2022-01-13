package projectpack;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Destination_new extends javax.swing.JFrame {

    private HashMap<Integer, ArrayList<String>> touristplace = new HashMap<Integer, ArrayList<String>>();
    private HashMap<String, String> placename = new HashMap<String, String>();
    private HashMap<Integer, ArrayList<String>> hotelname = new HashMap<Integer, ArrayList<String>>();
    private HashMap<customPair, ArrayList<String>> busname = new HashMap<customPair, ArrayList<String>>();

    /**
     * Creates new form Destination_new
     */
    public Destination_new() {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
        setMaps();
    }

    public Destination_new(int fromind, int toind) {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
        setMaps();
        from_slt.setSelectedIndex(fromind);
        to_slt.setSelectedIndex(toind);
    }

    private void setMaps() {
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();
        ArrayList<String> ar3 = new ArrayList<>();
        ArrayList<String> ar4 = new ArrayList<>();
        ArrayList<String> ar5 = new ArrayList<>();
        ArrayList<String> ar6 = new ArrayList<>();
        ArrayList<String> ar7 = new ArrayList<>();

        //ar1.add("Dhaka");
        ar1.add("ahsan_manjil.txt");
        ar1.add("national_zoo.txt");
        ar1.add("lalbager_kella.txt");
        ar1.add("ramna_park.txt");

        touristplace.put(1, ar1);

        //ar2.add("Chottogram");
        ar2.add("karnafuli.txt");
        ar2.add("chandranath_pahar.txt");
        ar2.add("mohamaya_lake.txt");
        ar2.add("foyers_lake.txt");
        touristplace.put(2, ar2);

        //ar3.add("Cox's Bazar");
        ar3.add("sea_beach.txt");
        ar3.add("ramu.txt");
        ar3.add("himchori.txt");
        ar3.add("inani_beach.txt");
        ar3.add("marine_drive.txt");
        touristplace.put(3, ar3);

        //ar4.add("Sylhet");
        ar4.add("jaflong.txt");
        ar4.add("sreemongol.txt");
        ar4.add("ratargul.txt");
        ar4.add("rema.txt");
        touristplace.put(4, ar4);

        //ar5.add("Bandarban");
        ar5.add("nilgiri.txt");
        ar5.add("nilachal.txt");
        ar5.add("nafakhum.txt");
        ar5.add("sajek.txt");
        touristplace.put(5, ar5);

        //ar7.add("Kuakata");
        ar7.add("kuakata_beach.txt");
        ar7.add("sonar_char.txt");
        ar7.add("sutki_palli.txt");
        touristplace.put(7, ar7);

        //ar6.add("Rangamati");
        ar6.add("kaptai_lake.txt");
        ar6.add("shovolong.txt");
        ar6.add("hanging_bridge.txt");
        ar6.add("cultural_meseum.txt");
        touristplace.put(6, ar6);

        //dhaka
        placename.put("ahsan_manjil.txt", "Ahsan Manjil");
        placename.put("national_zoo.txt", "National Zoo");
        placename.put("lalbager_kella.txt", "Lalbager Kella");
        placename.put("ramna_park.txt", "Ramna Park");

        //ctg
        placename.put("karnafuli.txt", "Karnafuli River");
        placename.put("chandranath_pahar.txt", "Chandranath Hill");
        placename.put("mohamaya_lake.txt", "Mohamaya Lake");
        placename.put("foyers_lake.txt", "Foyers Lake");

        //coxbazar
        placename.put("sea_beach.txt", "Sea Beach");
        placename.put("ramu.txt", "Ramu Temple");
        placename.put("himchori.txt", "Himchori");
        placename.put("inani_beach.txt", "Inani Beach");
        placename.put("marine_drive.txt", "Marine Drive");

        //sylhet
        placename.put("jaflong.txt", "Jaflong");
        placename.put("sreemongol.txt", "Sreemongol");
        placename.put("ratargul.txt", "Ratargul");
        placename.put("rema.txt", "Rema");

        //bandarban
        placename.put("nilgiri.txt", "Nilgiri");
        placename.put("nilachal.txt", "Nilachal");
        placename.put("nafakhum.txt", "Nafakhum");
        placename.put("sajek.txt", "Sajek");

        //rangamati
        placename.put("kaptai_lake.txt", "Kaptai Lake");
        placename.put("shovolong.txt", "Shovolong Waterfall");
        placename.put("hanging_bridge.txt", "Hanging Bridge");
        placename.put("cultural_meseum.txt", "Cultural Meseum");

        // Kuakata
        placename.put("kuakata_beach.txt", "Kuakata Beach");
        placename.put("sonar_char.txt", "Sonar Char");
        placename.put("sutki_palli.txt", "Sutki Palli");

        //Hotels add
        ArrayList<String> hr1 = new ArrayList<>();
        ArrayList<String> hr2 = new ArrayList<>();
        ArrayList<String> hr3 = new ArrayList<>();
        ArrayList<String> hr4 = new ArrayList<>();
        ArrayList<String> hr5 = new ArrayList<>();
        ArrayList<String> hr6 = new ArrayList<>();
        ArrayList<String> hr7 = new ArrayList<>();

        //dhaka
        hr1.add("Sheraton");
        hr1.add("Radisson Blu");
        hr1.add("Hotel Saladia");
        hr1.add("Regant Palace");
        hr1.add("Nomina Abashik");
        hotelname.put(1, hr1);

        //ctg
        hr2.add("Radisson Blu Chittagong");
        hr2.add("Hilton City Residential");
        hr2.add("Hotel Star Park");
        hr2.add("Hotel Tower Inn");
        hotelname.put(2, hr2);

        //cbazar
        hr3.add("Cox's Inn");
        hr3.add("White Orchid");
        hr3.add("Uni Resort");
        hr3.add("Shopno Bilash");
        hr3.add("Hotel Pink Shore");
        hr3.add("Hotel Sea Crown");
        hotelname.put(3, hr3);

        //sylhet
        hr4.add("Noorjahan Grand");
        hr4.add("Rose View Hotel");
        hr4.add("Bottom Hill Palace");
        hr4.add("Hotel Musafir");
        hotelname.put(4, hr4);

        //bandarban
        hr5.add("Hotel Plaza");
        hr5.add("Hotel Hillview");
        hr5.add("Nolambori Resort");
        hr5.add("Fanush Resort");
        hr5.add("Hotel Three star");
        hotelname.put(5, hr5);

        //rangamati
        hr6.add("Hotel Moti Mahal");
        hr6.add("Hotel Prince");
        hr6.add("Aronnak Holiday");
        hr6.add("Green Castle");
        hotelname.put(6, hr6);

        //kuakata
        hr7.add("Swapnorajjo");
        hr7.add("Hotel Graver Inn");
        hr7.add("Hotel Khan Palace");
        hotelname.put(7, hr7);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutlb = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        to_slt = new javax.swing.JComboBox();
        from_slt = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 49, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(8, 72, 87));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Search Route");
        jPanel3.add(jLabel8);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 40));

        jPanel4.setBackground(new java.awt.Color(8, 49, 64));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        logoutlb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        logoutlb.setForeground(new java.awt.Color(255, 255, 255));
        logoutlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutlb.setText("Logout");
        logoutlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlbMouseClicked(evt);
            }
        });
        jPanel4.add(logoutlb);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 40));

        jPanel5.setBackground(new java.awt.Color(8, 49, 64));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 40));

        jPanel6.setBackground(new java.awt.Color(8, 49, 64));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectpack/Images/icons8-back-arrow-30.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 430));

        jPanel2.setBackground(new java.awt.Color(58, 104, 233));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Select Locations");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 530, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel1.setText("To:");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel3.setText("From: ");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        to_slt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        to_slt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Destination", "Dhaka", "Chattogram", "Cox's Bazar", "Sylhet", "Bandarban", "Rangamati", "Kuakata" }));
        to_slt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to_sltActionPerformed(evt);
            }
        });
        jPanel8.add(to_slt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 370, 30));

        from_slt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        from_slt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Start Location", "Dhaka", "Chattogram", "Cox's Bazar", "Sylhet", "Bandarban", "Rangamati", "Kuakata" }));
        from_slt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_sltActionPerformed(evt);
            }
        });
        jPanel8.add(from_slt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 370, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Find Route");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 30));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 350));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 530, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlbMouseClicked
        // TODO add your handling code here:
        JFrame frame  = new JFrame();
        int n = JOptionPane.showConfirmDialog(frame,"Would you like to Logout?","An Inane Question",JOptionPane.YES_NO_OPTION);
        if(n==0)
        {
            Login lg = new Login();
            lg.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutlbMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int st = from_slt.getSelectedIndex();
        int to = to_slt.getSelectedIndex();
        //System.out.println(touristplace);
        if (st == 0 && to == 0) {
            JFrame msg = new JFrame();
            JOptionPane.showMessageDialog(msg, "Please Select Start Location and Destination");
        } else if (st == 0) {
            JFrame msg = new JFrame();
            JOptionPane.showMessageDialog(msg, "Please Select Start Location");
        } else if (to == 0) {
            JFrame msg = new JFrame();
            JOptionPane.showMessageDialog(msg, "Please Select Destination");
        } else if (st == to) {
            JFrame msg = new JFrame();
            JOptionPane.showMessageDialog(msg, "Start Location and Destination Cannot Be Same");
        } else {
            TourPlaces t = new TourPlaces(touristplace, placename, hotelname, busname, st, to);
            //t.setFromTo(st, to);
            t.setVisible(true);
            //this.setVisible(false);
            dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void to_sltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to_sltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to_sltActionPerformed

    private void from_sltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_sltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_sltActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
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
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Destination_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Destination_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Destination_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Destination_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Destination_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox from_slt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel logoutlb;
    private javax.swing.JComboBox to_slt;
    // End of variables declaration//GEN-END:variables
}
