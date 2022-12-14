/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author Ejiga Samuel
 */
public class Calc extends javax.swing.JFrame {
    int fstnum;
    int sndnum;
    int result;
    String operators;

    /**
     * Creates new form Calc
     */
    public Calc() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        txtDisp = new javax.swing.JTextField();
        sci = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Clear.setBackground(new java.awt.Color(255, 102, 51));
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(255, 102, 51));
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setBackground(new java.awt.Color(255, 102, 51));
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        mul.setBackground(new java.awt.Color(255, 102, 51));
        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(255, 102, 51));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(255, 102, 51));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        txtDisp.setBackground(new java.awt.Color(204, 204, 255));
        txtDisp.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        txtDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDispActionPerformed(evt);
            }
        });

        sci.setBackground(new java.awt.Color(255, 102, 51));
        sci.setText("Sci");
        sci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(div, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sci, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(sub)
                    .addComponent(mul))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two)
                    .addComponent(three))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero)
                    .addComponent(equals)
                    .addComponent(div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sci)
                    .addComponent(Clear))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+two.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_twoActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+five.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_fiveActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+eight.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+nine.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_nineActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+one.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_oneActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+three.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_threeActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+zero.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_zeroActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+seven.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_sevenActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+six.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_sixActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        String EntNum = txtDisp.getText()+four.getText();
        txtDisp.setText(EntNum);
    }//GEN-LAST:event_fourActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        fstnum = Integer.parseInt(txtDisp.getText());
        txtDisp.setText("");
        operators = "+";
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        fstnum = Integer.parseInt(txtDisp.getText());
        txtDisp.setText("");
        operators = "-";
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        // TODO add your handling code here:
        fstnum = Integer.parseInt(txtDisp.getText());
        txtDisp.setText("");
        operators = "*";
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
        fstnum = Integer.parseInt(txtDisp.getText());
        txtDisp.setText("");
        operators = "/";
    }//GEN-LAST:event_divActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        // TODO add your handling code here:
        sndnum = Integer.parseInt(txtDisp.getText());
//        switch(operators){
//            case "+": result = fstnum + sndnum; break; 
//            case "-": result = fstnum - sndnum; break;
//                case "*": result = fstnum * sndnum; break;
//                    case "/": result = fstnum / sndnum; break;
//        }
        if(operators.equals("+")){
            result = fstnum + sndnum;
        }
        else if(operators.equals("-")){
            result = fstnum - sndnum;
        }
        else if(operators.equals("*")){
            result = fstnum * sndnum;
        }
        else if(operators.equals("/")){
            result = fstnum / sndnum;
        }
        
        txtDisp.setText(result+ "");
    }//GEN-LAST:event_equalsActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        sndnum = 0;
        txtDisp.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void txtDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDispActionPerformed

    private void sciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sciActionPerformed
        // TODO add your handling code here:
        SciCalc f2 = new SciCalc();
         f2.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_sciActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton add;
    private javax.swing.JButton div;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton mul;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton sci;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JTextField txtDisp;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
