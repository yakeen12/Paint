/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JTextArea;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author yakee
 */
public class TextEditor extends javax.swing.JFrame {

    String text;
    int size = 11;
    String family = "Tahoma";
    Font f = new Font(family, Font.PLAIN, size);
    StyledDocument sd;

    public TextEditor() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnRightAlignment = new javax.swing.JToggleButton();
        btnCenterAlignment = new javax.swing.JToggleButton();
        btnLeftAlignment = new javax.swing.JToggleButton();
        comFontSize = new javax.swing.JComboBox<>();
        comFontFamily = new javax.swing.JComboBox<>();
        btnColor = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnGraphics = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(btnRightAlignment);
        btnRightAlignment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hw/84409_ccexpress.png"))); // NOI18N
        btnRightAlignment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRightAlignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightAlignmentActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnCenterAlignment);
        btnCenterAlignment.setIcon(new javax.swing.ImageIcon("C:\\Users\\yakee\\Downloads\\84402_ccexpress.png")); // NOI18N
        btnCenterAlignment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCenterAlignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenterAlignmentActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnLeftAlignment);
        btnLeftAlignment.setIcon(new javax.swing.ImageIcon("C:\\Users\\yakee\\Downloads\\84343_ccexpress.png")); // NOI18N
        btnLeftAlignment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLeftAlignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftAlignmentActionPerformed(evt);
            }
        });

        comFontSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "6", "8", "11 (default)", "12", "14", "16", "18", "20", "24", "26", "28", "36", "48", "72" }));
        comFontSize.setSelectedIndex(3);
        comFontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comFontSizeActionPerformed(evt);
            }
        });

        comFontFamily.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahoma", "Tempus Sans ITC", "Algerian", "Bernard MT Condensed" }));
        comFontFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comFontFamilyActionPerformed(evt);
            }
        });

        btnColor.setText("Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnPaste.setText("Paste");
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });

        btnGraphics.setText("Graphics");
        btnGraphics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphicsActionPerformed(evt);
            }
        });

        txtOutput.setText("type your text here:");
        jScrollPane2.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(btnCopy))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLeftAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCenterAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRightAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPaste)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 124, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGraphics, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(comFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comFontFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLeftAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCenterAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRightAlignment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnGraphics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comFontFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColor)
                    .addComponent(btnCopy)
                    .addComponent(btnPaste))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        text = txtOutput.getText();

    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnCenterAlignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenterAlignmentActionPerformed
        // txtOutput.setAlignmentX(txtOutput.CENTER_ALIGNMENT);
        //txtOutput.setText(txtOutput.getText());

        sd = txtOutput.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        sd.setParagraphAttributes(0, sd.getLength(), center, false);
    }//GEN-LAST:event_btnCenterAlignmentActionPerformed

    private void btnLeftAlignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftAlignmentActionPerformed
        //txtOutput.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        //txtOutput.setText(txtOutput.getText());

        sd = txtOutput.getStyledDocument();
        SimpleAttributeSet left = new SimpleAttributeSet();
        StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
        sd.setParagraphAttributes(0, sd.getLength(), left, false);

    }//GEN-LAST:event_btnLeftAlignmentActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        Color color = JColorChooser.showDialog(this, "", Color.BLACK);
        txtOutput.setForeground(color);

    }//GEN-LAST:event_btnColorActionPerformed

    private void btnRightAlignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightAlignmentActionPerformed
        sd = txtOutput.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        sd.setParagraphAttributes(0, sd.getLength(), right, false);

    }//GEN-LAST:event_btnRightAlignmentActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        if (text != null) {
            txtOutput.setText(txtOutput.getText() + " " + text);

        }
    }//GEN-LAST:event_btnPasteActionPerformed

    private void comFontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comFontSizeActionPerformed
        if (comFontSize.getSelectedIndex() == 3) {
            f = new Font(family, Font.PLAIN, 11);
            txtOutput.setFont(f);
        } else if (!(comFontSize.getSelectedIndex() == 3)) {
            size = Integer.parseInt(comFontSize.getSelectedItem().toString());

            f = new Font(family, Font.PLAIN, size);
            txtOutput.setFont(f);
        }

    }//GEN-LAST:event_comFontSizeActionPerformed

    private void comFontFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comFontFamilyActionPerformed
        family = comFontFamily.getSelectedItem().toString();
        f = new Font(family, Font.PLAIN, size);
        txtOutput.setFont(f);
    }//GEN-LAST:event_comFontFamilyActionPerformed

    private void btnGraphicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphicsActionPerformed
        this.setVisible(false);
        Graphics_HW g = new Graphics_HW();
        g.setVisible(true);
    }//GEN-LAST:event_btnGraphicsActionPerformed

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
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCenterAlignment;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGraphics;
    private javax.swing.JToggleButton btnLeftAlignment;
    private javax.swing.JButton btnPaste;
    private javax.swing.JToggleButton btnRightAlignment;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comFontFamily;
    private javax.swing.JComboBox<String> comFontSize;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane txtOutput;
    // End of variables declaration//GEN-END:variables
}
