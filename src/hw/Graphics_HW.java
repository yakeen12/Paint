package hw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.List;

public class Graphics_HW extends javax.swing.JFrame {

    // I've set the freeDraw as default.
    Graphics g;
    String shape = "free";
    Color color = Color.BLACK;
    int x = 0, y = 0, length = 0, width = 0, x2, y2;

    int size = 5;

    public Graphics_HW() {
        initComponents();

        pnlPage.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlPage = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSquare = new javax.swing.JButton();
        btnCircle = new javax.swing.JButton();
        btnLine = new javax.swing.JButton();
        btnFree = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnPink = new javax.swing.JToggleButton();
        btnRed = new javax.swing.JToggleButton();
        btnBlack = new javax.swing.JToggleButton();
        btnOrange = new javax.swing.JToggleButton();
        btnYellow = new javax.swing.JToggleButton();
        btnGreen = new javax.swing.JToggleButton();
        btnMagenta = new javax.swing.JToggleButton();
        btnCyan = new javax.swing.JToggleButton();
        btnBlue = new javax.swing.JToggleButton();
        btnTextEditor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        pnlPage.setBackground(new java.awt.Color(255, 255, 255));
        pnlPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPage.setPreferredSize(new java.awt.Dimension(450, 450));
        pnlPage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlPageMouseDragged(evt);
            }
        });
        pnlPage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlPageFocusGained(evt);
            }
        });
        pnlPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlPageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlPageMouseReleased(evt);
            }
        });
        pnlPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlPageKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pnlPageKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlPageLayout = new javax.swing.GroupLayout(pnlPage);
        pnlPage.setLayout(pnlPageLayout);
        pnlPageLayout.setHorizontalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );
        pnlPageLayout.setVerticalGroup(
            pnlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(150, 600));

        btnSquare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screw_Head_-_Square_External.svg_ccexpress.png"))); // NOI18N
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/800px-Circle_-_black_simple.svg_ccexpress.png"))); // NOI18N
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        btnLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Draw-1-black-line.svg_ccexpress.png"))); // NOI18N
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });

        btnFree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Education_Draw_1-copy-12_ccexpress.jpeg"))); // NOI18N
        btnFree.setBorder(null);
        btnFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFree, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLine, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFree, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(240, 245, 245));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });

        jButton1.setText("__________");
        buttonGroup2.add(jButton1);
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setText("__________");
        buttonGroup2.add(jButton3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("__________");
        buttonGroup2.add(jButton2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnPink.setBackground(java.awt.Color.pink);
        buttonGroup1.add(btnPink);
        btnPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinkActionPerformed(evt);
            }
        });

        btnRed.setBackground(java.awt.Color.red);
        buttonGroup1.add(btnRed);
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        btnBlack.setBackground(java.awt.Color.black);
        buttonGroup1.add(btnBlack);
        btnBlack.setSelected(true);
        btnBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlackActionPerformed(evt);
            }
        });

        btnOrange.setBackground(java.awt.Color.orange);
        buttonGroup1.add(btnOrange);
        btnOrange.setForeground(java.awt.Color.orange);
        btnOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrangeActionPerformed(evt);
            }
        });

        btnYellow.setBackground(java.awt.Color.yellow);
        buttonGroup1.add(btnYellow);
        btnYellow.setForeground(java.awt.Color.yellow);
        btnYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowActionPerformed(evt);
            }
        });

        btnGreen.setBackground(java.awt.Color.green);
        buttonGroup1.add(btnGreen);
        btnGreen.setForeground(java.awt.Color.green);
        btnGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGreenActionPerformed(evt);
            }
        });

        btnMagenta.setBackground(java.awt.Color.magenta);
        buttonGroup1.add(btnMagenta);
        btnMagenta.setForeground(java.awt.Color.magenta);
        btnMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagentaActionPerformed(evt);
            }
        });

        btnCyan.setBackground(java.awt.Color.cyan);
        buttonGroup1.add(btnCyan);
        btnCyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCyanActionPerformed(evt);
            }
        });

        btnBlue.setBackground(java.awt.Color.blue);
        buttonGroup1.add(btnBlue);
        btnBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlueActionPerformed(evt);
            }
        });

        btnTextEditor.setText("Text Editor");
        btnTextEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextEditorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPink, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCyan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMagenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnTextEditor)))
                    .addComponent(pnlPage, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnTextEditor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMagenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCyan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPink, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(pnlPage, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowActionPerformed
        color = Color.YELLOW;
    }//GEN-LAST:event_btnYellowActionPerformed

    private void btnFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreeActionPerformed
        size = 5;
        shape = "free";
        jPanel1.setVisible(true);
    }//GEN-LAST:event_btnFreeActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        shape = "square";
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnSquareActionPerformed

    private void pnlPageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPageMousePressed
        repaint();
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnlPageMousePressed

    private void pnlPageMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPageMouseDragged

        length = evt.getX() - x;
        width = evt.getY() - y;

        g = pnlPage.getGraphics();
        g.setColor(color);
        switch (shape) {
            case "square":
                repaint();

                g.fillRect(x, y, length, width);

                break;
            case "circle":
                repaint();
                g.fillOval(x, y, length, width);
                break;
            case "line":
                repaint();
                x2 = evt.getX();
                y2 = evt.getY();
                g.drawLine(x, y, x2, y2);
                break;
            case "free":
                x = evt.getX();
                y = evt.getY();
                g.fillOval(x, y, size, size);
                break;

        }


    }//GEN-LAST:event_pnlPageMouseDragged

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        shape = "circle";
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed
        shape = "line";
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnLineActionPerformed

    private void pnlPageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPageMouseReleased

        g = pnlPage.getGraphics();
        g.setColor(color);
        switch (shape) {
            case "square":

                g.fillRect(x, y, length, width);
                break;
            case "circle":
                g.fillOval(x, y, length, width);
                break;
            case "line":
                x2 = evt.getX();
                y2 = evt.getY();
                g.drawLine(x, y, x2, y2);
                break;
            case "free":
                x2 = evt.getX();
                y2 = evt.getY();
                g.fillOval(x2, y2, size, size);
                break;

        }

    }//GEN-LAST:event_pnlPageMouseReleased

    private void btnBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlueActionPerformed
        color = Color.BLUE;
    }//GEN-LAST:event_btnBlueActionPerformed

    private void btnCyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCyanActionPerformed
        color = Color.CYAN;
    }//GEN-LAST:event_btnCyanActionPerformed

    private void btnMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagentaActionPerformed
        color = Color.MAGENTA;
    }//GEN-LAST:event_btnMagentaActionPerformed

    private void btnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackActionPerformed
        color = Color.BLACK;
    }//GEN-LAST:event_btnBlackActionPerformed

    private void btnGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGreenActionPerformed
        color = Color.GREEN;
    }//GEN-LAST:event_btnGreenActionPerformed

    private void btnPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinkActionPerformed
        color = Color.PINK;
    }//GEN-LAST:event_btnPinkActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        color = Color.RED;
    }//GEN-LAST:event_btnRedActionPerformed

    private void btnOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrangeActionPerformed
        color = Color.ORANGE;
    }//GEN-LAST:event_btnOrangeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        size = 20;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        size = 5;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        size = 10;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        System.out.println("formKey"); // to check if this method is being called...
        // apparently it's not.
        int k = evt.getKeyCode();

        switch (k) {
            case KeyEvent.VK_RIGHT:
                x += 5;

                break;
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
            case KeyEvent.VK_UP:
                y += 5;
                break;
            case KeyEvent.VK_DOWN:
                y -= 5;
                break;

        }


    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        g = pnlPage.getGraphics();
        g.setColor(color);
        repaint();
        
        switch (shape) {
            case "square":
                g.fillRect(x, y, length, width);
                break;
                
            case "circle":
                repaint();
                g.fillOval(x, y, length, width);
                break;
                
            case "line":
                repaint();
                g.drawLine(x, y, x2, y2);
                break;
                
            case "free":
                g.fillOval(x, y, size, size);
                break;
        }

    }//GEN-LAST:event_formKeyReleased

    private void pnlPageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlPageKeyPressed
        int k = evt.getKeyCode();

        System.out.println("pnlPageKey");

        switch (k) {
            case KeyEvent.VK_RIGHT:
                x += 5;
                break;
                
            case KeyEvent.VK_LEFT:
                x -= 5;
                break;
                
            case KeyEvent.VK_UP:
                y += 5;
                break;
                
            case KeyEvent.VK_DOWN:
                y -= 5;
                break;
        }
        


    }//GEN-LAST:event_pnlPageKeyPressed

    private void pnlPageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlPageKeyTyped


    }//GEN-LAST:event_pnlPageKeyTyped

    private void btnTextEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextEditorActionPerformed
        this.setVisible(false);
        TextEditor t = new TextEditor();
        t.setVisible(true);

    }//GEN-LAST:event_btnTextEditorActionPerformed

    private void pnlPageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlPageFocusGained

    }//GEN-LAST:event_pnlPageFocusGained

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
            java.util.logging.Logger.getLogger(Graphics_HW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphics_HW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphics_HW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphics_HW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphics_HW().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBlack;
    private javax.swing.JToggleButton btnBlue;
    private javax.swing.JButton btnCircle;
    private javax.swing.JToggleButton btnCyan;
    private javax.swing.JButton btnFree;
    private javax.swing.JToggleButton btnGreen;
    private javax.swing.JButton btnLine;
    private javax.swing.JToggleButton btnMagenta;
    private javax.swing.JToggleButton btnOrange;
    private javax.swing.JToggleButton btnPink;
    private javax.swing.JToggleButton btnRed;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTextEditor;
    private javax.swing.JToggleButton btnYellow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlPage;
    // End of variables declaration//GEN-END:variables
}
