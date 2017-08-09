package br.com.senac.portifolio;

import java.util.Random;

/**
 * CRIAÇÃO DE UMA ESTRUTURA RANDOMICA PARA SORTEIO DE UMA CARTA DE BARALHO
 * @author https://github.com/santthiago
 */
public class JogoDasCartas extends javax.swing.JFrame {

    /**
     *
     */
    public void sorteando() {
        String[] naipes = {"Espadas", "Paus", "Copas", "Ouros"};
        String[] faces = {"AZ", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Random sorteio = new Random();
        int indice_naipes = sorteio.nextInt(4);
        int indice_faces = sorteio.nextInt(faces.length);
        String face = faces[indice_faces];
        String naipe = naipes[indice_naipes];
        if (naipe == "Espadas" && face == "AZ") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/A.2.png")));

        } else if (naipe == "Espadas" && face == "2") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2.2.png")));

        } else if (naipe == "Espadas" && face == "3") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3.2.png")));

        } else if (naipe == "Espadas" && face == "4") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4.2.png")));

        } else if (naipe == "Espadas" && face == "5") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5.2.png")));

        } else if (naipe == "Espadas" && face == "6") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6.2.png")));

        } else if (naipe == "Espadas" && face == "7") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7.2.png")));

        } else if (naipe == "Espadas" && face == "8") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8.2.png")));

        } else if (naipe == "Espadas" && face == "9") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9.2.png")));

        } else if (naipe == "Espadas" && face == "10") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10.2.png")));

        } else if (naipe == "Espadas" && face == "J") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/J.2.png")));

        } else if (naipe == "Espadas" && face == "Q") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/Q.2.png")));

        } else if (naipe == "Espadas" && face == "K") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/K.2.png")));

        } else if (naipe == "Paus" && face == "AZ") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/A.1.png")));

        } else if (naipe == "Paus" && face == "2") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2.1.png")));

        } else if (naipe == "Paus" && face == "3") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3.1.png")));

        } else if (naipe == "Paus" && face == "4") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4.1.png")));

        } else if (naipe == "Paus" && face == "5") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5.1.png")));

        } else if (naipe == "Paus" && face == "6") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6.1.png")));

        } else if (naipe == "Paus" && face == "7") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7.1.png")));

        } else if (naipe == "Paus" && face == "8") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8.1.png")));

        } else if (naipe == "Paus" && face == "9") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9.1.png")));

        } else if (naipe == "Paus" && face == "10") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10.1.png")));

        } else if (naipe == "Paus" && face == "J") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/J.1.png")));

        } else if (naipe == "Paus" && face == "Q") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/Q.1.png")));

        } else if (naipe == "Paus" && face == "K") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/K.1.png")));

        } else if (naipe == "Copas" && face == "AZ") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/A.3.png")));

        } else if (naipe == "Copas" && face == "2") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2.3.png")));

        } else if (naipe == "Copas" && face == "3") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3.3.png")));

        } else if (naipe == "Copas" && face == "4") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4.3.png")));

        } else if (naipe == "Copas" && face == "5") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5.3.png")));

        } else if (naipe == "Copas" && face == "6") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6.3.png")));

        } else if (naipe == "Copas" && face == "7") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7.3.png")));

        } else if (naipe == "Copas" && face == "8") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8.3.png")));

        } else if (naipe == "Copas" && face == "9") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9.3.png")));

        } else if (naipe == "Copas" && face == "10") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10.3.png")));

        } else if (naipe == "Copas" && face == "J") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/J.3.png")));

        } else if (naipe == "Copas" && face == "Q") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/Q.3.png")));

        } else if (naipe == "Copas" && face == "K") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/K.3.png")));

        } else if (naipe == "Ouros" && face == "AZ") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/A.4.png")));

        } else if (naipe == "Ouros" && face == "2") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2.4.png")));

        } else if (naipe == "Ouros" && face == "3") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3.4.png")));

        } else if (naipe == "Ouros" && face == "4") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/4.4.png")));

        } else if (naipe == "Ouros" && face == "5") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/5.4.png")));

        } else if (naipe == "Ouros" && face == "6") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/6.4.png")));

        } else if (naipe == "Ouros" && face == "7") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/7.4.png")));

        } else if (naipe == "Ouros" && face == "8") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/8.4.png")));

        } else if (naipe == "Ouros" && face == "9") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/9.4.png")));

        } else if (naipe == "Ouros" && face == "10") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/10.4.png")));

        } else if (naipe == "Ouros" && face == "J") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/J.4.png")));

        } else if (naipe == "Ouros" && face == "Q") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/Q.4.png")));

        } else if (naipe == "Ouros" && face == "K") {
            lblCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/K.4.png")));
        }
    }

    /**
     *
     */
    public JogoDasCartas() {
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

        lblCarta = new javax.swing.JLabel();
        btnSorteio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SORTEIO DE CARTAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 100, 160));

        btnSorteio.setText("SORTEAR +1");
        btnSorteio.setToolTipText("INICIE O SORTEIO");
        btnSorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSorteio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/baralho_base.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        setSize(new java.awt.Dimension(637, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteioActionPerformed
        sorteando();
    }//GEN-LAST:event_btnSorteioActionPerformed

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
                java.util.logging.Logger.getLogger(JogoDasCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(JogoDasCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(JogoDasCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(JogoDasCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new JogoDasCartas().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSorteio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCarta;
    // End of variables declaration//GEN-END:variables
}
