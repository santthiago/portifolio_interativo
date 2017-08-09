package br.com.senac.portifolio;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 * Criação de uma calculadora de média academica, podendo, com base nas notas
 * bimestrais, saber se estará aprovado ou não.
 *
 * @author https://github.com/santthiago
 */
public class CalculadoraBimestral extends javax.swing.JFrame {

    /**
     *
     */
    public void calcular() {
        DecimalFormat formatador = new DecimalFormat("#00.0");
        double nota1, nota2, nota3, nota4, notafinal;
        nota1 = Double.parseDouble(txtBimestre1.getText().replace(",", "."));
        nota2 = Double.parseDouble(txtBimestre2.getText().replace(",", "."));
        nota3 = Double.parseDouble(txtBimestre3.getText().replace(",", "."));
        nota4 = Double.parseDouble(txtBimestre4.getText().replace(",", "."));
        notafinal = (nota1 + nota2 + nota3 + nota4);
        if (notafinal < 18) {
            lblResultado.setText("" + formatador.format(notafinal) + " PONTOS");
            lblResultado.setForeground(Color.RED);
        } else if (notafinal > 20) {
            lblResultado.setText("" + formatador.format(notafinal) + " PONTOS");
            lblResultado.setForeground(Color.GREEN);
        } else {
            lblResultado.setText("" + formatador.format(notafinal) + " PONTOS");
            lblResultado.setForeground(Color.ORANGE);
        }
    }

    /**
     *
     */
    public void limpar() {
        txtBimestre1.setText("");
        txtBimestre2.setText("");
        txtBimestre3.setText("");
        txtBimestre4.setText("");
        lblResultado.setText("SUA NOTA É:");
        lblResultado.setForeground(Color.BLACK);

    }

    /**
     *
     */
    public CalculadoraBimestral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBimestre1 = new javax.swing.JTextField();
        txtBimestre2 = new javax.swing.JTextField();
        txtBimestre3 = new javax.swing.JTextField();
        txtBimestre4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CALCULADORA BIMESTRAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBimestre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBimestre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBimestre1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtBimestre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 30));

        txtBimestre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtBimestre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 90, 30));

        txtBimestre3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtBimestre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, 30));

        txtBimestre4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtBimestre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, 30));

        jLabel2.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1º BIMESTRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 17));

        jLabel3.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2º BIMESTRE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 30));

        jLabel4.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3º BIMESTRE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

        jLabel5.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("4º BIMESTRE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 30));

        jLabel6.setFont(new java.awt.Font("Graphite Std Wide", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCREVA SUAS NOTAS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, 40));

        lblResultado.setFont(new java.awt.Font("Graphite Std Wide", 1, 22)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("SUA NOTA É:");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, 40));

        jLabel8.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" 20 PTS OU MAIS  ->  APROVADO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 280, 20));

        jLabel9.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ATÉ 19 PTS  ->  RECUPERAÇÃO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 260, 20));

        jLabel10.setFont(new java.awt.Font("Graphite Std Wide", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ATÉ 18 PTS  ->  REPROVADO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 250, 20));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/bimestral_somar.png"))); // NOI18N
        btnCalcular.setToolTipText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 50));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/bimestral_apagar.png"))); // NOI18N
        btnLimpar.setToolTipText("APAGAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 90, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/bimestral_caderno.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        setSize(new java.awt.Dimension(386, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBimestre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBimestre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBimestre1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBimestral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBimestral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtBimestre1;
    private javax.swing.JTextField txtBimestre2;
    private javax.swing.JTextField txtBimestre3;
    private javax.swing.JTextField txtBimestre4;
    // End of variables declaration//GEN-END:variables
}
