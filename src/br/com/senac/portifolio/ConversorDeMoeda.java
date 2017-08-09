package br.com.senac.portifolio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *  CRIAÇÃO DE UMA CALCULADORA CONVERSORA DE MOEDAS (R$ / US$)
 * @author https://github.com/santthiago
 */
public class ConversorDeMoeda extends javax.swing.JFrame {
    DecimalFormat formatador = new DecimalFormat("#0.00");
    
    /**
     *
     */
    public void calcular_real(){
        double valor1, valor2, resultado;
        valor1 = Double.parseDouble(txtCampo1.getText().replace(",","."));
        valor2 = Double.parseDouble(txtCampo2.getText().replace(",","."));
        resultado = valor2*valor1;
        JOptionPane.showMessageDialog(null, "VALOR EM REAIS R$: " + formatador.format(resultado)+" REAIS");
        }
        
    /**
     *
     */
    public void calcular_dolar(){
        double valor1, valor2, resultado2;
        valor1 = Double.parseDouble(txtCampo1.getText().replace(",","."));
        valor2 = Double.parseDouble(txtCampo2.getText().replace(",","."));
        resultado2 = valor2/valor1;
        JOptionPane.showMessageDialog(null, "VALOR EM DOLARES US$: " + formatador.format(resultado2)+" DOLARES");
        }
  
    /**
     *
     */
    public ConversorDeMoeda() {
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

        jLabel2 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        txtCampo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnReal = new javax.swing.JButton();
        btnDolar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CONVERSOR DE MOEDAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DESEJA CONVERTER PARA REAL OU DOLAR?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        txtCampo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCampo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCampo1.setToolTipText("INSIRA A COTAÇÃO ATUAL DO DOLAR");
        getContentPane().add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 120, 30));

        txtCampo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCampo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCampo2.setToolTipText("INSIRA UM VALOR PARA CONVERSÃO");
        getContentPane().add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("COTAÇÃO DO DOLAR R$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 149, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VALOR A SER CONVERTIDO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 167, 30));

        btnReal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReal.setText("DE DOLARES R$ PARA REAIS R$");
        btnReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealActionPerformed(evt);
            }
        });
        getContentPane().add(btnReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 52));

        btnDolar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDolar.setText("DE REAIS R$ PARA DOLARES R$");
        btnDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 52));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/conversor_moeda.png"))); // NOI18N
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, 330, 250));

        setSize(new java.awt.Dimension(356, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealActionPerformed
        // chamando metodo calcular
        calcular_real();

    }//GEN-LAST:event_btnRealActionPerformed

    private void btnDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDolarActionPerformed
        // TODO add your handling code here:
        calcular_dolar();
    }//GEN-LAST:event_btnDolarActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorDeMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorDeMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorDeMoeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDolar;
    private javax.swing.JButton btnReal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCampo1;
    private javax.swing.JTextField txtCampo2;
    // End of variables declaration//GEN-END:variables
}