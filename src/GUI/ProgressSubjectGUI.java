/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author x14729249
 */
public class ProgressSubjectGUI extends javax.swing.JPanel {

    /**
     * Creates new form ProgressSubjectGUI
     */
    public ProgressSubjectGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgTrackSubject = new javax.swing.JPanel();
        subjectAverageLbl = new javax.swing.JLabel();
        graphBackground = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        backLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(370, 532));

        ProgTrackSubject.setBackground(new java.awt.Color(242, 38, 19));
        ProgTrackSubject.setLayout(null);

        subjectAverageLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        subjectAverageLbl.setForeground(new java.awt.Color(255, 255, 255));
        subjectAverageLbl.setText("Average: ");
        ProgTrackSubject.add(subjectAverageLbl);
        subjectAverageLbl.setBounds(30, 300, 250, 50);

        graphBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/graph.png"))); // NOI18N
        ProgTrackSubject.add(graphBackground);
        graphBackground.setBounds(10, 50, 310, 209);

        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        ProgTrackSubject.add(backBtn);
        backBtn.setBounds(10, 460, 50, 50);

        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backBtn.png"))); // NOI18N
        backLbl.setToolTipText("");
        ProgTrackSubject.add(backLbl);
        backLbl.setBounds(10, 460, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgTrackSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgTrackSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if(layout instanceof CardLayout){
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "PROGRESS");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProgTrackSubject;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel graphBackground;
    private javax.swing.JLabel subjectAverageLbl;
    // End of variables declaration//GEN-END:variables
}
