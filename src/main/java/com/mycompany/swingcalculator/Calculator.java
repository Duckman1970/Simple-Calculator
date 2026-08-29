package com.mycompany.swingcalculator;

/**
 *
 * @author Vitor
 */
public class Calculator extends javax.swing.JFrame {
    private double val;
    private int count = 0;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculator.class.getName());

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        this.setTitle("Calculator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnDoubleZero = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnSubtration = new javax.swing.JButton();
        btnDelEverything = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblPreviousValue = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(this::number1ActionPerformed);

        number2.setText("2");
        number2.addActionListener(this::number2ActionPerformed);

        number3.setText("3");
        number3.addActionListener(this::number3ActionPerformed);

        number4.setText("4");
        number4.addActionListener(this::number4ActionPerformed);

        number5.setText("5");
        number5.addActionListener(this::number5ActionPerformed);

        number6.setText("6");
        number6.addActionListener(this::number6ActionPerformed);

        number7.setText("7");
        number7.addActionListener(this::number7ActionPerformed);

        number8.setText("8");
        number8.addActionListener(this::number8ActionPerformed);

        number9.setText("9");
        number9.addActionListener(this::number9ActionPerformed);

        number0.setText("0");
        number0.addActionListener(this::number0ActionPerformed);

        btnPoint.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnPoint.setText(".");
        btnPoint.addActionListener(this::btnPointActionPerformed);

        btnDoubleZero.setText("00");
        btnDoubleZero.addActionListener(this::btnDoubleZeroActionPerformed);

        btnDivision.setForeground(new java.awt.Color(0, 102, 0));
        btnDivision.setText("÷");
        btnDivision.addActionListener(this::btnDivisionActionPerformed);

        btnMultiplication.setForeground(new java.awt.Color(0, 102, 0));
        btnMultiplication.setText("x");
        btnMultiplication.addActionListener(this::btnMultiplicationActionPerformed);

        btnAddition.setForeground(new java.awt.Color(0, 102, 0));
        btnAddition.setText("+");
        btnAddition.addActionListener(this::btnAdditionActionPerformed);

        btnSubtration.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSubtration.setForeground(new java.awt.Color(0, 102, 0));
        btnSubtration.setText("-");
        btnSubtration.addActionListener(this::btnSubtrationActionPerformed);

        btnDelEverything.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        btnDelEverything.setForeground(new java.awt.Color(0, 102, 0));
        btnDelEverything.setText("C");
        btnDelEverything.addActionListener(this::btnDelEverythingActionPerformed);

        btnPercentage.setForeground(new java.awt.Color(0, 102, 0));
        btnPercentage.setText("%");
        btnPercentage.addActionListener(this::btnPercentageActionPerformed);

        btnEquals.setBackground(new java.awt.Color(0, 102, 0));
        btnEquals.setText("=");
        btnEquals.addActionListener(this::btnEqualsActionPerformed);

        result.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel1.setText("C:");

        lblPreviousValue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblPreviousValue.setForeground(new java.awt.Color(255, 0, 0));
        lblPreviousValue.setText("0");

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swingcalculator/delete-button-icon.png"))); // NOI18N
        btnDel.setMaximumSize(new java.awt.Dimension(23, 23));
        btnDel.setMinimumSize(new java.awt.Dimension(23, 23));
        btnDel.setPreferredSize(new java.awt.Dimension(23, 23));
        btnDel.addActionListener(this::btnDelActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPreviousValue))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDelEverything, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(number9, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMultiplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDoubleZero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubtration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPreviousValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelEverything, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(number0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoubleZero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSubtration, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enteredNumber(String a) {
        String value = result.getText()+a;
        result.setText(value);
    }
    
    private void delete(int q) {
        String text = result.getText();
        int characQuant = text.length();
        int calc = characQuant-q;
        String end = text.substring(0,calc);
        result.setText(end);
    }
    
    private void calculationBellow(double value) {
        if (value%1 != 0.0) {
            lblPreviousValue.setText(Double.toString(value));
        } else {
            int convert = (int) value;
            lblPreviousValue.setText(Integer.toString(convert));
        }
    }
    
    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        enteredNumber("9");
    }//GEN-LAST:event_number9ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        enteredNumber("8");
    }//GEN-LAST:event_number8ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        enteredNumber("7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        enteredNumber("2");
    }//GEN-LAST:event_number2ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
       enteredNumber("1");
    }//GEN-LAST:event_number1ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
       enteredNumber("6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
       enteredNumber("5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
       enteredNumber("4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
       enteredNumber("3");
    }//GEN-LAST:event_number3ActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
       enteredNumber("0");
    }//GEN-LAST:event_number0ActionPerformed
    
    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        count++;
        if (count == 1) {
            val = Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        } else if (count > 1) {
            val += Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        }
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        if (val%1 == 0.0) {
            int paraInt = (int) val;
            lblPreviousValue.setText("");
            result.setText(Integer.toString(paraInt));
            count = 0;
        } else {
            lblPreviousValue.setText("");
            result.setText(Double.toString(val));
            count = 0;
        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnDelEverythingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelEverythingActionPerformed
        count = 0;
        val = 0;
        lblPreviousValue.setText("");
        result.setText("");
    }//GEN-LAST:event_btnDelEverythingActionPerformed

    private void btnSubtrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrationActionPerformed
        count++;
        if (count == 1) {
            val = Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        } else if (count > 1) {
            val -= Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        }
    }//GEN-LAST:event_btnSubtrationActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        count++;
        if (count == 1) {
            val = Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        } else if (count > 1) {
            val *= Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        }
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        count++;
        if (count == 1) {
            val = Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        } else if (count > 1) {
            val /= Double.parseDouble(result.getText());
            calculationBellow(val);
            result.setText("");
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        enteredNumber(".");
    }//GEN-LAST:event_btnPointActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        delete(1);
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnDoubleZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoubleZeroActionPerformed
        enteredNumber("00");
    }//GEN-LAST:event_btnDoubleZeroActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        double value = Double.parseDouble(result.getText());
        double calc = value/100;
        result.setText(Double.toString(calc));
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Calculator().setVisible(true));
    }

    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelEverything;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDoubleZero;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSubtration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPreviousValue;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JTextField result;
    // End of variables declaration                   
}
