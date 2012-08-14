/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AbugidaPanel.java
 *
 * Created on Aug 7, 2012, 7:58:31 PM
 */

package lcs.ui.panels;

import java.awt.Font;
/**
 *
 * @author Timothy
 */
public class AbugidaPanel extends javax.swing.JPanel {

    /** Creates new form AbugidaPanel */
    public AbugidaPanel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        abugidaFontLabel = new javax.swing.JLabel();
        abugidaBorrowedRadio = new javax.swing.JRadioButton();
        abugidaCustomRadio = new javax.swing.JRadioButton();
        abugidaFontField = new javax.swing.JTextField();
        abugidaChooseFontButton = new javax.swing.JButton();
        abugidaNumberGlyphLabel = new javax.swing.JLabel();
        abugidaNumberGlyphsSpinner = new javax.swing.JSpinner();
        glyphNumberDropDown = new javax.swing.JComboBox();
        usedInlabel = new javax.swing.JLabel();
        abugidaUsiedInDropDwon = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        abugidaCapRuleLabel = new javax.swing.JLabel();
        abugidaCapRuleDropDown = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(710, 303));

        abugidaFontLabel.setText("Font");

        buttonGroup1.add(abugidaBorrowedRadio);
        abugidaBorrowedRadio.setSelected(true);
        abugidaBorrowedRadio.setText("Borrowed");

        buttonGroup1.add(abugidaCustomRadio);
        abugidaCustomRadio.setText("Custom");

        abugidaFontField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abugidaFontFieldActionPerformed(evt);
            }
        });

        abugidaChooseFontButton.setText("Choose");
        abugidaChooseFontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abugidaChooseFontButtonActionPerformed(evt);
            }
        });

        abugidaNumberGlyphLabel.setText("Glyphs/Letter");

        abugidaNumberGlyphsSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        glyphNumberDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Glyph_1", "Glyph_2", "Glyph_3", "Glyph_4" }));
        glyphNumberDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glyphNumberDropDownActionPerformed(evt);
            }
        });

        usedInlabel.setText("Used in");

        abugidaUsiedInDropDwon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Initial", "Init/Med", "Medial", "Med/Final", "Upper", "Lower" }));
        abugidaUsiedInDropDwon.setPreferredSize(new java.awt.Dimension(61, 20));
        abugidaUsiedInDropDwon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abugidaUsiedInDropDwonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pronunciation", "Glyph 1"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        abugidaCapRuleLabel.setText("Capitalization Rule");
        abugidaCapRuleLabel.setEnabled(false);

        abugidaCapRuleDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sentence", "Nouns", "Words", "None" }));
        abugidaCapRuleDropDown.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abugidaFontLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaBorrowedRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaCustomRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaFontField, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaChooseFontButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abugidaNumberGlyphLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaNumberGlyphsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(glyphNumberDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(usedInlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaUsiedInDropDwon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(abugidaCapRuleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abugidaCapRuleDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abugidaFontLabel)
                    .addComponent(abugidaBorrowedRadio)
                    .addComponent(abugidaCustomRadio)
                    .addComponent(abugidaFontField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abugidaChooseFontButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abugidaNumberGlyphLabel)
                    .addComponent(abugidaNumberGlyphsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(glyphNumberDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usedInlabel)
                    .addComponent(abugidaUsiedInDropDwon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abugidaCapRuleLabel)
                    .addComponent(abugidaCapRuleDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abugidaFontFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abugidaFontFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abugidaFontFieldActionPerformed

    private void abugidaChooseFontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abugidaChooseFontButtonActionPerformed
        lcs.ui.dialogs.lcsFontChooser lfc= new lcs.ui.dialogs.lcsFontChooser(new javax.swing.JFrame());
        lfc.setVisible(true);
        Font daFont = lfc.getSelectedFont();
        abugidaFontField.setText(daFont.getFontName());
    }//GEN-LAST:event_abugidaChooseFontButtonActionPerformed

    private void glyphNumberDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glyphNumberDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glyphNumberDropDownActionPerformed

    private void abugidaUsiedInDropDwonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abugidaUsiedInDropDwonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abugidaUsiedInDropDwonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abugidaBorrowedRadio;
    private javax.swing.JComboBox abugidaCapRuleDropDown;
    private javax.swing.JLabel abugidaCapRuleLabel;
    private javax.swing.JButton abugidaChooseFontButton;
    private javax.swing.JRadioButton abugidaCustomRadio;
    private javax.swing.JTextField abugidaFontField;
    private javax.swing.JLabel abugidaFontLabel;
    private javax.swing.JLabel abugidaNumberGlyphLabel;
    private javax.swing.JSpinner abugidaNumberGlyphsSpinner;
    private javax.swing.JComboBox abugidaUsiedInDropDwon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox glyphNumberDropDown;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel usedInlabel;
    // End of variables declaration//GEN-END:variables

}
