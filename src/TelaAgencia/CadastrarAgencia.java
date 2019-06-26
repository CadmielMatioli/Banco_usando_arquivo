/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaAgencia;

import RegraDeNegocio.Agencia;
import Telas.Menu;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Senai
 */
public class CadastrarAgencia extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAgencia
     */
    public CadastrarAgencia() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnomeAgencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtenderecoAgencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnumeroEndeAgencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbairroAgencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcidadeAgencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtestadoAgencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnumeroAgencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Agência");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(155, 31, 203));
        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, -1, -1));

        txtnomeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeAgenciaActionPerformed(evt);
            }
        });
        jPanel2.add(txtnomeAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 176, 700, -1));

        jLabel2.setForeground(new java.awt.Color(155, 31, 203));
        jLabel2.setText("Endereço:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 205, -1, -1));
        jPanel2.add(txtenderecoAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 228, 541, -1));

        jLabel3.setForeground(new java.awt.Color(155, 31, 203));
        jLabel3.setText("número:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 205, -1, -1));
        jPanel2.add(txtnumeroEndeAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 228, 137, -1));

        jLabel4.setForeground(new java.awt.Color(155, 31, 203));
        jLabel4.setText("Bairro:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 257, -1, -1));

        txtbairroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbairroAgenciaActionPerformed(evt);
            }
        });
        jPanel2.add(txtbairroAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 280, 264, -1));

        jLabel5.setForeground(new java.awt.Color(155, 31, 203));
        jLabel5.setText("Cidade:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 257, -1, -1));
        jPanel2.add(txtcidadeAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 280, 211, -1));

        jLabel6.setForeground(new java.awt.Color(155, 31, 203));
        jLabel6.setText("Estado:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 257, -1, -1));
        jPanel2.add(txtestadoAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 280, 185, -1));

        jLabel7.setForeground(new java.awt.Color(155, 31, 203));
        jLabel7.setText("Numero da Agência:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 309, -1, -1));

        txtnumeroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroAgenciaActionPerformed(evt);
            }
        });
        jPanel2.add(txtnumeroAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 332, 696, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botão Cadastrar.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDoubleBuffered(true);
        jButton1.setFocusCycleRoot(true);
        jButton1.setFocusTraversalPolicyProvider(true);
        jButton1.setHideActionText(true);
        jButton1.setInheritsPopupMenu(true);
        jButton1.setSelected(true);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 125, 36));

        jToggleButton1.setBackground(new java.awt.Color(102, 0, 204));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botao Voltar Cadastro Azul.png"))); // NOI18N
        jToggleButton1.setText("Voltar");
        jToggleButton1.setAutoscrolls(true);
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setDoubleBuffered(true);
        jToggleButton1.setFocusCycleRoot(true);
        jToggleButton1.setFocusTraversalPolicyProvider(true);
        jToggleButton1.setHideActionText(true);
        jToggleButton1.setInheritsPopupMenu(true);
        jToggleButton1.setVerifyInputWhenFocusTarget(false);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 128, 36));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(155, 31, 203));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro de Agência");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 66, 278, 42));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Lado.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeAgenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        Agencia ag = new Agencia();
        if (!this.txtnomeAgencia.getText().equals("")
                && !this.txtnumeroAgencia.getText().equals("")
                && !this.txtnumeroEndeAgencia.getText().equals("")
                && !this.txtcidadeAgencia.getText().equals("")
                && !this.txtenderecoAgencia.getText().equals("")
                && !this.txtbairroAgencia.getText().equals("")
                && !this.txtestadoAgencia.getText().equals("")) {
            ag.setNomeBanco(this.txtnomeAgencia.getText());
            ag.setNumeroAgencia(this.txtnumeroAgencia.getText());
            ag.setNumeroPredio(this.txtnumeroEndeAgencia.getText());
            ag.setCidadeAgencia(this.txtcidadeAgencia.getText());
            ag.setEnderecoBanco(this.txtenderecoAgencia.getText());
            ag.setBairroAgencia(this.txtbairroAgencia.getText());
            ag.setEstadoAgencia(this.txtestadoAgencia.getText());
            int i = JOptionPane.showConfirmDialog(rootPane, "Deseja salvar essas informações?");
            if (i == 0) {
                try {
                    ag.cadastrar();
                    txtnomeAgencia.setText("");
                    txtnumeroAgencia.setText("");
                    txtnumeroEndeAgencia.setText("");
                    txtcidadeAgencia.setText("");
                    txtenderecoAgencia.setText("");
                    txtbairroAgencia.setText("");
                    txtestadoAgencia.setText("");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao salvar",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(rootPane, "Salvou!!!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não Salvo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Existe campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    private void txtbairroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbairroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbairroAgenciaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtnumeroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroAgenciaActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtbairroAgencia;
    private javax.swing.JTextField txtcidadeAgencia;
    private javax.swing.JTextField txtenderecoAgencia;
    private javax.swing.JTextField txtestadoAgencia;
    private javax.swing.JTextField txtnomeAgencia;
    private javax.swing.JTextField txtnumeroAgencia;
    private javax.swing.JTextField txtnumeroEndeAgencia;
    // End of variables declaration//GEN-END:variables
}
