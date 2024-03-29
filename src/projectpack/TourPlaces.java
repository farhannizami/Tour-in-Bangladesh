package projectpack;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

public class TourPlaces extends javax.swing.JFrame {

    private int fromind, toind, cnt = 0;
    private HashMap<Integer, ArrayList<String>> touristplace;
    private HashMap<String, String> placename;
    private HashMap<Integer, ArrayList<String>> hotelname;
    private HashMap<customPair, ArrayList<String>> busname;

    /**
     * Creates new form TourPlaces
     */
    public TourPlaces() {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
    }

    public TourPlaces(HashMap<Integer, ArrayList<String>> tpname, HashMap<String, String> pname, HashMap<Integer, ArrayList<String>> hname, HashMap<customPair, ArrayList<String>> bname, int sti, int di) {
        initComponents();
        setTitle("Tour in Bangladesh");
        setLocationRelativeTo(null);
        touristplace = tpname;
        placename = pname;
        hotelname = hname;
        busname = bname;
        fromind = sti;
        toind = di;
        //System.out.println(touristplace);

        load();
    }
    

    private void load() {
        FromTOPanel ftp = new FromTOPanel();
        scpane.add(ftp);
        scpane.revalidate();
        scpane.repaint();
        ftp.setFromTo(fromind, toind);

        int n = touristplace.get(toind).size();
        //System.out.println(n);

        TourPlacePanel hbp[] = new TourPlacePanel[n];
        scpane.setPreferredSize(new Dimension(scpane.getWidth(), 50 + n * 100));
        scpane.revalidate();
        scpane.repaint();

        for (int i = 0; i < n; i++) {
            hbp[i] = new TourPlacePanel(touristplace.get(toind).get(i),placename.get(touristplace.get(toind).get(i)));
            if (cnt % 2 == 1) {
                hbp[i].setWhite();
            }
            cnt++;
            //ArrayList<String> tmparr = (touristplace.get(toind));
            //System.out.println(tmparr);
            //String s = tmparr.get(i);
            //System.out.println(s);
            //String ss = placename.get(s);
            // System.out.println(ss);
            hbp[i].setPanelTilte(placename.get(touristplace.get(toind).get(i)));
            scpane.add(hbp[i]);
            scpane.revalidate();
            scpane.repaint();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tourtobus = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tourtohotel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tourtoprofile = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scpane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 49, 64));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(8, 72, 87));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tourist Attractions");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 40));

        jPanel4.setBackground(new java.awt.Color(8, 49, 64));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        tourtobus.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tourtobus.setForeground(new java.awt.Color(255, 255, 255));
        tourtobus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tourtobus.setText("Bus Routes");
        tourtobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourtobusMouseClicked(evt);
            }
        });
        jPanel4.add(tourtobus);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 40));

        jPanel5.setBackground(new java.awt.Color(8, 49, 64));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        tourtohotel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tourtohotel.setForeground(new java.awt.Color(255, 255, 255));
        tourtohotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tourtohotel.setText("Hotels");
        tourtohotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourtohotelMouseClicked(evt);
            }
        });
        jPanel5.add(tourtohotel);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 40));

        jPanel6.setBackground(new java.awt.Color(8, 49, 64));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        tourtoprofile.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tourtoprofile.setForeground(new java.awt.Color(255, 255, 255));
        tourtoprofile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tourtoprofile.setText("Profile");
        tourtoprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourtoprofileMouseClicked(evt);
            }
        });
        jPanel6.add(tourtoprofile);

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
        jLabel7.setText("Wonderful Places to Visit");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 530, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scpane.setBackground(new java.awt.Color(255, 255, 255));
        scpane.setMaximumSize(new java.awt.Dimension(530, 1000));
        scpane.setMinimumSize(new java.awt.Dimension(530, 300));
        scpane.setPreferredSize(new java.awt.Dimension(530, 700));
        scpane.setLayout(new javax.swing.BoxLayout(scpane, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(scpane);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 350));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 530, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tourtoprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourtoprofileMouseClicked
        // TODO add your handling code here:
        Profile pf = new Profile(touristplace, placename, hotelname, busname, fromind, toind);
        pf.setVisible(true);
        dispose();
    }//GEN-LAST:event_tourtoprofileMouseClicked

    private void tourtobusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourtobusMouseClicked
       BusRoutes br = new BusRoutes(touristplace, placename, hotelname, busname, fromind, toind);
       br.setVisible(true);
       dispose();
    }//GEN-LAST:event_tourtobusMouseClicked

    private void tourtohotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourtohotelMouseClicked
        Hotels ht = new Hotels(touristplace, placename, hotelname, busname, fromind, toind);      
        ht.setVisible(true);
        dispose();
    }//GEN-LAST:event_tourtohotelMouseClicked

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
            java.util.logging.Logger.getLogger(TourPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TourPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TourPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TourPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TourPlaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel scpane;
    private javax.swing.JLabel tourtobus;
    private javax.swing.JLabel tourtohotel;
    private javax.swing.JLabel tourtoprofile;
    // End of variables declaration//GEN-END:variables
}
