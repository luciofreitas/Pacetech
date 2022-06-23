/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CalculadoraCientifica;

/**
 *
 * @author Lucio
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }

    String op;
    Double n1, n2, res;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tela = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tr�s = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        subtra��o = new javax.swing.JButton();
        multiplica��o = new javax.swing.JButton();
        divis�o = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jToolBar3 = new javax.swing.JToolBar();
        apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora Cientifica"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        tr�s.setText("3");
        tr�s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr�sActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtra��o.setText("-");
        subtra��o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtra��oActionPerformed(evt);
            }
        });

        multiplica��o.setText("*");
        multiplica��o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplica��oActionPerformed(evt);
            }
        });

        divis�o.setText("/");
        divis�o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divis�oActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(sete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(um, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(dois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tr�s, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soma, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(subtra��o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplica��o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divis�o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(soma, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(tr�s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(um, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtra��o, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(multiplica��o, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(sete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divis�o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        jTabbedPane1.addTab("Padr�o", jToolBar1);

        jToolBar2.setRollover(true);
        jTabbedPane1.addTab("tab2", jToolBar2);

        jToolBar3.setRollover(true);
        jTabbedPane1.addTab("tab3", jToolBar3);

        apagar.setText("AC");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(apagar)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(apagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        tela.setText(tela.getText() + "4");
    }//GEN-LAST:event_quatroActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        tela.setText(tela.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        tela.setText(tela.getText() + "1");
    }//GEN-LAST:event_umActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        tela.setText(tela.getText() + "9");
    }//GEN-LAST:event_noveActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        tela.setText(tela.getText() + "2");
    }//GEN-LAST:event_doisActionPerformed

    private void tr�sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr�sActionPerformed
        tela.setText(tela.getText() + "3");
    }//GEN-LAST:event_tr�sActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        tela.setText(tela.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        tela.setText(tela.getText() + "7");
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        tela.setText(tela.getText() + "8");
    }//GEN-LAST:event_oitoActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        tela.setText(tela.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed
        tela.setText("");
    }//GEN-LAST:event_apagarActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        n1 = Double.parseDouble(tela.getText());
        op = "soma";
        tela.setText("");
    }//GEN-LAST:event_somaActionPerformed

    private void subtra��oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtra��oActionPerformed
        n1 = Double.parseDouble(tela.getText());
        op = "subtra��o";
        tela.setText("");
    }//GEN-LAST:event_subtra��oActionPerformed

    private void multiplica��oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplica��oActionPerformed
        n1 = Double.parseDouble(tela.getText());
        op = "multiplica��o";
        tela.setText("");
    }//GEN-LAST:event_multiplica��oActionPerformed

    private void divis�oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divis�oActionPerformed
        n1 = Double.parseDouble(tela.getText());
        op = "divis�o";
        tela.setText("");
    }//GEN-LAST:event_divis�oActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        n2 = Double.parseDouble(tela.getText());
        if (op.equals("soma")) {
            res = n1 + n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("subtra��o")) {
            res = n1 - n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("multiplica��o")) {
            res = n1 * n2;
            tela.setText(Double.toString(res));
        }
        if (op.equals("divis�o")) {
            res = n1 / n2;
            tela.setText(Double.toString(res));
        }
    }//GEN-LAST:event_igualActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton cinco;
    private javax.swing.JButton divis�o;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton multiplica��o;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtra��o;
    private javax.swing.JLabel tela;
    private javax.swing.JButton tr�s;
    private javax.swing.JButton um;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
