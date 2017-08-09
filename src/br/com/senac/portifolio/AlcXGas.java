package br.com.senac.portifolio;

import java.awt.Color;
import javafx.print.PrintColor;

/**
 * CRIAÇÃO DE UMA CALCULADORA DE COMBUSTIVEL  * FACILITANDO A VIDA DAQUELES QUE SE ENTERESSAM EM SABER QUAL COMBUSTIVEL COMPENSA MAIS $$ NA HORA DE ABASTECER.
 * @author https://github.com/santthiago
 */
public class AlcXGas extends javax.swing.JFrame {

    private void calcular(){
        double alcool, gasolina;
        alcool = Double.parseDouble(txtAlcool.getText().replace(",", "."));
        gasolina = Double.parseDouble(txtGasolina.getText().replace(",", "."));
        if (alcool < 0.7 * gasolina) {
           lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/combustivel_etanol.png")));
           lblMensagem.setText("ABASTEÇA COM ETANOL");
           lblMensagem.setForeground(Color.GREEN);
        } else {
             lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/combustivel_gasolina.png")));
             lblMensagem.setText("ABASTEÇA COM GASOLINA");
             lblMensagem.setForeground(Color.RED);
        }
    }
    
    private void limpar(){
        txtAlcool.setText("");
        txtGasolina.setText("");
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/combustivel_neutro.png")));;
        lblMensagem.setText("");
    }
    
    /**
     *
     */
    public AlcXGas() {
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

        txtAlcool = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGasolina = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALCOOL OU GASOLINA?");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAlcool.setToolTipText("ESCREVA O VALOR DO ETANOL/LITRO");
        getContentPane().add(txtAlcool, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 111, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ALCOOL R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("GASOLINA R$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        txtGasolina.setToolTipText("ESCREVA O PREÇO DA GASOLINA/LITRO");
        getContentPane().add(txtGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 111, 30));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/combustivel_calcular.png"))); // NOI18N
        btnCalcular.setToolTipText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 70));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/borracha.png"))); // NOI18N
        btnLimpar.setToolTipText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, 70));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/combustivel_neutro.png"))); // NOI18N
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 240));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("DESCUBRA QUAL COMPENSA MAIS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 30, 320, 43));

        lblMensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, 372, 23));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/retangulo-brancos.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 390, -1));

        setSize(new java.awt.Dimension(407, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AlcXGas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlcXGas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlcXGas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlcXGas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlcXGas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtAlcool;
    private javax.swing.JTextField txtGasolina;
    // End of variables declaration//GEN-END:variables
}