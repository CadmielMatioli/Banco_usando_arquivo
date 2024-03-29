/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaAgencia;

import RegraDeNegocio.Agencia;
import RegraDeNegocio.Usuario;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Senai
 */
public class EditarAgencias extends javax.swing.JFrame {

    private Agencia u;

    public Agencia getU() {
        return u;
    }

    public void setU(Agencia u) {
        this.u = u;
        txtnomeBanco.setText(u.getNomeBanco());
        txtbairroAgencia.setText(u.getBairroAgencia());
        txtestadoAgencia.setText(u.getEstadoAgencia());
        txtnumeroPredio.setText(u.getNumeroPredio());
        txtnumeroagenciaBanco.setText(u.getNumeroAgencia());
        txtcidadeAgencia.setText(u.getCidadeAgencia());
        txtenderecoBanco.setText(u.getEnderecoBanco());
    }

    /**
     * Creates new form EditarAgencias
     */
    public EditarAgencias() {
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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnomeBanco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtenderecoBanco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbairroAgencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnumeroagenciaBanco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnumeroPredio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcidadeAgencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtestadoAgencia = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Agência");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 580));

        jLabel1.setForeground(new java.awt.Color(155, 31, 203));
        jLabel1.setText("Nome:");

        txtnomeBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeBancoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(155, 31, 203));
        jLabel2.setText("Endereço:");

        txtenderecoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoBancoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(155, 31, 203));
        jLabel3.setText("Bairro:");

        jLabel4.setForeground(new java.awt.Color(155, 31, 203));
        jLabel4.setText("Número da Agência:");

        jLabel5.setForeground(new java.awt.Color(155, 31, 203));
        jLabel5.setText("Numero:");

        jLabel6.setForeground(new java.awt.Color(155, 31, 203));
        jLabel6.setText("Cidade:");

        jLabel7.setForeground(new java.awt.Color(155, 31, 203));
        jLabel7.setText("Estado:");

        btnsalvar.setBackground(new java.awt.Color(204, 51, 0));
        btnsalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botao Editar Vermelho.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.setAutoscrolls(true);
        btnsalvar.setBorder(null);
        btnsalvar.setContentAreaFilled(false);
        btnsalvar.setDoubleBuffered(true);
        btnsalvar.setFocusCycleRoot(true);
        btnsalvar.setFocusTraversalPolicyProvider(true);
        btnsalvar.setHideActionText(true);
        btnsalvar.setVerifyInputWhenFocusTarget(false);
        btnsalvar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnsalvarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(138, 5, 190));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Editar Agências");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Botao Voltar Vermelho.png"))); // NOI18N
        btnVoltar.setAutoscrolls(true);
        btnVoltar.setBorder(null);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setDoubleBuffered(true);
        btnVoltar.setFocusPainted(false);
        btnVoltar.setFocusTraversalPolicyProvider(true);
        btnVoltar.setHideActionText(true);
        btnVoltar.setInheritsPopupMenu(true);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtenderecoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtnumeroPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtnumeroagenciaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbairroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcidadeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtestadoAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumeroPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtenderecoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbairroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcidadeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtestadoAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnumeroagenciaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar))
                .addGap(115, 115, 115))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ladoedit.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomeBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeBancoActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        Agencia ag = new Agencia();
        ag.setNomeBanco(this.txtnomeBanco.getText());
        ag.setNumeroAgencia(this.txtnumeroagenciaBanco.getText());
        ag.setNumeroPredio(this.txtnumeroPredio.getText());
        ag.setCidadeAgencia(this.txtcidadeAgencia.getText());
        ag.setEnderecoBanco(this.txtenderecoBanco.getText());
        ag.setEstadoAgencia(this.txtestadoAgencia.getText());
        ag.setBairroAgencia(this.txtbairroAgencia.getText());
        int i = JOptionPane.showConfirmDialog(rootPane, "Deseja salvar essas informações?");
        if (i == 0) {
            try {
                ag.editarAgencia();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(rootPane, "Salvou!!!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Não Salvo",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void txtenderecoBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoBancoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ListarAgencias l = new ListarAgencias();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnsalvarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnsalvarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalvarAncestorAdded

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbairroAgencia;
    private javax.swing.JTextField txtcidadeAgencia;
    private javax.swing.JTextField txtenderecoBanco;
    private javax.swing.JTextField txtestadoAgencia;
    private javax.swing.JTextField txtnomeBanco;
    private javax.swing.JTextField txtnumeroPredio;
    private javax.swing.JTextField txtnumeroagenciaBanco;
    // End of variables declaration//GEN-END:variables
}
