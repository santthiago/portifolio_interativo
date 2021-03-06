package br.com.senac.portifolio;

/**
 * criação do jogo jokenpô
 *
 * @author https://github.com/santthiago
 */
public class Jokenpo extends javax.swing.JFrame {

    int jogador;

    /**
     *
     */
    public void jogar() {

        // crinado o metodo aleatorio para o computador
        int sorteio = (int) (Math.random() * 3 + 1);
        switch (sorteio) {
            case 1:
                lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_pedra_b.png")));
                break;
            case 2:
                lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_papel_b.png")));
                break;
            case 3:
                lblComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_tesoura_b.png")));
                break;
        }

        //CRIANDO A LOGICA DO VENCEDOR
        if (jogador != sorteio) {
            if ((jogador == 1 && sorteio == 3) || (jogador == 2 && sorteio == 1) || (jogador == 3 && sorteio == 2)) {
                lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_jogador_vence.png")));
                lblJokenpo.setText("Jo - KEn -PO !!");
                lblResposta.setText("JOGADOR VENCEU");
            } else {
                lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_computador_vence.png")));
                lblJokenpo.setText("Jo - KEn -PO !!");
                lblResposta.setText("COMP VENCEU");
            }
        } else {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_empate.png")));
            lblJokenpo.setText("Jo - KEn -PO !!");
            lblResposta.setText("EMPATE");
        }

    }

    /**
     * metodo limpar
     *
     * public void limpar(){ lblResultado.setIcon(null);
     * lblResposta.setText(null); lblJokenpo.setText(null);
     * lblJogador.setIcon(null); lblComputador.setIcon(null); }
     */
    /**
     * Creates new form Jokenpo
     */
    public Jokenpo() {
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

        btnPedra = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btnTesoura = new javax.swing.JButton();
        lblJokenpo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblComputador = new javax.swing.JLabel();
        lblJogador = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblResposta = new javax.swing.JLabel();
        lblBase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JO-KEn-PÔ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPedra.setBackground(new java.awt.Color(255, 204, 0));
        btnPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_pedra.png"))); // NOI18N
        btnPedra.setToolTipText("SELECIONAR PEDRA");
        btnPedra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedraActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 105, 100));

        btnPapel.setBackground(new java.awt.Color(204, 255, 102));
        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_papel.png"))); // NOI18N
        btnPapel.setToolTipText("SELECIONAR PAPEL");
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });
        getContentPane().add(btnPapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 105, 105));

        btnTesoura.setBackground(new java.awt.Color(204, 153, 255));
        btnTesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_tesoura.png"))); // NOI18N
        btnTesoura.setToolTipText("SELECIONAR TESOURA");
        btnTesoura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesouraActionPerformed(evt);
            }
        });
        getContentPane().add(btnTesoura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 105, 105));

        lblJokenpo.setFont(new java.awt.Font("Cooper Std Black", 3, 36)); // NOI18N
        lblJokenpo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJokenpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 300, 40));

        jLabel2.setFont(new java.awt.Font("Cooper Std Black", 1, 36)); // NOI18N
        jLabel2.setText("ESCOLHA O SEU MOVIMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblComputador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 105, 105));

        lblJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 105, 105));

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 210, 210));

        lblResposta.setFont(new java.awt.Font("Cooper Std Black", 1, 24)); // NOI18N
        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 394, 270, 30));

        lblBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_base.jpg"))); // NOI18N
        getContentPane().add(lblBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        setSize(new java.awt.Dimension(636, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedraActionPerformed
        //CRIANDO METODO PARA PEDRA
        jogador = 1;
        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_pedra.png")));
        jogar();
    }//GEN-LAST:event_btnPedraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        //CRIANDO METODO PARA PAPEL
        jogador = 2;
        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_papel.png")));
        jogar();
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btnTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesouraActionPerformed
        //CRIANDO METODO PARA TESOURA
        jogador = 3;
        lblJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/jokenpo_tesoura.png")));
        jogar();
    }//GEN-LAST:event_btnTesouraActionPerformed

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
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPedra;
    private javax.swing.JButton btnTesoura;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblComputador;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblJokenpo;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
