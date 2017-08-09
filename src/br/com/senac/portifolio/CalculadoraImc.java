package br.com.senac.portifolio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * CRIANDO O SISTEMA DE UMA CALCULADORA DE IMC* (INDICE DE MASSA CORPORAL)
 * @author https://github.com/santthiago
 */

public class CalculadoraImc extends javax.swing.JFrame {

    /**
     *
     */
    public void calcular(){
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        float peso,altura,imc;
        // entrada de dados
        peso = Float.parseFloat(txtPeso.getText().replace(",","."));
        altura = Float.parseFloat(txtAltura.getText().replace(",","."));
        // processamento
        imc = (peso / (altura*altura));
        // saida
        lblImc.setText("" + formatador.format(imc));
        //criando laço para troca de imagens
        if (imc < 18.5) {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela_abaixo.jpg")));
        } else if (imc >= 18.5 && imc < 25){
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela_normal.jpg")));
        } else if (imc >=25 && imc < 30 ){
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela_acima.jpg")));
        } else if (imc >= 30){
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela_obeso.jpg")));
        }
    }

    /**
     *
     */
    public CalculadoraImc() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblImc = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CALCULADORA IMC");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        lblPeso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPeso.setText("SEU PESO");

        lblAltura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAltura.setText("SUA ALTURA");

        lblSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubTitulo.setText("CALCULE O SEU IMC");

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc.png"))); // NOI18N
        btnCalcular.setToolTipText("CALCULAR O IMC");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/borracha.png"))); // NOI18N
        btnApagar.setToolTipText("APAGAR CONSULTA");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/sair.png"))); // NOI18N
        btnSair.setToolTipText("SAIR DO PROGRAMA");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblImc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblImc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImc.setText("SEU IMC");

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblSubTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnCalcular)
                        .addGap(47, 47, 47)
                        .addComponent(btnApagar)
                        .addGap(39, 39, 39)
                        .addComponent(btnSair))
                    .addComponent(lblImc, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(419, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        //CRIANDO FUNÇÃO LIMPAR
        txtPeso.setText("");
        txtAltura.setText("");
        lblImc.setText("SEU IMC");
        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/imc_tabela.jpg")));
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       // Criando função sair do app
        int sair = JOptionPane.showConfirmDialog(null, "DESEJA SAIR DO PROGRAMA?", "SOLICITAÇÃO DE SAIDA", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
        this.dispose();
            
            
        }    
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraImc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblImc;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
