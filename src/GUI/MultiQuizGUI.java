/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 * MultiQuizGUI.java
 * @author Danny O'Sullivan
 * Student No. x14110750
 */
public class MultiQuizGUI extends javax.swing.JPanel {

    /**
     * Creates new form MultiQuizGUI
     */
    public MultiQuizGUI() {
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

        MultiQuizPanel = new javax.swing.JPanel();
        MultiQ = new javax.swing.JLabel();
        MultiSelect = new javax.swing.JLabel();
        MultiOneBtn = new javax.swing.JRadioButton();
        MultiTwoBtn = new javax.swing.JRadioButton();
        MultiThreeBtn = new javax.swing.JRadioButton();
        MultiFourBtn = new javax.swing.JRadioButton();
        NextQBttn = new javax.swing.JButton();

        setLayout(null);

        MultiQuizPanel.setBackground(new java.awt.Color(245, 171, 53));
        MultiQuizPanel.setLayout(null);

        MultiQ.setBackground(new java.awt.Color(230, 126, 34));
        MultiQ.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        MultiQ.setText("          What is 2 + 2?");
        MultiQuizPanel.add(MultiQ);
        MultiQ.setBounds(57, 62, 229, 121);

        MultiSelect.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MultiSelect.setText("Please select one of the Following:");
        MultiQuizPanel.add(MultiSelect);
        MultiSelect.setBounds(30, 219, 300, 17);

        MultiOneBtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MultiOneBtn.setText("6");
        MultiOneBtn.setContentAreaFilled(false);
        MultiQuizPanel.add(MultiOneBtn);
        MultiOneBtn.setBounds(57, 392, 33, 27);

        MultiTwoBtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MultiTwoBtn.setText("3");
        MultiTwoBtn.setContentAreaFilled(false);
        MultiQuizPanel.add(MultiTwoBtn);
        MultiTwoBtn.setBounds(57, 274, 33, 27);

        MultiThreeBtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MultiThreeBtn.setText("4");
        MultiThreeBtn.setContentAreaFilled(false);
        MultiQuizPanel.add(MultiThreeBtn);
        MultiThreeBtn.setBounds(57, 332, 33, 27);

        MultiFourBtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MultiFourBtn.setText("8");
        MultiFourBtn.setContentAreaFilled(false);
        MultiQuizPanel.add(MultiFourBtn);
        MultiFourBtn.setBounds(57, 449, 33, 27);

        NextQBttn.setBackground(new java.awt.Color(255, 255, 255));
        NextQBttn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NextQBttn.setText("Next");
        NextQBttn.setContentAreaFilled(false);
        NextQBttn.setOpaque(true);
        NextQBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQBttnActionPerformed(evt);
            }
        });
        MultiQuizPanel.add(NextQBttn);
        NextQBttn.setBounds(250, 488, 75, 30);

        add(MultiQuizPanel);
        MultiQuizPanel.setBounds(0, 0, 336, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void NextQBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextQBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextQBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton MultiFourBtn;
    private javax.swing.JRadioButton MultiOneBtn;
    private javax.swing.JLabel MultiQ;
    private javax.swing.JPanel MultiQuizPanel;
    private javax.swing.JLabel MultiSelect;
    private javax.swing.JRadioButton MultiThreeBtn;
    private javax.swing.JRadioButton MultiTwoBtn;
    private javax.swing.JButton NextQBttn;
    // End of variables declaration//GEN-END:variables
}
