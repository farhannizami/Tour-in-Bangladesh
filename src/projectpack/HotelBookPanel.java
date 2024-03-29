
package projectpack;

import java.awt.Color;


public class HotelBookPanel extends javax.swing.JPanel {

    
    private String busfrom,busto;
    public void setWhite()
    {
        background.setBackground(Color.white);
        btnback.setBackground(Color.white);
    }
    
    public void setPanelTilte(String s)
    {
        title.setText(s);
    }
    /**
     * Creates new form HotelBookPanel
     */
    public HotelBookPanel() {
        initComponents();
    }
    
    public HotelBookPanel(String from,String to) {
        initComponents();
        busfrom = from;
        busto = to;
    }
    
    public void setJPB()
    {
        background.setBackground(Color.white);
        btnback.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnback = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        background.setMaximumSize(new java.awt.Dimension(530, 100));
        background.setMinimumSize(new java.awt.Dimension(530, 100));
        background.setPreferredSize(new java.awt.Dimension(530, 100));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setMaximumSize(new java.awt.Dimension(520, 100));
        btnback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Details");
        btnback.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jButton4.setText("Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        btnback.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Details");
        jPanel16.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jButton6.setText("Book");
        jPanel16.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        btnback.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 90, 100));

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("Details");
        jPanel17.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jButton8.setText("Book");
        jPanel17.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Details");
        jPanel18.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        jButton10.setText("Book");
        jPanel18.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 90, 100));

        btnback.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 90, 100));

        background.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 90, 100));

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(58, 104, 233));
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 340, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BusBook bk = new BusBook(busfrom,busto,title.getText());
        bk.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnback;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
