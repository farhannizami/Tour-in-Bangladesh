package projectpack;


public class FromTOPanel extends javax.swing.JPanel {

    /**
     * Creates new form FromTOPanel
     */
    public FromTOPanel() {
        initComponents();
    }
    
    public void setFromTo(int fr, int to)
    {
        frombox.setSelectedIndex(fr);
        tobox.setSelectedIndex(to);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel35 = new javax.swing.JPanel();
        tobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        frombox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(530, 50));
        setMinimumSize(new java.awt.Dimension(530, 50));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setMaximumSize(new java.awt.Dimension(530, 50));
        jPanel35.setMinimumSize(new java.awt.Dimension(530, 50));
        jPanel35.setPreferredSize(new java.awt.Dimension(530, 50));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Destination", "Dhaka", "Chattogram", "Cox's Bazar", "Sylhet", "Bandonban", "Rangamati", "Kuakata" }));
        tobox.setMaximumSize(new java.awt.Dimension(125, 19));
        tobox.setMinimumSize(new java.awt.Dimension(125, 19));
        tobox.setPreferredSize(new java.awt.Dimension(125, 19));
        jPanel35.add(tobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 160, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("To:");
        jPanel35.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));

        frombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Start Location", "Dhaka", "Chattogram", "Cox's Bazar", "Sylhet", "Bandonban", "Rangamati", "Kuakata" }));
        frombox.setMaximumSize(new java.awt.Dimension(125, 19));
        frombox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fromboxMouseClicked(evt);
            }
        });
        jPanel35.add(frombox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("From:");
        jPanel35.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fromboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromboxMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fromboxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> frombox;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JComboBox<String> tobox;
    // End of variables declaration//GEN-END:variables
}
