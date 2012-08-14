/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SyllabaryPanel.java
 *
 * Created on Aug 7, 2012, 7:59:36 PM
 */

package lcs.ui.panels;

import java.awt.Font;
/**
 *
 * @author Timothy
 */
public class SyllabaryPanel extends javax.swing.JPanel {

    /** Creates new form SyllabaryPanel */
    public SyllabaryPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        syllabaryButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        syllabaryTable = new javax.swing.JTable();
        syllabaryFoneLabel = new javax.swing.JLabel();
        syllabaryBorrowedRadio = new javax.swing.JRadioButton();
        syllabaryCustomRadio = new javax.swing.JRadioButton();
        syllabaryFontField = new javax.swing.JTextField();
        chooseSyllabaryFontButton = new javax.swing.JButton();

        syllabaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"b", null, null, null, null, null},
                {"c", null, null, null, null, null},
                {"d", null, null, null, null, null},
                {"f", null, null, null, null, null},
                {"g", null, null, null, null, null},
                {"h", null, null, null, null, null},
                {"j", null, null, null, null, null},
                {"k", null, null, null, null, null},
                {"l", null, null, null, null, null},
                {"m", null, null, null, null, null},
                {"n", null, null, null, null, null},
                {"p", null, null, null, null, null},
                {"q", null, null, null, null, null},
                {"r", null, null, null, null, null},
                {"s", null, null, null, null, null},
                {"t", null, null, null, null, null},
                {"v", null, null, null, null, null},
                {"w", null, null, null, null, null},
                {"x", null, null, null, null, null},
                {"y", null, null, null, null, null},
                {"z", null, null, null, null, null}
            },
            new String [] {
                "Consonant", "a", "e", "i", "o", "u"
            }
        ));
        jScrollPane1.setViewportView(syllabaryTable);

        syllabaryFoneLabel.setText("Font");

        syllabaryButtonGroup.add(syllabaryBorrowedRadio);
        syllabaryBorrowedRadio.setText("Borrowed");

        syllabaryButtonGroup.add(syllabaryCustomRadio);
        syllabaryCustomRadio.setText("Custom");

        syllabaryFontField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syllabaryFontFieldActionPerformed(evt);
            }
        });

        chooseSyllabaryFontButton.setText("Choose");
        chooseSyllabaryFontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseSyllabaryFontButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(syllabaryFoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(syllabaryBorrowedRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(syllabaryCustomRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(syllabaryFontField, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chooseSyllabaryFontButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(syllabaryFoneLabel)
                    .addComponent(syllabaryBorrowedRadio)
                    .addComponent(syllabaryCustomRadio)
                    .addComponent(syllabaryFontField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseSyllabaryFontButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void syllabaryFontFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syllabaryFontFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_syllabaryFontFieldActionPerformed

    private void chooseSyllabaryFontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseSyllabaryFontButtonActionPerformed
        lcs.ui.dialogs.lcsFontChooser lfc= new lcs.ui.dialogs.lcsFontChooser(new javax.swing.JFrame());
        lfc.setVisible(true);
        Font daFont = lfc.getSelectedFont();
        syllabaryFontField.setText(daFont.getFontName());
    }//GEN-LAST:event_chooseSyllabaryFontButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseSyllabaryFontButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton syllabaryBorrowedRadio;
    private javax.swing.ButtonGroup syllabaryButtonGroup;
    private javax.swing.JRadioButton syllabaryCustomRadio;
    private javax.swing.JLabel syllabaryFoneLabel;
    private javax.swing.JTextField syllabaryFontField;
    private javax.swing.JTable syllabaryTable;
    // End of variables declaration//GEN-END:variables

}
