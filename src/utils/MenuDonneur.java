/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import sgbs.Welcome;

/**
 *
 * @author Malaw
 */
public class MenuDonneur extends javax.swing.JFrame {

    /**
     * Creates new form MenuDonneur
     */
    public MenuDonneur() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setSize(d.width, d.height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listeDonneurs = new javax.swing.JButton();
        paillasse = new javax.swing.JButton();
        donneurRares = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listeDonneurs.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        listeDonneurs.setText("LISTE DONNEURS");
        listeDonneurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeDonneursActionPerformed(evt);
            }
        });

        paillasse.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        paillasse.setText("PAILLASSE");
        paillasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paillasseActionPerformed(evt);
            }
        });

        donneurRares.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        donneurRares.setText("DONNEURS RARES");
        donneurRares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donneurRaresActionPerformed(evt);
            }
        });

        quitBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        quitBtn.setText("RETOUR");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(591, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(listeDonneurs, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paillasse, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donneurRares, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(490, 490, 490))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(listeDonneurs, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(donneurRares, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paillasse, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paillasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paillasseActionPerformed
        // TODO add your handling code here:
        dispose();
        Paillasse p = new Paillasse();
        p.setVisible(true);
    }//GEN-LAST:event_paillasseActionPerformed

    private void donneurRaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donneurRaresActionPerformed
        // TODO add your handling code here:
        dispose();
        Rares r = new Rares();
        r.setVisible(true);
    }//GEN-LAST:event_donneurRaresActionPerformed

    private void listeDonneursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeDonneursActionPerformed
        // TODO add your handling code here:
        dispose();
        utils.Donneurs d = new utils.Donneurs();
        d.setVisible(true);
    }//GEN-LAST:event_listeDonneursActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Welcome md = new Welcome();
        md.setVisible(true);
    }//GEN-LAST:event_quitBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donneurRares;
    private javax.swing.JButton listeDonneurs;
    private javax.swing.JButton paillasse;
    private javax.swing.JButton quitBtn;
    // End of variables declaration//GEN-END:variables
}
