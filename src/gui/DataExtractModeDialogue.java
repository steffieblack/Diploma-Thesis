/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Steffie
 */
public class DataExtractModeDialogue extends javax.swing.JDialog {

    /**
     * Creates new form DataExtractModeDialogue
     */
    public DataExtractModeDialogue(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(400, 250);
        this.setResizable(false);
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbText = new javax.swing.JLabel();
        pnExistingDump = new javax.swing.JPanel();
        rbExistingDBDump = new javax.swing.JRadioButton();
        lbPlaceholder1 = new javax.swing.JLabel();
        pnNewDump = new javax.swing.JPanel();
        rbNewDBDump = new javax.swing.JRadioButton();
        lbPlaceholder2 = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        lbText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbText.setText("Choose Data Extract Mode");
        getContentPane().add(lbText);

        pnExistingDump.setLayout(new java.awt.BorderLayout());

        rbExistingDBDump.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbExistingDBDump.setText("existing Database dump");
        rbExistingDBDump.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbExistingDBDump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onExistingDBDump(evt);
            }
        });
        pnExistingDump.add(rbExistingDBDump, java.awt.BorderLayout.CENTER);

        lbPlaceholder1.setForeground(new java.awt.Color(240, 240, 240));
        lbPlaceholder1.setText("placeholderplaceh");
        pnExistingDump.add(lbPlaceholder1, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pnExistingDump);

        pnNewDump.setLayout(new java.awt.BorderLayout());

        rbNewDBDump.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbNewDBDump.setText("new Database dump");
        rbNewDBDump.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rbNewDBDump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onNewDBDump(evt);
            }
        });
        pnNewDump.add(rbNewDBDump, java.awt.BorderLayout.CENTER);

        lbPlaceholder2.setForeground(new java.awt.Color(240, 240, 240));
        lbPlaceholder2.setText("placeholderplaceh");
        pnNewDump.add(lbPlaceholder2, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pnNewDump);

        btOK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOK(evt);
            }
        });

        javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
        pnButton.setLayout(pnButtonLayout);
        pnButtonLayout.setHorizontalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        pnButtonLayout.setVerticalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonLayout.createSequentialGroup()
                .addComponent(btOK, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onNewDBDump(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onNewDBDump
        // TODO add your handling code here:
    }//GEN-LAST:event_onNewDBDump

    private void onExistingDBDump(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onExistingDBDump
        // TODO add your handling code here:
    }//GEN-LAST:event_onExistingDBDump

    private void onOK(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOK
        // TODO add your handling code here:
    }//GEN-LAST:event_onOK

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
            java.util.logging.Logger.getLogger(DataExtractModeDialogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataExtractModeDialogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataExtractModeDialogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataExtractModeDialogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataExtractModeDialogue dialog = new DataExtractModeDialogue(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.JLabel lbPlaceholder1;
    private javax.swing.JLabel lbPlaceholder2;
    private javax.swing.JLabel lbText;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnExistingDump;
    private javax.swing.JPanel pnNewDump;
    private javax.swing.JRadioButton rbExistingDBDump;
    private javax.swing.JRadioButton rbNewDBDump;
    // End of variables declaration//GEN-END:variables
}