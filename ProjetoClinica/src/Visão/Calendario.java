/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;

/**
 *
 * @author vinic
 */
public class Calendario extends javax.swing.JFrame {

    /**
     * Creates new form Calendario
     */
    public Calendario() {
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

        jLabelCadastrodePaciente = new javax.swing.JLabel();
        jButtonProximo3 = new javax.swing.JButton();
        jButtonSalvar3 = new javax.swing.JButton();
        jButtonSalvar4 = new javax.swing.JButton();
        jButtonSalvar5 = new javax.swing.JButton();
        jButtonSalvar6 = new javax.swing.JButton();
        jButtonSalvar7 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCadastrodePaciente.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabelCadastrodePaciente.setText("CALENDÁRIO");

        jButtonProximo3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonProximo3.setText("Inicio");
        jButtonProximo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximo3jButtonProximoActionPerformed(evt);
            }
        });

        jButtonSalvar3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar3.setText("Avaliação");
        jButtonSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar3ActionPerformed(evt);
            }
        });

        jButtonSalvar4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar4.setText("Agendamento");
        jButtonSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar4ActionPerformed(evt);
            }
        });

        jButtonSalvar5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar5.setText("Cadastro");
        jButtonSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar5ActionPerformed(evt);
            }
        });

        jButtonSalvar6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar6.setText("Evolução");
        jButtonSalvar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar6ActionPerformed(evt);
            }
        });

        jButtonSalvar7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar7.setText("Imprimir");
        jButtonSalvar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(567, Short.MAX_VALUE)
                .addComponent(jLabelCadastrodePaciente)
                .addGap(434, 434, 434))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalvar6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar5, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar7, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProximo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastrodePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar5)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar4)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar6)
                        .addGap(25, 25, 25)
                        .addComponent(jButtonSalvar7)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonProximo3)
                        .addGap(0, 481, Short.MAX_VALUE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProximo3jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximo3jButtonProximoActionPerformed
        TelaPrincipal tela = new TelaPrincipal ();
        tela.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButtonProximo3jButtonProximoActionPerformed

    private void jButtonSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar3ActionPerformed
        Avaliação tela = new Avaliação ();
        tela.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButtonSalvar3ActionPerformed

    private void jButtonSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar4ActionPerformed
        Agendamento tela = new Agendamento ();
        tela.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButtonSalvar4ActionPerformed

    private void jButtonSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar5ActionPerformed
        Cadastro tela = new Cadastro ();
        tela.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButtonSalvar5ActionPerformed

    private void jButtonSalvar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar6ActionPerformed
        Evoluçao tela = new Evoluçao ();
        tela.setVisible(true);
        dispose ();
    }//GEN-LAST:event_jButtonSalvar6ActionPerformed

    private void jButtonSalvar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar7ActionPerformed
        Imprimir tela = new Imprimir ();
        tela.setVisible (true);
        dispose ();
    }//GEN-LAST:event_jButtonSalvar7ActionPerformed

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProximo3;
    private javax.swing.JButton jButtonSalvar3;
    private javax.swing.JButton jButtonSalvar4;
    private javax.swing.JButton jButtonSalvar5;
    private javax.swing.JButton jButtonSalvar6;
    private javax.swing.JButton jButtonSalvar7;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabelCadastrodePaciente;
    // End of variables declaration//GEN-END:variables
}
