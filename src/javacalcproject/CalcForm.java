/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalcproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author david
 */
public class CalcForm extends javax.swing.JFrame {
    
    private Double numb;
    private Double answer;
    
    private Integer calculation;
    
    //writing calculations to a file
    private String logAction = "";
    
    private Double memory = 0.0;
    private String memoryStr = "";
    
    private String displayNumber = "";
    private Double displayNumberDouble = 0.0;

    /**
     * Creates new form CalcForm
     */
    public CalcForm() {
        initComponents();
    }
    
    public void arithmeticOperations() {
        switch(calculation) {
            case 1:
                answer = numb + Double.parseDouble(txt_Display.getText());
                txt_Display.setText(Double.toString(answer));
                
                logAction += "=" + answer;
                break;
                
            case 2:
                answer = numb - Double.parseDouble(txt_Display.getText());
                txt_Display.setText(Double.toString(answer));
                
                logAction += "=" + answer;
                break;
                
            case 3:
                answer = numb * Double.parseDouble(txt_Display.getText());
                txt_Display.setText(Double.toString(answer));
                
                logAction += "=" + answer;
                break;
                
            case 4:
                answer = numb / Double.parseDouble(txt_Display.getText());
                txt_Display.setText(Double.toString(answer));
                
                logAction += "=" + answer;
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_show = new javax.swing.JLabel();
        txt_Display = new javax.swing.JTextField();
        btn_backspace = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_subtraction = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_multiply = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        memSatusLbl = new javax.swing.JLabel();
        btn_mc = new javax.swing.JButton();
        btn_mr = new javax.swing.JButton();
        btn_ms = new javax.swing.JButton();
        btn_mplus = new javax.swing.JButton();
        btn_m_minus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        lbl_show.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txt_Display.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txt_Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btn_backspace.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_backspace.setText("backspace");
        btn_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backspaceActionPerformed(evt);
            }
        });

        btn_0.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_clear.setText("C");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_add.setText("+");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_subtraction.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_subtraction.setText("-");
        btn_subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subtractionActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_multiply.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_multiply.setText("*");
        btn_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplyActionPerformed(evt);
            }
        });

        btn_1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_dot.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });

        btn_division.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_equal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        btn_mc.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_mc.setText("MC");
        btn_mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mcActionPerformed(evt);
            }
        });

        btn_mr.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_mr.setText("MR");
        btn_mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mrActionPerformed(evt);
            }
        });

        btn_ms.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_ms.setText("MS");
        btn_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_msActionPerformed(evt);
            }
        });

        btn_mplus.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_mplus.setText("M+");
        btn_mplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mplusActionPerformed(evt);
            }
        });

        btn_m_minus.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btn_m_minus.setText("M-");
        btn_m_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m_minusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_show, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mplus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_m_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Display)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(memSatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memSatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mplus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_m_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_subtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "1");
        
        logAction += "1";
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "2");
        
        logAction += "2";
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "3");
        
        logAction += "3";
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "4");
        
        logAction += "4";
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "5");
        
        logAction += "5";
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "6");
        
        logAction += "6";
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "7");
        
        logAction += "7";
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "8");
        
        logAction += "8";
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "9");
        
        logAction += "9";
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + "0");
        
        logAction += "0";
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        // TODO add your handling code here:
        txt_Display.setText(txt_Display.getText() + ".");
        
        logAction += ".";
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backspaceActionPerformed
        // TODO add your handling code here:
        Integer length = txt_Display.getText().length();
        Integer number = txt_Display.getText().length() - 1;
        
        String store;
        
        if (length > 0) {
            StringBuilder back = new StringBuilder(txt_Display.getText());
            
            back.deleteCharAt(number);
            store = back.toString();
            
            txt_Display.setText(store);
        }
    }//GEN-LAST:event_btn_backspaceActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_Display.setText("");
        
        logAction = "";
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        numb = Double.parseDouble(txt_Display.getText());
        calculation = 1;
        
        txt_Display.setText("");
        lbl_show.setText(numb + "+");
        
        
        logAction += "+";
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
        // TODO add your handling code here:
        arithmeticOperations();
        lbl_show.setText("");
        
        File file = new File("calc.txt");
  
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(logAction);
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            
        }
        
        logAction = "";
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_subtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subtractionActionPerformed
        // TODO add your handling code here:
        numb = Double.parseDouble(txt_Display.getText());
        calculation = 2;
        txt_Display.setText("");
        lbl_show.setText(numb + "-");
        
        logAction += "-";
    }//GEN-LAST:event_btn_subtractionActionPerformed

    private void btn_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplyActionPerformed
        // TODO add your handling code here:
        numb = Double.parseDouble(txt_Display.getText());
        calculation = 3;
        txt_Display.setText("");
        lbl_show.setText(numb + "*");
        
        logAction += "*";
    }//GEN-LAST:event_btn_multiplyActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // TODO add your handling code here:
        numb = Double.parseDouble(txt_Display.getText());
        calculation = 4;
        txt_Display.setText("");
        lbl_show.setText(numb + "/");
        
        logAction += "/";
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mcActionPerformed
        // TODO add your handling code here:
//        System.out.println("clear memory");
        
        memory = 0.0;
        memSatusLbl.setText("");
    }//GEN-LAST:event_btn_mcActionPerformed

    private void btn_mrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mrActionPerformed
        // TODO add your handling code here:
//        System.out.println("read memory");
        
        memoryStr = Double.toString(memory);
        txt_Display.setText(memoryStr);
        
        logAction += memoryStr;
    }//GEN-LAST:event_btn_mrActionPerformed

    private void btn_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_msActionPerformed
        // TODO add your handling code here:
//        System.out.println("save in memory");
        
        memory = Double.parseDouble(txt_Display.getText());
        
        memSatusLbl.setText("M");
    }//GEN-LAST:event_btn_msActionPerformed

    private void btn_mplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mplusActionPerformed
        // TODO add your handling code here:
//        System.out.println("add to memory");
        
        displayNumber = txt_Display.getText();
        displayNumberDouble = Double.parseDouble(displayNumber);
        
        memory += displayNumberDouble;
    }//GEN-LAST:event_btn_mplusActionPerformed

    private void btn_m_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m_minusActionPerformed
        // TODO add your handling code here:
//        System.out.println("minus from memory");
        
        displayNumber = txt_Display.getText();
        displayNumberDouble = Double.parseDouble(displayNumber);
        
        memory -= displayNumberDouble;
    }//GEN-LAST:event_btn_m_minusActionPerformed

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
            java.util.logging.Logger.getLogger(CalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_backspace;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_m_minus;
    private javax.swing.JButton btn_mc;
    private javax.swing.JButton btn_mplus;
    private javax.swing.JButton btn_mr;
    private javax.swing.JButton btn_ms;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_subtraction;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_show;
    private javax.swing.JLabel memSatusLbl;
    private javax.swing.JTextField txt_Display;
    // End of variables declaration//GEN-END:variables
}
